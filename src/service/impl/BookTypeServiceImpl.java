package service.impl;

import java.util.List;

import service.BookTypeService;
import dao.BookTypeDao;
import entity.BookType;

public class BookTypeServiceImpl implements BookTypeService {
     private BookTypeDao bookTypeDao;
     
	public BookTypeDao getBookTypeDao() {
		return bookTypeDao;
	}

	public void setBookTypeDao(BookTypeDao bookTypeDao) {
		this.bookTypeDao = bookTypeDao;
	}

	@Override
	public List<BookType> getList() {
		// TODO Auto-generated method stub
		return bookTypeDao.getList();
	}

}
