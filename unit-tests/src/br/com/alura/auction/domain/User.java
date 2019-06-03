package br.com.alura.auction.domain;

public class User {

	private int id;
	private String name;
	
	public User(String name) {
		this(0, name);
	}
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
