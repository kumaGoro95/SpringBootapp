package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SiteUser;

public interface SiteUserRepository extends JpaRepository<SiteUser, Long> {
	//usernameでユーザーを検索
	SiteUser findByUser_name(String user_name);
	//同名のユーザーが存在するか判定
	boolean existsByUser_name(String user_name);

}
