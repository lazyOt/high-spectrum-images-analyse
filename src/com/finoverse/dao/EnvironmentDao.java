package com.finoverse.dao;

import com.finoverse.domain.Environment;

/**
 * this interface is support user to add and find
 */
public interface EnvironmentDao {
    //--------------
    //  add an item
    //-------------
    public int add(Environment ev);

    //--------------
    //  findSthByStr
    //--------------
    public Environment findByStr(String str);
}
