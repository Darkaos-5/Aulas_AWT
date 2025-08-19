package com.mycompany.newmavenproject;

/**
 *
 * @author Jonatan
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.*;

public class NewMavenProject {

    public static void main(String[] args){
        JFrame Janela01 = new JFrame();
        JLabel Texto = new JLabel("Olá Mundo.");
        Janela01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Janela01.setVisible(true);
        Janela01.setSize (600, 400);
        Janela01.setLocationRelativeTo(null);
        Janela01.setTitle("Janela 01");
        
        JButton btnAbrir = new JButton("Abrir");
        btnAbrir.setBounds(140, 170, 160, 30);
        
        JTextField Campotexto = new JTextField(20);
        Campotexto.setVisible(true);
        Campotexto.setSize(300, 30);
        
        Janela01.add(Texto);
        Janela01.add(btnAbrir);
        
        btnAbrir.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                AbrirJanela();
            }
        });
        
    }
    
    
    public static void AbrirJanela(){
        JFrame Janela02 = new JFrame();
        Janela02.setSize(400, 400);
        Janela02.setTitle("Janela 02");
        Janela02.setVisible(true);
        Janela02.setLocationRelativeTo(null);        
        
    }    
}
