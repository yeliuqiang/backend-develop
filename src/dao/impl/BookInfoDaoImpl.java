package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.BookInfoDao;
import entity.BookInfo;

public class BookInfoDaoImpl extends HibernateDaoSupport implements BookInfoDao {

	@Override
	public List<BookInfo> getList() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from BookInfo b inner join fetch b.bookType");
	}
	@Override
	public void add(BookInfo bookInfo) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(bookInfo);
	}
	@Override
	public void update(BookInfo bookInfo) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(bookInfo);
	}
	@Override
	public BookInfo getById(int bookId) {
		// TODO Auto-generated method stub
		return (BookInfo) this.getHibernateTemplate().get(BookInfo.class, bookId);
	}
	@Override
	public void del(int bookId) {
		// TODO Auto-generated method stub
	BookInfo bookInfo=(BookInfo)this.getHibernateTemplate().load(BookInfo.class, bookId);
	this.getHibernateTemplate().delete(bookInfo);
	}
}
