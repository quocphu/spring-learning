package com.app.learning.common.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Student {

	@Size( min=10, max=20, message="{name.length}")
	private String name;
	
	@Min(value=10, message="Min 10")
	@Max(value=12, message="Max 12")
	private Integer age;
	private String image;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	@Override
	public String toString(){
		return String.format("%s\t%d\t%s", this.name, this.age, this.image);
	}
}
