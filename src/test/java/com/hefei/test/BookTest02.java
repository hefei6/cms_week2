package com.hefei.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.utils.IOUtils;
import com.bw.utils.StringUtil;
import com.hefei.bean.Book;
import com.hefei.mapper.BookMapper;

public class BookTest02 {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookMapper map = ac.getBean(BookMapper.class);
		
		List<Object[]> readFile = IOUtils.readFile("a.txt", "\t");
		for (Object[] objects : readFile) {
			System.out.println(Arrays.toString(objects));
			
			if (!StringUtil.isNumber(objects[5]+"")) {
				//insert into record (bid,errorinfo) values (objects[0],0)
				map.insertErro(Integer.parseInt(objects[0]+""), 0);
			}else if(!StringUtil.judgeTelephoneIsOk(objects[3]+"")){
				//insert into record (bid,errorinfo) values (objects[0],1)
				map.insertErro(Integer.parseInt(objects[0]+""), 1);
			}else{
				Book book = new Book(Integer.parseInt(objects[0]+""), objects[1]+"", objects[2]+"", objects[3]+"", objects[4]+"", Integer.parseInt(objects[5]+""));
				map.insertBook(book);
			}
			
		}
		
	}
	
}
