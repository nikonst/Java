package com.nikonst;

public class Voter {
	
	private String name;
	private String surname;
	private String vote;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setVote(String vote) {
		this.vote = vote;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getVote() {
		return vote;
	}
	
}
