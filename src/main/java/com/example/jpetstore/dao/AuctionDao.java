package com.example.jpetstore.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.jpetstore.domain.Account;
import com.example.jpetstore.domain.Auction;

public interface AuctionDao {
	Auction getAuction(String aucId) throws DataAccessException;
	void insertAuction(Auction auc) throws DataAccessException;
	void updateAuction(Auction auc) throws DataAccessException;
	void deleteAuction(Auction auc) throws DataAccessException;
	
	List<Account> getShareApplierList() throws DataAccessException;
	List<Auction> getAuctionList() throws DataAccessException;

}
