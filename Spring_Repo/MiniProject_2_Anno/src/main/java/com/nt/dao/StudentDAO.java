package com.nt.dao;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public interface StudentDAO {

public int insert(StudentBO bo)throws Exception;
}
