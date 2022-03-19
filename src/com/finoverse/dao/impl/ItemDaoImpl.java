package com.finoverse.dao.impl;

import com.finoverse.dao.ItemDao;
import com.finoverse.domain.Environment;
import com.finoverse.domain.Item;
import com.finoverse.utils.DBUtils;

import java.sql.*;

/**
 * This class is implements Item_dao
 */

public class ItemDaoImpl implements ItemDao {
    @Override
    public int add(Item it) {
        Connection connection= DBUtils.getConnection();
        PreparedStatement pstmt=null;
        try{
            String sql="insert into item (time,eid,cid,waveLength,imagePath,property) values (?,?,?,?,?,?)";
            pstmt=connection.prepareStatement(sql);
            pstmt.setTimestamp(1,it.getDateTime());
            pstmt.setInt(2,it.getEid());
            pstmt.setInt(3,it.getCid());
            pstmt.setDouble(4,it.getWaveLength());
            pstmt.setString(5,it.getImagePath());
            pstmt.setString(6,it.getProperty());

            int row=pstmt.executeUpdate();
            return row;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(connection, pstmt, null);
        }
        return 0;
    }

    @Override
    public Item findByStr(String str) {
        Connection connection= DBUtils.getConnection();
        PreparedStatement pstmt=null;
        try {
            String sql="select * from item where Property = ?";
            pstmt=connection.prepareStatement(sql);
            pstmt.setString(1,str);

            ResultSet rs = pstmt.executeQuery();
            Item it=null;

            if(rs.next()){
                int id=rs.getInt("id");
                Timestamp time=rs.getTimestamp("time");
                int eid=rs.getInt("eid");
                int cid=rs.getInt("cid");
                double waveLength=rs.getDouble("waveLength");
                String imagePath=rs.getString("imagePath");
                String property=rs.getString("property");
                it=new Item(id,time,eid,cid,waveLength,imagePath,property);
            }
            return it;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(connection,pstmt,null);
        }
        return null;
    }
}
