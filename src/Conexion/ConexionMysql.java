/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

/**
 *
 * @author edith
 */
public class ConexionMysql {

   Connection cn;
    
    public ConexionMysql(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_negocio", "root", "");
            System.out.println("CONECTADO");
        }catch(Exception e){
            System.out.println("ERROR DE CONEXION"+e);
        }  
    }
    public java.sql.Connection getConnection(){
            return cn;
        }
}
