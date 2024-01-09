package com.basic.jdbc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class code {
	@Autowired
	JdbcTemplate jt;
	int insertData(pojo obj){
		String name=obj.getName();
		int empid=obj.getEmpid();
		long pnum=obj.getPnum();
		String sql="insert into ITG_165_Emp values (?,?,?)";
		return jt.update(sql,name,empid,pnum);
		//insert into ITG_165_Emp values ("sai Kumar(Reddy)", 5971, 7997770797);
	}
	
}
