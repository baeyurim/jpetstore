package com.example.jpetstore.dao;

public interface ShareDao {
	Share getShare(String shId) throws DataAccessException;
	void insertShare(Share s) throws DataAccessException;
	void updateShare(Share s) throws DataAccessException;
	void deleteShare(Share s) throws DataAccessException;
	
	List<Account> getShareApplierList() throws DataAccessException;
	List<Share> getShareList() throws DataAccessException;

}
