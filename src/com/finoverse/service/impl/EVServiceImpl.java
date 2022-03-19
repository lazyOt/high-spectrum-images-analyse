package com.finoverse.service.impl;

import com.finoverse.dao.EnvironmentDao;
import com.finoverse.dao.impl.EnvironmentDaoImpl;
import com.finoverse.domain.Environment;
import com.finoverse.service.EVService;

public class EVServiceImpl implements EVService {
    private EnvironmentDao evDao= new EnvironmentDaoImpl();
    @Override
    public boolean add(Environment ev) {
        int add = evDao.add(ev);
        if(add==1){
            System.out.println(1111111);
            return true;
        }
        else{
            System.out.println(22222222);
            return false;
        }

    }
}
