package com.business.blc.elc;

public class onlineShopping {
 int productId;
 String productName;
 double price;
 int quantity;
public int getproductId() {
	 return productId;
 }
 public String getproductName() {
	 return productName;
 }
 public double getprice() {
	 return price;
 }
 public int getquantity() {
	 return quantity;
 }
 public void setproductId(int i) {
	 productId=i;
 }
 public void setproductName(String name) {
	 productName=name;
 }
 public void setprice(double d) {
	 price=d;
 }
 public void setquantity(int Quantity ) {
	 quantity=Quantity;
 }
 public String getshoppingCart() {
	 return "Product Id:"+productId+"\nProduct Name:"+productName+"\nPrice:"+price+"\nquantity:"+quantity;
 }
}
