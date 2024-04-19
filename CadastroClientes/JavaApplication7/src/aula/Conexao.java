/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class Conexao {
    
    public static  Connection con = null;
    
    public static void Conectar(){
        String servidor = "localhost/";
        String banco = "login2";
        String usuario = "root";
        String senha = "usbw";

        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://"+servidor+banco, 
                   usuario, 
                   senha);
        } catch (ClassNotFoundException ex){
            System.out.println("Classe não encontrada " + ex);
        } catch (SQLException ex){
            System.out.println("Problema no sql " + ex);
        }
    }
    
    public static void Desconectar(){
        try{
            con.close();
            con = null;
        } catch (SQLException ex){
            System.out.println("Erro no SQL" + ex);
        }
    }
    
    
    
}
