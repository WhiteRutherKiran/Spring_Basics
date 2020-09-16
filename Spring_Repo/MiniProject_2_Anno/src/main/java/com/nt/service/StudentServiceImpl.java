package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDAO dao;
	
	@Override
	public String processRequest(StudentDTO dto) throws Exception {
		
		Integer count = null;
		StudentBO bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);
	
		count = dao.insert(bo);
		
	//int idVal = bo.getSid();
		if(count==null)
		return "record not inserted";
		else
			return "record inserted successfully "+count;
	}

}
