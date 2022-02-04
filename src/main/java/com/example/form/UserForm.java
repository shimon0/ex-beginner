package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserForm {
	String name;
	Integer age;
	String comment;
	@NotBlank(message ="名前は必須です")
	public String getName() {
		return name;
	}
	@NotNull(message="年齢は必須です")
	public void setName(String name) {
		this.name = name;
	}
	@Size(min=1,max=127,message="コメントは１文字異常127文字以内で記載してください")
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
