package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.beans.Student2;

import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDAO dao;
	
	@Override
	@Transactional
	public String processRequest(StudentDTO dto) throws Exception {
		
		Integer count = null;
		Student2 entity = new Student2();
		BeanUtils.copyProperties(dto, entity);
	
		count = dao.insert(entity);
		
	//int idVal = bo.getSid();
		if(count==null)
		return "record not inserted";
		else
			return "record inserted successfully "+count;
	}

}
