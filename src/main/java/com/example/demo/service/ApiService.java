package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class ApiService {
	@Autowired
    StudentRepo re;
	 
	public Student saveinfo(Student s)
	{
		return re.save(s);
	}
	public List<Student> saveinfon(List<Student>s)
	{
		return (List<Student>)re.saveAll(s);
	}
	
	
	public List<Student> showinfo()
	{
		return re.findAll();
	}
	public Optional<Student> showinfoid(int id)
	{
		return re.findById(id);
	}
	
	
	public Student changeinfo(Student s)
	{
		return re.saveAndFlush(s);
	}
	
	
	public void deleteid(int id)
	{
		re.deleteById(id);
	}
    
}
