package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService{
	private StudentDAO dao;
	
	public StudentServiceImpl(StudentDAO dao) {
		this.dao=dao;
	}

	@Override
	public String processRequest(StudentDTO dto) throws Exception {
		String result = null;
		Integer count = null;
		StudentBO bo = new StudentBO();
		bo.setName(dto.getName());
		bo.setCourse(dto.getCourse());
		bo.setFee(dto.getFee());
		count = dao.insert(bo);
		
	//int idVal = bo.getSid();
		if(count==null)
		return "record not inserted";
		else
			return "record inserted successfully "+count;
	}

}
