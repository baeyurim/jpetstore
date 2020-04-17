package com.example.jpetstore.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpetstore.dao.PointHistoryDao;
import com.example.jpetstore.dao.SequenceDao;
import com.example.jpetstore.dao.mybatis.mapper.LineItemMapper;
import com.example.jpetstore.dao.mybatis.mapper.OrderMapper;
import com.example.jpetstore.dao.mybatis.mapper.PointMapper;
import com.example.jpetstore.domain.LineItem;
import com.example.jpetstore.domain.Order;
import com.example.jpetstore.domain.PointHistory;
/*이거추가한거.*/
public class MybatisPointHistoryDao implements PointHistoryDao {

	
	@Autowired
	protected PointMapper pointMapper;

	@Autowired
	private SequenceDao sequenceDao;
	
	
	@Override
	public List<PointHistory> getPointListByUserName(String userName) throws DataAccessException {
		// TODO Auto-generated method stub
	    return pointMapper.getPointHistory(userName);
	}
	
	
	@Override
	@Transactional
	public void insertPointHistory(PointHistory p) throws DataAccessException {
		// TODO Auto-generated method stub
    	p.setPointId(sequenceDao.getNextId("pointnum"));
    	pointMapper.insertPointHistory(p);
    	for (int i = 0; i < p.getLinePoint().size(); i++) {
    		LinePoint linePoint = (LinePoint) p.getLinePoint().get(i);
    		linePoint.setPointId(p.getPointId());
    		linePointMapper.insertLineItem(linePoint);
    	}
	}



}
