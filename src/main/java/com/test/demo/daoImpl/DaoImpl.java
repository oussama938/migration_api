package com.test.demo.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.demo.dao.Dao;


@Repository
public class DaoImpl implements Dao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Map<String, Object>> callSp(String aidprt, String sft) {
//		jdbcTemplate.execute("Drop table #apri_01  \n");
        String sqlCreate = "CREATE TABLE #apri_01  (" +
                "    azprto CHAR(7), " +
                "    azprtc CHAR(7) NULL, " +
                "    allprt CHAR(30) NULL, " +
                "    acdtpo CHAR(2) NULL, " +
                "    alltpo CHAR(30) NULL, " +
                "    type CHAR(1) NULL " +
                ")";
   
        jdbcTemplate.execute(sqlCreate);

        String sql = "EXEC ADMIN..aprt_sel_01 @aidprt=?, @sft=?"; 
        return jdbcTemplate.queryForList(sql, aidprt, sft);
	}

    
}
