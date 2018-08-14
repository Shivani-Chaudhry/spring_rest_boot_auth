package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.BeanClass;



public interface MedicineIntDAO {
	List<BeanClass> getAllMedicine();
	BeanClass getMedicineById(int medicineId);
	void addMedicine(BeanClass medicine);
	
	void updateMedicine(BeanClass medicine);
	void deleteMedicine(int medicineId);
	boolean medicineExists( String name);
	boolean med(int id);
/*	boolean userExists(String name,String password);*/
/*	void addUser(User user);*/
	boolean medicineExists1(int id);

	
}
