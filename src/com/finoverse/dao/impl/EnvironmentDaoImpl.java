package com.finoverse.dao.impl;

import com.finoverse.dao.EnvironmentDao;
import com.finoverse.domain.Environment;
import com.finoverse.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class is implements Ev_dao
 */

public class EnvironmentDaoImpl implements EnvironmentDao {
    @Override
    public int add(Environment ev) {
        Connection connection= DBUtils.getConnection();
        PreparedStatement pstmt=null;

        try{
            String sql="insert into environment (temperature,rh,property) values (?,?,?)";
            pstmt=connection.prepareStatement(sql);
            pstmt.setFloat(1,ev.getTemperature());
            pstmt.setFloat(2,ev.getRh());
            pstmt.setString(3,ev.getProperty());

            int row=pstmt.executeUpdate();
            return row;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(connection,pstmt,null);
        }
        return 0;
    }

    @Override
    public Environment findByStr(String str) {
        Connection connection= DBUtils.getConnection();
        PreparedStatement pstmt=null;
        try {
            String sql="select * from environment where Property = ?";
            pstmt=connection.prepareStatement(sql);
            pstmt.setString(1,str);

            ResultSet rs = pstmt.executeQuery();
            Environment environment=null;

            if(rs.next()){
                int eid = rs.getInt("eid");
                float tmp=rs.getFloat("temperature");
                float rh=rs.getFloat("rh");
                String property = rs.getString("property");
                environment = new  Environment(eid, tmp,rh,property);
            }
            return  environment;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(connection,pstmt,null);
        }
        return null;
    }
}
