package com.example.jpetstore.dao;

public interface ReviewDao{
	Review getReview(String revId) throws DataAccessException; 
	
	void updateReview(Review rev) throws DataAccessException; 
	void InsertReview(Review rev) throws DataAccessException; 
	void DeleteReview(Review rev) throws DataAccessException; 
	
	List<Account> getReviewList() throws DataAccessException;
	List<Review> getReviewList() throws DataAccessException; 
}
