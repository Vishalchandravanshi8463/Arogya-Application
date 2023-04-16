/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sanjeevaniapp.pojo.User;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.EmpPojo;
import sanjeevaniapp.pojo.ReceptionistPojo;
import sanjeevaniapp.pojo.UserPojo;

/**
 *
 * @author vishal chandravanshi
 */
public class UserDao {

    public static String validateUser(User user) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select user_name from users where login_id=? and password=? and user_type=?");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        ResultSet rs = ps.executeQuery();
        String name = null;
        if (rs.next()) {
            name = rs.getString("user_name");
        }
        System.out.println(name);
        return name;
    }

    public static void updateName(String currName, String newName) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update users set user_name=? where user_name=?");
        ps.setString(1, newName);
        ps.setString(2, currName);
        ps.executeUpdate();
    }

    public static boolean addUser(UserPojo user) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Insert into users values(?,?,?,?)");
        ps.setString(1, user.getLoginId());
        ps.setString(2, user.getUserName());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getUserType());//.toUpperCase());
        return ps.executeUpdate() == 1;
    }

    public static void deleteUserByName(String name) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from users where user_name=?");
        ps.setString(1, name);
        ps.executeUpdate();
    }
    
    
     public static boolean updateReceptionist(UserPojo rec,String rname) throws SQLException {
       // updateName(rec,rid);
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update USERS set LOGIN_ID=?,USER_NAME=?,PASSWORD=?,USER_TYPE=? where USER_NAME=?");
        ps.setString(1, rec.getLoginId());
        ps.setString(2,rec.getUserName() );
        ps.setString(3, rec.getPassword());
        ps.setString(4,rec.getUserType());
        ps.setString(5, rname);
         System.out.println("my name is "+rname);
        return ps.executeUpdate() == 1;
    }


}
