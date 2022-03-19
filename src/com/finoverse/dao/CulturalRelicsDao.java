package com.finoverse.dao;

import com.finoverse.domain.CulturalRelics;

/**
 * this interface is support user to add and find
 */
public interface CulturalRelicsDao {
    //--------------
    //  add an item
    //-------------
    public int add(CulturalRelics cr);

    //--------------
    //  findSthByStr
    //--------------
    public CulturalRelics findByStr(String str);
}
