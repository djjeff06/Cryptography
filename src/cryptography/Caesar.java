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

// inputs are pure alphabetic, can be more than 1 word

public class Caesar extends JFrame{
    private JButton btn=new JButton("Enter");
    private JButton btnInput=new JButton("Cipher");
    private JButton btnInput2=new JButton("Decipher");
    private JTextField txt=new JTextField("");
    private JTextField txtInput=new JTextField("");
    private JLabel lbl=new JLabel("How many shifting units?");
    private JLabel lblInput=new JLabel("Caesar Cipher");
    private char[] letters=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private String word;         //english to cipher
    private String word2;        //cipher to english
    private String ciphered;
    private int shift;
    private WorkArea area=new WorkArea("Caesar");
    
    public Caesar(){
        JPanel panel=new JPanel();
        
        txt.setColumns(12);
        txtInput.setColumns(17);
        
        btn.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
             shift=Integer.parseInt(txt.getText());
             txt.setText("");
           }
    });
        
        btnInput.addActionListener(new ActionListener(){ //english to cipher
           public void actionPerformed(ActionEvent e){
           word=txtInput.getText();
           StringBuilder ciphered=new StringBuilder(word);
        
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a')
              ciphered.setCharAt(i, letters[(1+shift-1)%26]);
            else if(word.charAt(i)=='b')
              ciphered.setCharAt(i, letters[(2+shift-1)%26]);
            else if(word.charAt(i)=='c')
              ciphered.setCharAt(i, letters[(3+shift-1)%26]);
            else if(word.charAt(i)=='d')
              ciphered.setCharAt(i, letters[(4+shift-1)%26]);
            else if(word.charAt(i)=='e')
              ciphered.setCharAt(i, letters[(5+shift-1)%26]);
            else if(word.charAt(i)=='f')
              ciphered.setCharAt(i, letters[(6+shift-1)%26]);
            else if(word.charAt(i)=='g')
              ciphered.setCharAt(i, letters[(7+shift-1)%26]);
            else if(word.charAt(i)=='h')
              ciphered.setCharAt(i, letters[(8+shift-1)%26]);
            else if(word.charAt(i)=='i')
              ciphered.setCharAt(i, letters[(9+shift-1)%26]);
            else if(word.charAt(i)=='j')
              ciphered.setCharAt(i, letters[(10+shift-1)%26]);
            else if(word.charAt(i)=='k')
              ciphered.setCharAt(i, letters[(11+shift-1)%26]);
            else if(word.charAt(i)=='l')
              ciphered.setCharAt(i, letters[(12+shift-1)%26]);
            else if(word.charAt(i)=='m')
              ciphered.setCharAt(i, letters[(13+shift-1)%26]);
            else if(word.charAt(i)=='n')
              ciphered.setCharAt(i, letters[(14+shift-1)%26]);
            else if(word.charAt(i)=='o')
              ciphered.setCharAt(i, letters[(15+shift-1)%26]);
            else if(word.charAt(i)=='p')
              ciphered.setCharAt(i, letters[(16+shift-1)%26]);
            else if(word.charAt(i)=='q')
              ciphered.setCharAt(i, letters[(17+shift-1)%26]);
            else if(word.charAt(i)=='r')
              ciphered.setCharAt(i, letters[(18+shift-1)%26]);
            else if(word.charAt(i)=='s')
              ciphered.setCharAt(i, letters[(19+shift-1)%26]);
            else if(word.charAt(i)=='t')
              ciphered.setCharAt(i, letters[(20+shift-1)%26]);
            else if(word.charAt(i)=='u')
              ciphered.setCharAt(i, letters[(21+shift-1)%26]);
            else if(word.charAt(i)=='v')
              ciphered.setCharAt(i, letters[(22+shift-1)%26]);
            else if(word.charAt(i)=='w')
              ciphered.setCharAt(i, letters[(23+shift-1)%26]);
            else if(word.charAt(i)=='x')
              ciphered.setCharAt(i, letters[(24+shift-1)%26]);
            else if(word.charAt(i)=='y')
              ciphered.setCharAt(i, letters[(25+shift-1)%26]);
            else if(word.charAt(i)=='z')
              ciphered.setCharAt(i, letters[(26+shift-1)%26]);
        }
           
         area.setOutput(ciphered.toString());
        }
        
        });
        
        btnInput2.addActionListener(new ActionListener(){  //cipher to english
           public void actionPerformed(ActionEvent e){
           ciphered=txtInput.getText();
           StringBuilder word2=new StringBuilder(ciphered);
        
        for(int i=0;i<ciphered.length();i++){
            if(ciphered.charAt(i)=='a'){
              if(26-shift+0<0)
               word2.setCharAt(i, letters[((26-shift+0)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+0)%26]);
            }  
            else if(ciphered.charAt(i)=='b'){
              if(26-shift+1<0)
               word2.setCharAt(i, letters[((26-shift+1)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+1)%26]);
            }  
            else if(ciphered.charAt(i)=='c'){
              if(26-shift+2<0)
               word2.setCharAt(i, letters[((26-shift+2)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+2)%26]);
            }  
            else if(ciphered.charAt(i)=='d'){
              if(26-shift+3<0)
               word2.setCharAt(i, letters[((26-shift+3)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+3)%26]);
            }  
            else if(ciphered.charAt(i)=='e'){
              if(26-shift+4<0)
               word2.setCharAt(i, letters[((26-shift+4)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+4)%26]);
            }  
            else if(ciphered.charAt(i)=='f'){
              if(26-shift+5<0)
               word2.setCharAt(i, letters[((26-shift+5)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+5)%26]);
            }  
            else if(ciphered.charAt(i)=='g'){
              if(26-shift+6<0)
               word2.setCharAt(i, letters[((26-shift+6)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+6)%26]);
            }  
            else if(ciphered.charAt(i)=='h'){
              if(26-shift+7<0)
               word2.setCharAt(i, letters[((26-shift+7)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+7)%26]);
            }  
            else if(ciphered.charAt(i)=='i'){
              if(26-shift+8<0)
               word2.setCharAt(i, letters[((26-shift+8)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+8)%26]);
            }  
            else if(ciphered.charAt(i)=='j'){
              if(26-shift+9<0)
               word2.setCharAt(i, letters[((26-shift+9)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+9)%26]);
            }  
            else if(ciphered.charAt(i)=='k'){
              if(26-shift+10<0)
               word2.setCharAt(i, letters[((26-shift+10)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+10)%26]);
            }  
            else if(ciphered.charAt(i)=='l'){
              if(26-shift+11<0)
               word2.setCharAt(i, letters[((26-shift+11)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+11)%26]);
            }  
            else if(ciphered.charAt(i)=='m'){
              if(26-shift+12<0)
               word2.setCharAt(i, letters[((26-shift+12)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+12)%26]);
            }  
            else if(ciphered.charAt(i)=='n'){
              if(26-shift+13<0)
               word2.setCharAt(i, letters[((26-shift+13)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+13)%26]);
            }  
            else if(ciphered.charAt(i)=='o'){
              if(26-shift+14<0)
               word2.setCharAt(i, letters[((26-shift+14)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+14)%26]);
            }  
            else if(ciphered.charAt(i)=='p'){
              if(26-shift+15<0)
               word2.setCharAt(i, letters[((26-shift+15)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+15)%26]);
            }  
            else if(ciphered.charAt(i)=='q'){
              if(26-shift+16<0)
               word2.setCharAt(i, letters[((26-shift+16)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+16)%26]);
            }  
            else if(ciphered.charAt(i)=='r'){
              if(26-shift+17<0)
               word2.setCharAt(i, letters[((26-shift+17)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+17)%26]);
            }  
            else if(ciphered.charAt(i)=='s'){
              if(26-shift+18<0)
               word2.setCharAt(i, letters[((26-shift+18)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+18)%26]);
            }  
            else if(ciphered.charAt(i)=='t'){
              if(26-shift+19<0)
               word2.setCharAt(i, letters[((26-shift+19)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+19)%26]);
            }  
            else if(ciphered.charAt(i)=='u'){
              if(26-shift+20<0)
               word2.setCharAt(i, letters[((26-shift+20)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+20)%26]);
            }  
            else if(ciphered.charAt(i)=='v'){
              if(26-shift+21<0)
               word2.setCharAt(i, letters[((26-shift+21)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+21)%26]);
            }  
            else if(ciphered.charAt(i)=='w'){
              if(26-shift+22<0)
               word2.setCharAt(i, letters[((26-shift+22)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+22)%26]);
            }  
            else if(ciphered.charAt(i)=='x'){
              if(26-shift+23<0)
               word2.setCharAt(i, letters[((26-shift+23)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+23)%26]);
            }  
            else if(ciphered.charAt(i)=='y'){
              if(26-shift+24<0)
               word2.setCharAt(i, letters[((26-shift+24)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+24)%26]);
            }  
            else if(ciphered.charAt(i)=='z'){
              if(26-shift+25<0)
               word2.setCharAt(i, letters[((26-shift+25)*-1)%26]);
              else
               word2.setCharAt(i, letters[(26-shift+25)%26]);
            }  
        }
           
         area.setOutput(word2.toString());
         
           }
           
        });
        
        this.add(lbl, BorderLayout.PAGE_START);
        this.add(panel, BorderLayout.CENTER);
        this.add(lblInput, BorderLayout.NORTH);
        
        panel.add(txt);
        panel.add(btn);
        panel.add(txtInput);
        panel.add(btnInput);
        panel.add(btnInput2);
        panel.add(lblInput);
        
        this.setSize(400,250);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
