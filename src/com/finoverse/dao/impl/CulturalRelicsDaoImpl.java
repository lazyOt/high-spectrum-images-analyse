package com.finoverse.dao.impl;

import com.finoverse.dao.CulturalRelicsDao;
import com.finoverse.domain.CulturalRelics;
import com.finoverse.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class is implements Cr_dao
 */

public class CulturalRelicsDaoImpl implements CulturalRelicsDao {
    @Override
    public int add(CulturalRelics cr) {
        Connection connection= DBUtils.getConnection();
        PreparedStatement pstmt=null;
        try {
            String sql="insert into cultural_relics (property) values (?)";
            pstmt=connection.prepareStatement(sql);
            pstmt.setString(1,cr.getProperty());
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
    public CulturalRelics findByStr(String str) {
        Connection connection= DBUtils.getConnection();
        PreparedStatement pstmt=null;
        try {
            String sql="select * from cultural_relics where Property = ?";
            pstmt=connection.prepareStatement(sql);
            pstmt.setString(1,str);
            ResultSet rs = pstmt.executeQuery();
            CulturalRelics culturalRelics=null;

            if(rs.next()){
                int cid = rs.getInt("cid");
                String property = rs.getString("property");
                culturalRelics = new CulturalRelics(cid, property);
            }
            return culturalRelics;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(connection,pstmt,null);
        }
        return null;
    }
}
