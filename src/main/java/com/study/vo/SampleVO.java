package com.study.vo;

public class SampleVO {

	private String name;
	private double price;
	
	public SampleVO(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "SampleVO [name=" + name +", price =" + price +"]";
	}
}
