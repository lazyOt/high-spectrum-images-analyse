package com.finoverse.service.impl;

import com.finoverse.dao.CulturalRelicsDao;
import com.finoverse.dao.impl.CulturalRelicsDaoImpl;
import com.finoverse.domain.CulturalRelics;
import com.finoverse.service.CRService;

public class CRServiceImpl implements CRService {
    private CulturalRelicsDao crDao = new CulturalRelicsDaoImpl();

    @Override
    public boolean add(CulturalRelics cr) {
        int add = crDao.add(cr);
        if(add==1){
            return true;
        }
        else return false;
    }
}
