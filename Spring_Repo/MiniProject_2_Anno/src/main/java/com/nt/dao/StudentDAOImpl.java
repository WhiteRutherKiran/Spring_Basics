package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.nt.bo.StudentBO;
@Repository
public class StudentDAOImpl implements StudentDAO {
	private  static final String INSERT_QUERY="INSERT INTO STUDENT1(NAME, COURSE, FEE) VALUES (?,?,?) ";
	@Autowired
	private DataSource dt;

	@Override
	public int insert(StudentBO bo) throws Exception {
		int count=0;
			Connection con = null;
			PreparedStatement ps = null;
			con = dt.getConnection();
			ps = con.prepareStatement(INSERT_QUERY); 
			ps.setString(1, bo.getName());
			ps.setString(2, bo.getCourse());
			ps.setDouble(3, bo.getFee());
			count = ps.executeUpdate();
			ps.close();
			con.close();
			
		return count;
	}

}
