package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Nocdetails;



public interface ServiceI {

	void addnocdetails(Nocdetails n);

	Nocdetails getNocdetailsforediting(int id);

	void update(Nocdetails n);

	void deleteNocdetails(int id);

	List<Nocdetails> getAllData();

}
