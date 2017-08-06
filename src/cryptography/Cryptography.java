package cryptography;

/**
 *
 * @author jeff
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cryptography extends JFrame implements ActionListener{
    
    private JLabel lbl1=new JLabel("Welcome to Cryptography!");
    private JButton btn1=new JButton("(1) Transposition cipher");
    private JButton btn2=new JButton("(2) Substitution cipher ");
    private JButton btn3=new JButton("(3) Caesar cipher       ");
    private JButton btn4=new JButton("(4) ROT1                ");
    private JButton btn5=new JButton("(5) Vigenere cipher     ");
    private JButton info1=new JButton("i");
    private JButton info2=new JButton("i");
    private JButton info3=new JButton("i");
    private JButton info4=new JButton("i");
    private JButton info5=new JButton("i");
    
    public Cryptography(){
        
        this.add(lbl1,BorderLayout.NORTH);
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        btn1.addActionListener(this);
        panel.add(btn1);
        info1.addActionListener(this);
        panel.add(info1);
        btn2.addActionListener(this);
        panel.add(btn2);
        info2.addActionListener(this);
        panel.add(info2);
        btn3.addActionListener(this);
        panel.add(btn3);
        info3.addActionListener(this);
        panel.add(info3);
        btn4.addActionListener(this);
        panel.add(btn4);
        info4.addActionListener(this);
        panel.add(info4);
        btn5.addActionListener(this);
        info5.addActionListener(this);
        panel.add(btn5);
        panel.add(info5);
        
        this.add(panel,BorderLayout.CENTER);
        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        //Transposition
        if(e.getSource()==btn1){
            
            FrameManager.getAnotherFrame("Transposition");
            
        }
        
        //Substitution Cipher
        else if(e.getSource()==btn2){
            
            FrameManager.getAnotherFrame("Substitution");
            
        }
        
        //Caesar Cipher
        else if(e.getSource()==btn3){
                        
            FrameManager.getAnotherFrame("Caesar");
            
        }
        
        else if(e.getSource()==btn4){
            
            FrameManager.getAnotherFrame("ROT1");
                        
        }
        
        else if(e.getSource()==btn5){
            
            FrameManager.getAnotherFrame("Vigenere");
            
        }
        
        else if(e.getSource()==info1){
            
            JOptionPane.showMessageDialog(this,"Transcription cipher is a method of encryption by which the position held by units of a plaintext are shifted "
                    + "according to a certain system.");
            
        }
        
        else if(e.getSource()==info2){
            
            JOptionPane.showMessageDialog(this,"Substitution cipher is a method of encryption by which units of plaintexts are replaced with ciphertext "
                    + "according to a fixed system.");
            
        }
        
        else if(e.getSource()==info3){
            
            JOptionPane.showMessageDialog(this,"Caesar cipher is a method of encryption by which all letters in the plaintext are moved a certain number "
                    + "of units down the alphabet.");
            
        }
        
        else if(e.getSource()==info4){
            
            JOptionPane.showMessageDialog(this,"ROT1 means rotate one letter forward. The encryption process involves transforming all letters "
                    + "to every letter's next one in the alphabet");
            
        }
        
        else if(e.getSource()==info5){
            
            JOptionPane.showMessageDialog(this,"Vigenere cipher is a method of encrypting alphabet text by using a series of different Caesar ciphers "
                    + "based on the letters of a keyword.");
            
        }
        
    }
    
}
