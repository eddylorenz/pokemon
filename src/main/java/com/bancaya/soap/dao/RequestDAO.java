package com.bancaya.soap.dao;


import com.bancaya.soap.models.db.Request;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class RequestDAO extends JdbcDaoSupport implements RequestDAOI {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }

    @Override
    public void insertRequest(Request request) throws Exception {

        try {

            ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

            String sql = "INSERT INTO requests (ip, metodo) VALUES (?, ?)";

            JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");

            jdbcTemplate.update(sql, request.getIp(), request.getMetodo());

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

}
