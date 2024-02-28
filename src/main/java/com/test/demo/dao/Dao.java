package com.test.demo.dao;

import java.util.List;
import java.util.Map;

public interface Dao {
    List<Map<String, Object>> callSp(String aidprt,String sft);
}
