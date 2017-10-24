package entity;

import java.util.Date;

public class BookInfo {
   private int    bookId;
   private String bookCode;
   private BookType bookType;
   private String bookName;
   private String bookAuthor;
   private String publishPress;
   private Date publishDate;
   private int borrowed;
   private String createBy;
   private Date creationTime; 
   private Date lastUpdatetime;
   

public BookType getBookType() {
	return bookType;
}
public void setBookType(BookType bookType) {
	this.bookType = bookType;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookCode() {
	return bookCode;
}
public void setBookCode(String bookCode) {
	this.bookCode = bookCode;
}

public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public String getPublishPress() {
	return publishPress;
}
public void setPublishPress(String publishPress) {
	this.publishPress = publishPress;
}
public Date getPublishDate() {
	return publishDate;
}
public void setPublishDate(Date publishDate) {
	this.publishDate = publishDate;
}
public int getBorrowed() {
	return borrowed;
}
public void setBorrowed(int borrowed) {
	this.borrowed = borrowed;
}
public String getCreateBy() {
	return createBy;
}
public void setCreateBy(String createBy) {
	this.createBy = createBy;
}

public Date getCreationTime() {
	return creationTime;
}
public void setCreationTime(Date creationTime) {
	this.creationTime = creationTime;
}
public Date getLastUpdatetime() {
	return lastUpdatetime;
}
public void setLastUpdatetime(Date lastUpdatetime) {
	this.lastUpdatetime = lastUpdatetime;
}	
}
