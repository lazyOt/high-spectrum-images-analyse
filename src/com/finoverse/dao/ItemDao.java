package com.finoverse.dao;

import com.finoverse.domain.Item;

/**
 * this interface is support user to add and find
 */
public interface ItemDao {
    //--------------
    //  add an item
    //-------------
    public int add(Item it);

    //--------------
    //  findSthByStr
    //--------------
    public Item findByStr(String str);
}
