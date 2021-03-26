package com.ibm.lib;

public class Book {
	private int isbn;
	private String title;
	private Member mbr;
	
	public Book(){		
	}
	public Book(int isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void status() throws LibException {
		if(mbr==null) {
			System.out.println(title+" isn't issued to any member");
		}
		else {
			throw new LibException(title+ " is issued to "+mbr.getName());
			//System.out.println(title+ " is issued to "+mbr.getName());
		}
	}
	
	public void issue(Member mbr) throws LibException {
		
		if(mbr.getBk()==null) {
			this.mbr=mbr;
			mbr.setBk(this);
		}
		
		else {
			throw new LibException(title+" Can't be issued ");
			//System.out.println(title+" Can't be issued ");
		}
	}
	public void returnBook(Member mbr) throws LibException {
		if(mbr.getBk()!=null) {
			this.mbr=null;
			mbr.setBk(null);
		}
		else if(!this.mbr.getName().equals(mbr.getName())) {
			System.out.println();
		}
		else {
			throw new LibException("Hello");
			//System.out.println(title+" hasn't been issued ");
		}
	}
}
