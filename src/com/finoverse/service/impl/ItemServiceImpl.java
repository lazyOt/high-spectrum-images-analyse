package com.finoverse.service.impl;

import com.finoverse.dao.ItemDao;
import com.finoverse.dao.impl.ItemDaoImpl;
import com.finoverse.domain.Item;
import com.finoverse.service.ItemService;

public class ItemServiceImpl implements ItemService{
    private ItemDao itdao=new ItemDaoImpl();

    @Override
    public boolean add(Item it) {
        int i=itdao.add(it);
        if(i==1){
            return true;
        }
        return false;
    }
}
