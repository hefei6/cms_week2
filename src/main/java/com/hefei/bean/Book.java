package com.hefei.bean;

public class Book {
	
	private Integer bid;
	private String bname;
	private String btype;
	private String phone;
	private String author;
	private Integer hots;
	private String picurl;
	private String bdate;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bid, String bname, String btype, String phone, String author, Integer hots, String picurl,
			String bdate) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btype = btype;
		this.phone = phone;
		this.author = author;
		this.hots = hots;
		this.picurl = picurl;
		this.bdate = bdate;
	}
	public Book(Integer bid, String bname, String btype, String phone, String author, Integer hots) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btype = btype;
		this.phone = phone;
		this.author = author;
		this.hots = hots;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getHots() {
		return hots;
	}
	public void setHots(Integer hots) {
		this.hots = hots;
	}
	public String getPicurl() {
		return picurl;
	}
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", btype=" + btype + ", phone=" + phone + ", author=" + author
				+ ", hots=" + hots + ", picurl=" + picurl + ", bdate=" + bdate + "]";
	}
	
}
