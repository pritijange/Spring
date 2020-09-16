package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.daoI;

import com.example.demo.model.Nocdetails;


@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	private daoI d;
	
	
	@Override
	public void addnocdetails(Nocdetails n) {
		System.out.println(n);
		d.save(n);
		System.out.println("data inserted--");
		
	}

	@Override
	public Nocdetails getNocdetailsforediting(int id) {
		System.out.println(id);
		Nocdetails n=d.findById(id).get();
		return n;
	}

	@Override
	public void update(Nocdetails n) {
		System.out.println(n);
		d.save(n);
		System.out.println("data updated--");
	}

	@Override
	public void deleteNocdetails(int id) {
		System.out.println(id);
		d.deleteById(id);
		
		
	}

	@Override
	public List<Nocdetails> getAllData() {
		return d.findAll();
	}

	
}
