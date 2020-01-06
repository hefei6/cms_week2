package com.hefei.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hefei.bean.Book;

public interface BookMapper {
	
	public int insertBook(Book book);
	
	public int insertErro(@Param("bid")Integer bid,@Param("errorinfo")Integer errorinfo);
	
	public List<Book> selectBook(Map<String, Object> map);
	
	public List<Map<String, Object>> selectFXK();
	
	public Book selectHX(@Param("bid")Integer bid);
	
	public int updateBook(Book book);
	
}
