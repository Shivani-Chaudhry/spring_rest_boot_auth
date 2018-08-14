package com.example.demo.service;

import java.util.List;


import com.example.demo.bean.BeanClass;


public interface ServiceInterface {
	List<BeanClass> getAllMedicine();
	BeanClass getMedicineById1(int medicineId);

	boolean addMedicine(BeanClass medicineId);
	void updateMedicine(BeanClass medicine);
	void deleteMedicine(int medicineId);
	boolean checkMedicineById(int medicineId);


}
