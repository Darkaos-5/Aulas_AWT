/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bancoextra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class BancoExtra {
    
    private static final String URL = "jdbc:mysql//localhost:3306/BancoExtra";
    private static final String USER = "root";
    private static final String SENHA = "1234";
    
    public static Connection conectar() {
        try {
            Connection conexao = DriverManager.getConnection(URL, USER, SENHA);
            return conexao;
        } catch (SQLException e){
            return null;
        }
       
    }
   
}
