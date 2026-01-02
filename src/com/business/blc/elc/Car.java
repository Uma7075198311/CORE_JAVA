package com.business.blc.elc;

public class Car {
	int carId;
	String brand;
	String model;
    double price;
	 
	 public int getcarId() {
		 return carId;
	 }
	 public String getbrand() {
		 return brand;
	 }
	 public String getmodel() {
		 return model;
	 }
	 public double getprice() {
		 return price;
	 }
	 public void setcarId(int i) {
		 carId=i;
	 }
	 public void setbrand(String b) {
		 brand=b;
	 }
	 public void setmodel(String m) {
		 model=m;
	 }
	 public void setprice(double d) {
		 price=d;
	 }
	 public String getCarRentalService() {
		 return "CarId:"+carId+"\nBrand:"+brand+"\nModel:"+model+"\nPrice:"+price;
	 }
}
