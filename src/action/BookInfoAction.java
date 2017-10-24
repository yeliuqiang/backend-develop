package action;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import service.BookInfoService;
import service.BookTypeService;

import com.opensymphony.xwork2.ActionSupport;

import entity.BookInfo;
import entity.BookType;

public class BookInfoAction extends ActionSupport {
           /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private BookInfoService bookInfoService;
           private BookTypeService bookTypeService;
           private List<BookInfo> list;
           private BookInfo bookInfo;
           private BookType bookType;
           private int bookId;
           private int id;
           private List<BookType> list2;
           
		public BookTypeService getBookTypeService() {
			return bookTypeService;
		}
		public void setBookTypeService(BookTypeService bookTypeService) {
			this.bookTypeService = bookTypeService;
		}
		public BookInfo getBookInfo() {
			return bookInfo;
		}
		public void setBookInfo(BookInfo bookInfo) {
			this.bookInfo = bookInfo;
		}
		public BookType getBookType() {
			return bookType;
		}
		public void setBookType(BookType bookType) {
			this.bookType = bookType;
		}
		public List<BookType> getList2() {
			return list2;
		}
		public void setList2(List<BookType> list2) {
			this.list2 = list2;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public BookInfoService getBookInfoService() {
			return bookInfoService;
		}
		public void setBookInfoService(BookInfoService bookInfoService) {
			this.bookInfoService = bookInfoService;
		}
		public List<BookInfo> getList() {
			return list;
		}
		public void setList(List<BookInfo> list) {
			this.list = list;
		}
           
		public String list(){
			list=bookInfoService.getList();
			return SUCCESS;
		}
		public String add(){
			list2=bookTypeService.getList();
			return "add";
		}
	    public void doadd() throws IOException {
	    	HttpServletResponse response=ServletActionContext.getResponse();
	    	response.setContentType("text/html;charset=utf-8");
    	   String bookCode= "Bk"+new SimpleDateFormat("yyyyMMdd").format(new Date());
  	       bookInfo.setBookCode(bookCode);
	    	bookInfo.setPublishDate(new Date());
	    	bookInfoService.add(bookInfo);
	    	try {
				response.getWriter().print("<script>alert('添加成功');location.href='listbook';</script>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				response.getWriter().print("<script>alert('添加失败');location.href='listbook';</script>");
			}
	    	
	    	
	    }
	    public String del(){
			try{
				bookInfo=bookInfoService.getById(bookId);
				bookInfoService.del(bookId);
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
			return "list";
		}
	    public String edit(){
			bookInfo=bookInfoService.getById(bookId);
			list2=bookTypeService.getList();
			return "edit";
		}
		
	    public String update() {
	    	bookInfoService.update(bookInfo);
	    	this.addActionMessage("修改成功");
	    	this.addActionMessage("修改失败");
	    	return list();
	    }
}
