/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;

/**
 *
 * @author Skyice
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Vigenere extends JFrame{
    private JButton btnInput=new JButton("Cipher");
    private JButton btnInput2=new JButton("Decipher");
    private JTextField txtInput=new JTextField("");
    private JLabel lblInput=new JLabel("Vigenere Cipher");
    private char[][] check;
    private char[][] table;
    private String word;
    private String ciphered;
    private WorkArea area=new WorkArea("Vigenere Cipher");
    
    public Vigenere(){
        table = new char[][]{{'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b'}, {'i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h'}, {'p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'}, {'h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g'}, {'e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d'}, {'r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q'}};
        check = new char[][]{{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'},{'c','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','z'}, {'i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','z'}, {'p','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','z'}, {'h','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','z'}, {'e','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','z'}, {'r','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','z'}};
//check=7 table table=6
        JPanel panel=new JPanel();
        
        txtInput.setColumns(17);
        
        btnInput.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            word=txtInput.getText();
            StringBuilder ciphered=new StringBuilder(word);
        
            int count;
            int index=-1;
            char ch;
            
            for(int i=0;i<word.length();i++){
              count=0;
              
              if(word.charAt(i)!=' '){
              while(count<26&&check[0][count]!=word.charAt(i)){
              count++;
              }
              index++;
              if(index==6)
                index=0;
        
              ch=table[index][count];
              ciphered.setCharAt(i, ch);
              }
            }   
          
          area.setOutput(ciphered.toString().replaceAll("\\s+", ""));   
        }
        });
        
        btnInput2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            ciphered=txtInput.getText();
            StringBuilder word=new StringBuilder(ciphered);
        
            int count;
            int temp=0;
            int index=0;
            char ch;
            
            for(int i=0;i<ciphered.length();i++){
              count=0;
              
              while(count<26&&table[temp][count]!=word.charAt(i)){
              count++;
              }
              temp++;
              if(index==6)
                index=0;
              if(temp==6)
                temp=0;
        
              ch=check[index][count];
              word.setCharAt(i, ch);
              
            }   
          
          area.setOutput(word.toString());   
        }
        });
        
        this.add(panel, BorderLayout.CENTER);
        this.add(lblInput, BorderLayout.NORTH);
        
        panel.add(txtInput);
        panel.add(btnInput);
        panel.add(btnInput2);
        panel.add(lblInput);
        
        this.setSize(400,250);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
