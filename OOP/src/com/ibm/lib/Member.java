package com.ibm.lib;
public class Member {
	private int mid;
	private String name;
	private Book bk;
	
	public Book getBk() {
		return bk;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}
	public Member() {		
	}
	public Member(int mid, String name) {
		super();
		this.mid = mid;
		this.name = name;
	}
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void status() throws LibException {
		if(bk == null) {
			System.out.println(name+" hasn't issued any book");
		}
		else {
			throw new LibException(name+" has issued "+ bk.getTitle());
			//System.out.println(name+" has issued "+ bk.getTitle());
		}
	}
	
}
