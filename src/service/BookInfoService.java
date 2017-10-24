package service;

import java.util.List;

import entity.BookInfo;

public interface BookInfoService {
   public List<BookInfo> getList();
   public void add(BookInfo bookInfo);
   public BookInfo getById(int bookId);
   public void update(BookInfo bookInfo);
   public void del(int bookId);
}
