package com.ss.pojo;

import java.io.Serializable;

public class Hero implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1898840246386482764L;
	private Integer id;
	private String name;
	private Integer hp;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	
}
