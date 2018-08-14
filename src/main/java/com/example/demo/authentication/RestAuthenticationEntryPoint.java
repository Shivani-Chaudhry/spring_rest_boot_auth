package com.example.demo.authentication;

import com.example.demo.bean.BeanClass;

public class RestAuthenticationEntryPoint {
BeanClass b=new BeanClass();
public void auth(String username)
{
	if(b.getName().isEmpty())
	{
		System.out.println("Name cant be null");
	}
		
}
	
	
	
	
}
