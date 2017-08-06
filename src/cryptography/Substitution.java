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

public class Substitution extends JFrame{ 
    private JButton btnInput=new JButton("Cipher");
    private JButton btnInput2=new JButton("Decipher");
    private JTextField txtInput=new JTextField("");
    private JLabel lblInput=new JLabel("Substitution Cipher");
    private String original;   //english to cipher
    private String ciphered;
    private String original2;  //cipher to english
    private String ciphered2;
    private WorkArea area=new WorkArea("Substitution Cipher");
    
    public Substitution(){
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        
        txtInput.setColumns(17);     
        
        btnInput.addActionListener(new ActionListener(){      //english to cipher
            public void actionPerformed(ActionEvent e){
            original=txtInput.getText();
            StringBuilder ciphered=new StringBuilder(original);
            
            for(int i=0;i<original.length();i++){
              if(original.charAt(i)==' '||original.charAt(i)=='!'||original.charAt(i)=='.'||original.charAt(i)=='?'||original.charAt(i)==',')
               ciphered.setCharAt(i, original.charAt(i));
              else if(original.charAt(i)=='a'||original.charAt(i)=='A')
               ciphered.setCharAt(i,'e');
              else if(original.charAt(i)=='b'||original.charAt(i)=='B')
               ciphered.setCharAt(i,'r');
              else if(original.charAt(i)=='c'||original.charAt(i)=='C')
               ciphered.setCharAt(i,'d');
              else if(original.charAt(i)=='d'||original.charAt(i)=='D')
               ciphered.setCharAt(i,'p');
              else if(original.charAt(i)=='e'||original.charAt(i)=='E')
               ciphered.setCharAt(i,'y');
              else if(original.charAt(i)=='f'||original.charAt(i)=='F')
               ciphered.setCharAt(i,'w');
              else if(original.charAt(i)=='g'||original.charAt(i)=='G')
               ciphered.setCharAt(i,'u');
              else if(original.charAt(i)=='h'||original.charAt(i)=='H')
               ciphered.setCharAt(i,'i');
              else if(original.charAt(i)=='i'||original.charAt(i)=='I')  
               ciphered.setCharAt(i,'c');
              else if(original.charAt(i)=='j'||original.charAt(i)=='J')
               ciphered.setCharAt(i,'z');
              else if(original.charAt(i)=='k'||original.charAt(i)=='K')
               ciphered.setCharAt(i,'g');
              else if(original.charAt(i)=='l'||original.charAt(i)=='L')
               ciphered.setCharAt(i,'q');
              else if(original.charAt(i)=='m'||original.charAt(i)=='M')
               ciphered.setCharAt(i,'m');
              else if(original.charAt(i)=='n'||original.charAt(i)=='N')
               ciphered.setCharAt(i,'j');
              else if(original.charAt(i)=='o'||original.charAt(i)=='O')
               ciphered.setCharAt(i,'n');
              else if(original.charAt(i)=='p'||original.charAt(i)=='P')
               ciphered.setCharAt(i,'a');
              else if(original.charAt(i)=='q'||original.charAt(i)=='Q')
               ciphered.setCharAt(i,'l');
              else if(original.charAt(i)=='r'||original.charAt(i)=='R')
               ciphered.setCharAt(i,'v');
              else if(original.charAt(i)=='s'||original.charAt(i)=='S')
               ciphered.setCharAt(i,'h');
              else if(original.charAt(i)=='t'||original.charAt(i)=='T')
               ciphered.setCharAt(i,'t');
              else if(original.charAt(i)=='u'||original.charAt(i)=='U')
               ciphered.setCharAt(i,'x');
              else if(original.charAt(i)=='v'||original.charAt(i)=='V')
               ciphered.setCharAt(i,'o');
              else if(original.charAt(i)=='w'||original.charAt(i)=='W')
               ciphered.setCharAt(i,'b');
              else if(original.charAt(i)=='x'||original.charAt(i)=='X')
               ciphered.setCharAt(i,'f');
              else if(original.charAt(i)=='y'||original.charAt(i)=='Y')
               ciphered.setCharAt(i,'s');
              else if(original.charAt(i)=='z'||original.charAt(i)=='Z')
               ciphered.setCharAt(i,'k');      
            
            }
            area.setOutput(ciphered.toString());
        
            }
        });
        
        btnInput2.addActionListener(new ActionListener(){  // cipher to english
            public void actionPerformed(ActionEvent e){
            ciphered2=txtInput.getText();
            StringBuilder original2=new StringBuilder(ciphered2);
            
            for(int i=0;i<ciphered2.length();i++){
              if(ciphered2.charAt(i)==' '||ciphered2.charAt(i)=='!'||ciphered2.charAt(i)=='.'||ciphered2.charAt(i)=='?'||ciphered2.charAt(i)==',')
               original2.setCharAt(i, ciphered2.charAt(i));
              else if(ciphered2.charAt(i)=='e'||ciphered2.charAt(i)=='E')
               original2.setCharAt(i,'a');
              else if(ciphered2.charAt(i)=='r'||ciphered2.charAt(i)=='R')
               original2.setCharAt(i,'b');
              else if(ciphered2.charAt(i)=='d'||ciphered2.charAt(i)=='D')
               original2.setCharAt(i,'c');
              else if(ciphered2.charAt(i)=='p'||ciphered2.charAt(i)=='P')
               original2.setCharAt(i,'d');
              else if(ciphered2.charAt(i)=='y'||ciphered2.charAt(i)=='Y')
               original2.setCharAt(i,'e');
              else if(ciphered2.charAt(i)=='w'||ciphered2.charAt(i)=='W')
               original2.setCharAt(i,'f');
              else if(ciphered2.charAt(i)=='u'||ciphered2.charAt(i)=='U')
               original2.setCharAt(i,'g');
              else if(ciphered2.charAt(i)=='i'||ciphered2.charAt(i)=='I')
               original2.setCharAt(i,'h');
              else if(ciphered2.charAt(i)=='c'||ciphered2.charAt(i)=='C')  
               original2.setCharAt(i,'i');
              else if(ciphered2.charAt(i)=='z'||ciphered2.charAt(i)=='Z')
               original2.setCharAt(i,'j');
              else if(ciphered2.charAt(i)=='g'||ciphered2.charAt(i)=='G')
               original2.setCharAt(i,'k');
              else if(ciphered2.charAt(i)=='q'||ciphered2.charAt(i)=='Q')
               original2.setCharAt(i,'l');
              else if(ciphered2.charAt(i)=='m'||ciphered2.charAt(i)=='M')
               original2.setCharAt(i,'m');
              else if(ciphered2.charAt(i)=='j'||ciphered2.charAt(i)=='J')
               original2.setCharAt(i,'n');
              else if(ciphered2.charAt(i)=='n'||ciphered2.charAt(i)=='N')
               original2.setCharAt(i,'o');
              else if(ciphered2.charAt(i)=='a'||ciphered2.charAt(i)=='A')
               original2.setCharAt(i,'p');
              else if(ciphered2.charAt(i)=='l'||ciphered2.charAt(i)=='L')
               original2.setCharAt(i,'q');
              else if(ciphered2.charAt(i)=='v'||ciphered2.charAt(i)=='V')
               original2.setCharAt(i,'r');
              else if(ciphered2.charAt(i)=='h'||ciphered2.charAt(i)=='H')
               original2.setCharAt(i,'s');
              else if(ciphered2.charAt(i)=='t'||ciphered2.charAt(i)=='T')
               original2.setCharAt(i,'t');
              else if(ciphered2.charAt(i)=='x'||ciphered2.charAt(i)=='X')
               original2.setCharAt(i,'u');
              else if(ciphered2.charAt(i)=='o'||ciphered2.charAt(i)=='O')
               original2.setCharAt(i,'v');
              else if(ciphered2.charAt(i)=='b'||ciphered2.charAt(i)=='B')
               original2.setCharAt(i,'w');
              else if(ciphered2.charAt(i)=='f'||ciphered2.charAt(i)=='F')
               original2.setCharAt(i,'x');
              else if(ciphered2.charAt(i)=='s'||ciphered2.charAt(i)=='S')
               original2.setCharAt(i,'y');
              else if(ciphered2.charAt(i)=='k'||ciphered2.charAt(i)=='K')
               original2.setCharAt(i,'z');      
            
            }
            area.setOutput(original2.toString());
        
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

