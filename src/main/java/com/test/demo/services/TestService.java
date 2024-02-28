package com.test.demo.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.test.demo.daoImpl.DaoImpl;

@Service
public class TestService {
	@Autowired
	private DaoImpl daoImpl;
	
    public List<Map<String, Object>> callSp(String aidprt, String sft){
        return this.daoImpl.callSp(aidprt, sft);
    }
}
