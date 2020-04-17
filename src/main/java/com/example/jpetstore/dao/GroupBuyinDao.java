package com.example.jpetstore.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.jpetstore.domain.Account;
import com.example.jpetstore.domain.GroupBuying;

public interface GroupBuyinDao {
	GroupBuying getGroupBuying(String gbId) throws DataAccessException;
	void insertGroupBuying(GroupBuying gb) throws DataAccessException;
	void updateGroupBuying(GroupBuying gb) throws DataAccessException;
	void deleteGroupBuying(GroupBuying gb) throws DataAccessException;
	
	List<Account> getGBApplierList() throws DataAccessException;
	List<Groupbuying> getGroupBuyingList() throws DataAccessException;

}
