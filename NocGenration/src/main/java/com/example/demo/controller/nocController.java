package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Nocdetails;

import com.example.demo.service.ServiceI;

@RestController
//@CrossOrigin("*")
public class nocController 
{
    @Autowired
	private ServiceI si;
	@PostMapping("/adddetails")
	public String m1(@RequestBody Nocdetails n)
	{
		System.out.println("data:"+n);
		si.addnocdetails(n);
		return "data is updated---";
	}
	@GetMapping("/get/{id}")
	public Nocdetails m2(@PathVariable("id")int id)
	{
		System.out.println(id);
		Nocdetails n=si.getNocdetailsforediting(id);
		System.out.println(n);
		return n;
		
	}
	@PutMapping("/update")
	public String m3(@RequestBody Nocdetails n)
	{
	si.update(n);
	System.out.println(n);	
	return "update";
	}
	
	@DeleteMapping("/delete/{id}")
	public String m4(@PathVariable("id")int id)
	{
		System.out.println(id);
		si.deleteNocdetails(id);
		return "delete data";
	}
	
	@GetMapping("/allData")
	   public List<Nocdetails> m5()
	   {
		   List<Nocdetails> nlist=si.getAllData();  
		   return nlist;
	   }
	
}

