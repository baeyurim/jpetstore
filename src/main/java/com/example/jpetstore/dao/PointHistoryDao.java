package com.example.jpetstore.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.jpetstore.domain.PointHistory;
/*�̰��߰��Ѱ�.*/
public interface PointHistoryDao {
	void insertPointHistory(PointHistory p) throws DataAccessException;
	List<PointHistory> getPointListByUserName(String userName) throws DataAccessException;
	
}
