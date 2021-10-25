
package Conex;

import java.sql.*;

public class Conexion {
    
    Connection conectar = null;
    
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/cine","root","Marisa");
        }catch(Exception e){
            System.err.println("Error: "+e);
        }
        return conectar;
    }
}
