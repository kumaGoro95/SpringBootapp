package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.Max;

import lombok.Data;

@Data
@Entity
@Table(name="user_info")
public class UserInfo{
	
	@Id //主キー
	private int id;
	
	private int user_gender;
	
	private int user_age;
	
	@Max(100)
	private String user_icon;
	
	@Max(100)
	private String money_records_name;
	
	@NotBlank
	private String created_at;
	
	@NotBlank
	private String updated_at;
	
	private boolean active = true;
}
