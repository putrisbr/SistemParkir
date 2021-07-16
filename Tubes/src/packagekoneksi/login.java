/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagekoneksi;
import com.mysql.jdbc.Driver;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 *
 * @author Putri Salsabila
 */
public class login {
    public static Connection con;
    public static Statement stm;
    public static String url="jdbc:mysql://localhost/db_sistemparkir";
    public static String user="root";
    public static String password="";
    
    public int masukAkun(String username, String pass, String table){
        ResultSet rs;
        int i=0;
        try{
            con=DriverManager.getConnection(url, user, password);
            stm=con.createStatement();
            String query="select * from "+table+" where username='"+username+"' and password='"+pass+"'";
            rs=stm.executeQuery(query);
            
            if(rs.next()){
                i=1;
            }
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return i;
    }
}
