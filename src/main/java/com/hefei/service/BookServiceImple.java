package com.hefei.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hefei.bean.Book;
import com.hefei.mapper.BookMapper;

@Service
public class BookServiceImple implements BookService {
	
	@Autowired
	public BookMapper bMapper;

	public List<Book> selectBook(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return bMapper.selectBook(map);
	}

	public List<Map<String, Object>> selectFXK() {
		// TODO Auto-generated method stub
		return bMapper.selectFXK();
	}

	public Book selectHX(Integer bid) {
		// TODO Auto-generated method stub
		return bMapper.selectHX(bid);
	}

	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		return bMapper.updateBook(book);
	}

}
