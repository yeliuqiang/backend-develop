package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.BookTypeDao;
import entity.BookType;

public class BookTypeDaoImpl extends HibernateDaoSupport implements BookTypeDao {

	@Override
	public List<BookType> getList() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from BookType");
	}

}
