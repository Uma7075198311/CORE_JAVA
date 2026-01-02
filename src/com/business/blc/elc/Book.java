package com.business.blc.elc;

public class Book {
	int bookId;
	String title;
	String author;
    double price;
	 
	 public int getbookId() {
		 return bookId;
	 }
	 public String gettitle() {
		 return title;
	 }
	 public String getauthor() {
		 return author;
	 }
	 public double getprice() {
		 return price;
	 }
	 public void setbookId(int i) {
		 bookId=i;
	 }
	 public void settitle(String t) {
		 title=t;
	 }
	 public void setauthor(String a) {
		 author=a;
	 }
	 public void setprice(double d) {
		 price=d;
	 }
	 public String getLibrary() {
		 return "BookId:"+bookId+"\nTitle:"+title+"\nAuthor:"+author+"\nPrice:"+price;
	 }
}
