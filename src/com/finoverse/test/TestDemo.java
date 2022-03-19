package com.finoverse.test;

import com.finoverse.dao.CulturalRelicsDao;
import com.finoverse.dao.EnvironmentDao;
import com.finoverse.dao.ItemDao;
import com.finoverse.dao.impl.CulturalRelicsDaoImpl;
import com.finoverse.dao.impl.EnvironmentDaoImpl;
import com.finoverse.dao.impl.ItemDaoImpl;
import com.finoverse.domain.CulturalRelics;
import com.finoverse.domain.Environment;
import com.finoverse.domain.Item;

import java.sql.Timestamp;
import java.util.Date;

public class TestDemo {

    public Item findItem(String s){
        ItemDao itdao=new ItemDaoImpl();
        return itdao.findByStr("test1432");
    }

    public static void main(String[] args){
//        EnvironmentDao evdao=new EnvironmentDaoImpl();
//        Environment ev=new Environment();
//        ev.setTemperature(36.5F);
//        ev.setRh(0.4F);
//        ev.setProperty("T:36.5 R:0.4");
//        int i=evdao.add(ev);
//        System.out.println(i);
//
//        Environment ev_=evdao.findByStr("T:36.5 R:0.4");
//        System.out.println(ev_.toString());

        ItemDao itdao=new ItemDaoImpl();
//        Item it=new Item();
//        Timestamp now = new Timestamp(System.currentTimeMillis());
//        it.setDateTime(now);
//
//        it.setCid(3);
//        it.setEid(3);
//        it.setProperty("test1432");
//        it.setWaveLength(720);
//        it.setImagePath("D:\\Fino\\Code\\Java\\high-spectrum-data-space\\images\\test.png");

        //int i=itdao.add(it);
        //System.out.println(i);

        Item it_=itdao.findByStr("test1432");
        System.out.println(it_.toString());

    }
}
