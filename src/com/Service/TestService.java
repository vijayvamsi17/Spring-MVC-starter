package com.Service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service("testService")
public class TestService {
	
	private JdbcTemplate jdbcTemplate;
    @Autowired 
    DataSource dataSource;
    String SqlQuery = "";
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    } 
	
	public void display() {
		System.out.println("From service");
		jdbcTemplate = new JdbcTemplate(dataSource);
		String sqlQuery = "SELECT Password FROM employee_login WHERE Username = 'AF0102';";
  
		
		String password = jdbcTemplate.queryForObject(sqlQuery, String.class);
		System.out.println(password);
		
	}

}
