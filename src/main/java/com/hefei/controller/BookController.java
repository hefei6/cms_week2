package com.hefei.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bw.utils.StringUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hefei.bean.Book;
import com.hefei.service.BookService;
import com.hefei.utils.FileUtils;

@Controller
public class BookController {
	
	@Autowired
	public BookService bService;
	
	@RequestMapping("list")
	public String select(@RequestParam(defaultValue = "1")Integer pageNum,Model model,String mohu){
		
		PageHelper.startPage(pageNum, 3);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("mohu", mohu);
		List<Book> selectBook = bService.selectBook(map);
		PageInfo<Book> pageInfo = new PageInfo<Book>(selectBook);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("mohu", mohu);
		
		return "list";
	}
	
	@RequestMapping("selecthx")
	public String selecthx(Model model,Integer bid){
		Book map = bService.selectHX(bid);
		model.addAttribute("map", map);
		return "update";
	}
	
	@RequestMapping("lookimg")
	public void lookimg(String path,HttpServletRequest request,HttpServletResponse response){
		FileUtils.lookImg(path, request, response);
	}
	
	@RequestMapping("upd")
	public String update(MultipartFile myFile,Model model,Book book,String hot) throws IllegalStateException, IOException{
		
			if (!StringUtil.isNumber(hot)) {
				model.addAttribute("errohot", "热度格式输入错误");
				return "update";
			}else if(!StringUtil.judgeTelephoneIsOk(book.getPhone())){
				model.addAttribute("errophone", "手机格式输入错误");
				return "update";
			}else{
				String upload = FileUtils.upload(myFile);
				book.setPicurl(upload);
				book.setHots(Integer.parseInt(hot));
				bService.updateBook(book);
				return "redirect:list";
			}
	}
	
}
