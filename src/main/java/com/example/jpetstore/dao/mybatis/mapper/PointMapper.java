package com.example.jpetstore.dao.mybatis.mapper;

import java.util.List;

import com.example.jpetstore.domain.PointHistory;

public interface PointMapper {
	List<PointHistory> getPointHistory(String userName);
	
}
