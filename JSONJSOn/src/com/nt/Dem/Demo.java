package com.nt.Dem;

import org.codehaus.jackson.annotate.JsonIgnore;

public class Demo 
{
	private String namel;
	private String add;
	private int id;
	@JsonIgnore
	private int number;
	public String getNamel() {
		return namel;
	}
	public void setNamel(String namel) {
		this.namel = namel;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	

}
