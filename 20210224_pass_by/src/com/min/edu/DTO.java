package com.min.edu;

/**
 * DTO : Data Transfer Object <br>
 * = VO
 * 
 * @author woon
 */
public class DTO {

	private String name;
	private int age;

	public DTO(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "DTO [name=" + name + ", age=" + age + "]";
	}
}
