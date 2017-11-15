/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author karlmorris
 */
public class InternetSave implements Savable {

    @Override
    public void save(int userId, String post) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("dburl", "dbusername", "dbpassword");

            Statement stmt = con.createStatement();

            stmt.execute("insert into blog_posts (user_id, blog_post) values ('" + userId + "', '" + post + "')");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
