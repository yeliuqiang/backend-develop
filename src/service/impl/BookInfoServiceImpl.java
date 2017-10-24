package service.impl;

import java.util.List;

import dao.BookInfoDao;
import entity.BookInfo;
import service.BookInfoService;

public class BookInfoServiceImpl implements
		BookInfoService {
          private BookInfoDao bookInfoDao;
	
	public void setBookInfoDao(BookInfoDao bookInfoDao) {
		this.bookInfoDao = bookInfoDao;
	}
    @Override
    public void update(BookInfo bookInfo) {
    // TODO Auto-generated method stub
               bookInfoDao.update(bookInfo);
    }
      @Override
    public void add(BookInfo bookInfo) {
    // TODO Auto-generated method stub
                bookInfoDao.add(bookInfo);
    }
     @Override
    public void del(int bookId) {
    // TODO Auto-generated method stub
       bookInfoDao.del(bookId);
    }
    @Override
    public BookInfo getById(int bookId) {
    // TODO Auto-generated method stub
    return bookInfoDao.getById(bookId);
    }
	@Override
	public List<BookInfo> getList() {
		// TODO Auto-generated method stub
		return bookInfoDao.getList();
	}
   
}
