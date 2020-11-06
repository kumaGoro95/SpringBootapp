package com.example.demo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.SiteUser;
import com.example.demo.repository.SiteUserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	//SiteUserRepositoryのDI
	private final SiteUserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String user_name) throws UsernameNotFoundException{
		SiteUser user =  userRepository.findByUser_name(user_name);
		if(user == null) {
			//ユーザーが見つからなければ、SpringSecurityの以下の例外をthrowする。
			throw new UsernameNotFoundException(user_name + " not found");
		}
		return createUserDetails(user);
	}
	
	public User createUserDetails(SiteUser user) {
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>(); //HashSet・・・１つのオブジェクトを格納する
		
		return new User(user.getUser_name(), user.getUser_password(), grantedAuthorities);
	}
}
