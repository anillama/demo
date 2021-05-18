package com.bank.admin.controller.vo;

public class Dog {
	private int did;
	private String name;
	private String color;
	private int tail;
	

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public Dog() {
	}

	public Dog(String name, String color, int tail) {
		super();
		this.name = name;
		this.color = color;
		this.tail = tail;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", tail=" + tail + "]";
	}

}
