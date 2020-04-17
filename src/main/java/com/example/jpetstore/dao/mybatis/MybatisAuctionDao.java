package com.example.jpetstore.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.example.jpetstore.dao.AuctionDao;
import com.example.jpetstore.dao.mybatis.mapper.AccountMapper;
import com.example.jpetstore.dao.mybatis.mapper.AuctionMapper;
import com.example.jpetstore.domain.Account;
import com.example.jpetstore.domain.Auction;

public class MybatisAuctionDao implements AuctionDao{

	@Autowired
	private AuctionMapper auctionMapper;
	
	@Override
	public Auction getAuction(String aucId) throws DataAccessException  {
		return auctionMapper.getAuctionByAucId(aucId);
	}

	@Override //경매 추가
	public void insertAuction(Auction auc)throws DataAccessException {
		auctionMapper.insertItem(auc);
		auctionMapper.insertAccount(auc);
		auctionMapper.insertAuction(auc);
	}

	@Override //경매수정
	public void updateAuction(Auction auc)throws DataAccessException {
		auctionMapper.updateItem(auc);
		auctionMapper.updateAccount(auc);
		auctionMapper.updateAuction(auc);		
	}

	@Override //경매삭제
	public void deleteAuction(Auction auc)throws DataAccessException {
		auctionMapper.deleteItem(auc);
		auctionMapper.deleteAccount(auc);
		auctionMapper.deleteAuction(auc);
	}

	
	@Override	//경매완료 추가 메소드
	public void completeAuction(Auction auc) throws DataAccessException{
		auctionMapper.completeItem(auc);
		auctionMapper.completeAccount(auc);
		auctionMapper.completeAuction(auc);
	}

	
	@Override //경매 지원자들의 list
	public List<Account> getShareApplierList(String applyerName)throws DataAccessException {
		return auctionMapper.getShareApplierList(applyerName);
	}

	@Override //경매list
	public List<Auction> getAuctionList(String aucId)throws DataAccessException {
		// TODO Auto-generated method stub
		return auctionMapper.getAuctionList(aucId);
	}
}
