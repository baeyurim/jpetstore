package com.example.jpetstore.dao.mybatis.mapper;

import java.util.List;

import com.example.jpetstore.domain.LineItem;
import com.example.jpetstore.domain.LinePoint;

public interface linePointMapper {	

	  List<LineItem> getLineItemsByOrderId(int poId);

	  static void insertLineItem(LinePoint linePoint) {
		// TODO Auto-generated method stub
		
	}
	  void setPointId(LinePoint linePoint);
}
