package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class SiteUser {
	
	@Id //主キー
	//DBのidentity列を使用して、キーを自動採番(strategyが無いとautoになる)
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	
	@NotBlank
	@Size(min = 2, max = 20)
	private String user_name;
	
	@NotBlank
	@Email
	private String user_email;
	
	@Size(min = 4, max = 255)
	private String user_password;
}
