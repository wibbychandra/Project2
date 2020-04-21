/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companystockexchange.Connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Wibby Chandra
 */
public class DBConnection {
    public static Connection open(){
        Connection con;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/companystockexchange";
            con = (Connection) DriverManager.getConnection(url,"root", "");
            return con;
        }
        catch (Exception e){
            System.err.println(e);
            return null;
        }
    }
}
