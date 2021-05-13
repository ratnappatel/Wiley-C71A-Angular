package com.wiley.pojo;

import java.io.Serializable;

public class FBUser implements Serializable
{

	//convert them in byte to write in flat file... in OS
	private int id;
	private int groups,friends;
	private String name;
	private transient int likes;
	public FBUser() {
		// TODO Auto-generated constructor stub
	}
	public FBUser(int id, int groups, int friends, String name,int likes) {
		super();
		this.id = id;
		this.groups = groups;
		this.friends = friends;
		this.name = name;
		this.likes=likes;
	}
	
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGroups() {
		return groups;
	}
	public void setGroups(int groups) {
		this.groups = groups;
	}
	public int getFriends() {
		return friends;
	}
	public void setFriends(int friends) {
		this.friends = friends;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "FBUser [id=" + id + ", groups=" + groups + ", friends=" + friends + ", name=" + name + ",  Likes "+likes+"]\n";
	}
	
	
	
}
