package com.hefei.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hefei.bean.Book;

public interface BookService {
	
	public List<Book> selectBook(Map<String, Object> map);
	
	public List<Map<String, Object>> selectFXK();
	
	public Book selectHX(@Param("bid")Integer bid);
	
	public int updateBook(Book book);
	
}
