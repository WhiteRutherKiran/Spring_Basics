package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.nt.beans.Student2;

@Repository
public  class StudentDAOImpl implements StudentDAO {
	private  static final String INSERT_QUERY="INSERT INTO STUDENT1(NAME, COURSE, FEE) VALUES (?,?,?) ";
	@Autowired
	private HibernateTemplate dt;

	@Override
	public int insert(Student2 entity) throws Exception {
		int count=0;
			count = (int) dt.save(entity);
			
		return count;
	}

}
