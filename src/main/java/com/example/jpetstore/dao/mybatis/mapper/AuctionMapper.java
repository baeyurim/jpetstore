package com.example.jpetstore.dao.mybatis.mapper;

import java.util.List;

import com.example.jpetstore.domain.Account;
import com.example.jpetstore.domain.Auction;

public interface AuctionMapper {
	List<Account> getAuctionApplierList(String aucId);
	List<Auction> getAuctionList(String aucId);
	
	Auction getAuctionByAucId(String aucId);
	
	void insertItem(Auction auc);
	void insertAccount(Auction auc);
	void insertAuction(Auction auc);
	void updateItem(Auction auc);
	void updateAccount(Auction auc);
	void updateAuction(Auction auc);
	void deleteItem(Auction auc);
	void deleteAccount(Auction auc);
	void deleteAuction(Auction auc);
	void completeItem(Auction auc);
	void completeAccount(Auction auc);
	void completeAuction(Auction auc);
}
