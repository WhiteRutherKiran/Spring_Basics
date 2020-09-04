package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		StudentDTO dto = new StudentDTO();
		StudentService service = null;
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		service =ctx.getBean(StudentService.class);
		
		try {
			dto.setName("shaik");
			dto.setCourse("NETWORK");
			dto.setFee(1900.0);
			
			System.out.println(service.processRequest(dto));
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		((AbstractApplicationContext) ctx).close();
	}

}
