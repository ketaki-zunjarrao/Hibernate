package com.techlabs.creational.factory.method.ex1;

public class ContactPage extends Page {

	public ContactPage(String details) {
		super(details);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void load() {
		System.out.println(this.details+"page is loading");	}
}
