package cryptography;

/**
 *
 * @author jeff
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ROT1 extends JFrame implements ActionListener{
    
    private JLabel lbl=new JLabel("ROT1");
    private TextField txtInput=new TextField();
    private JButton encode=new JButton("Encode");
    private JButton decode=new JButton("Decode");
    private WorkArea area=new WorkArea("ROT1");
    private int i;
    
    public ROT1(){
        
        this.add(lbl,BorderLayout.NORTH);
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        txtInput.setColumns(35);
        panel.add(txtInput);
        encode.addActionListener(this);
        panel.add(encode);
        decode.addActionListener(this);
        panel.add(decode);
        this.add(panel,BorderLayout.CENTER);
        
        this.setSize(300,150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==encode){
            
            if(txtInput.getText()==""){
                
                JOptionPane.showMessageDialog(this,"Please input your message first!");
                
            }
            
            else{
                
                String message=txtInput.getText();
                message=message.toUpperCase();
                String output="";
                ArrayList <Character> temp=new ArrayList<>();
                char[] charArr=message.toCharArray();
                char[] charArr1=new char[100];
                int j=0;
                
                for(i=0;i<100;i++){
                    
                    charArr1[i]='♫';
                    
                }
                    
                //remove all spaces from the message
                for(i=0;i<charArr.length;i++){
                    
                    if(charArr[i]!=' '){
                        
                        charArr1[j]=charArr[i];
                        j++;
                        
                    }
                    
                }
                    
                for(i=0;i<charArr.length;i++){
                
                    if(charArr1[i]!='♫'){
                    
                        temp.add(charArr1[i]);
                    
                    }
                
                }
                    
                for(i=0;i<temp.size();i++){
                        
                    switch(temp.get(i)){
                            
                        case 'A':   temp.set(i,'B');
                                    break;
                        case 'B':   temp.set(i,'C');
                                    break;
                        case 'C':   temp.set(i,'D');
                                    break;
                        case 'D':   temp.set(i,'E');
                                    break;
                        case 'E':   temp.set(i,'F');
                                    break;
                        case 'F':   temp.set(i,'G');
                                    break;
                        case 'G':   temp.set(i,'H');
                                    break;
                        case 'H':   temp.set(i,'I');
                                    break;
                        case 'I':   temp.set(i,'J');
                                    break;
                        case 'J':   temp.set(i,'K');
                                    break;
                        case 'K':   temp.set(i,'L');
                                    break;
                        case 'L':   temp.set(i,'M');
                                    break;
                        case 'M':   temp.set(i,'N');
                                    break;
                        case 'N':   temp.set(i,'O');
                                    break;
                        case 'O':   temp.set(i,'P');
                                    break;
                        case 'P':   temp.set(i,'Q');
                                    break;
                        case 'Q':   temp.set(i,'R');
                                    break;
                        case 'R':   temp.set(i,'S');
                                    break;
                        case 'S':   temp.set(i,'T');
                                    break;
                        case 'T':   temp.set(i,'U');
                                    break;
                        case 'U':   temp.set(i,'V');
                                    break;
                        case 'V':   temp.set(i,'W');
                                    break;
                        case 'W':   temp.set(i,'X');
                                    break;
                        case 'X':   temp.set(i,'Y');
                                    break;
                        case 'Y':   temp.set(i,'Z');
                                    break;
                        case 'Z':   temp.set(i,'A');
                                    break;                                                
                            
                        }
                        
                    }
                    
                for(i=0;i<temp.size();i++){
                    
                    output=output.concat(temp.get(i).toString());
                    
                }
                
                area.setOutput(output);
                
            }
            
        }
        
        else if(e.getSource()==decode){
            
            if(txtInput.getText()==""){
                
                JOptionPane.showMessageDialog(this,"Please input your message first!");
                
            }
            
            else{
                
                String message=txtInput.getText();
                message=message.toUpperCase();
                String output="";
                ArrayList <Character> temp=new ArrayList<>();
                char[] charArr=message.toCharArray();
                char[] charArr1=new char[100];
                int j=0;
                
                for(i=0;i<100;i++){
                    
                    charArr1[i]='♫';
                    
                }
                    
                //remove all spaces from the message
                for(i=0;i<charArr.length;i++){
                    
                    if(charArr[i]!=' '){
                        
                        charArr1[j]=charArr[i];
                        j++;
                        
                    }
                    
                }
                    
                for(i=0;i<charArr.length;i++){
                
                    if(charArr1[i]!='♫'){
                    
                        temp.add(charArr1[i]);
                    
                    }
                
                }
                    
                for(i=0;i<temp.size();i++){
                        
                    switch(temp.get(i)){
                            
                        case 'A':   temp.set(i,'Z');
                                    break;
                        case 'B':   temp.set(i,'A');
                                    break;
                        case 'C':   temp.set(i,'B');
                                    break;
                        case 'D':   temp.set(i,'C');
                                    break;
                        case 'E':   temp.set(i,'D');
                                    break;
                        case 'F':   temp.set(i,'E');
                                    break;
                        case 'G':   temp.set(i,'F');
                                    break;
                        case 'H':   temp.set(i,'G');
                                    break;
                        case 'I':   temp.set(i,'H');
                                    break;
                        case 'J':   temp.set(i,'I');
                                    break;
                        case 'K':   temp.set(i,'J');
                                    break;
                        case 'L':   temp.set(i,'K');
                                    break;
                        case 'M':   temp.set(i,'L');
                                    break;
                        case 'N':   temp.set(i,'M');
                                    break;
                        case 'O':   temp.set(i,'N');
                                    break;
                        case 'P':   temp.set(i,'O');
                                    break;
                        case 'Q':   temp.set(i,'P');
                                    break;
                        case 'R':   temp.set(i,'Q');
                                    break;
                        case 'S':   temp.set(i,'R');
                                    break;
                        case 'T':   temp.set(i,'S');
                                    break;
                        case 'U':   temp.set(i,'T');
                                    break;
                        case 'V':   temp.set(i,'U');
                                    break;
                        case 'W':   temp.set(i,'V');
                                    break;
                        case 'X':   temp.set(i,'W');
                                    break;
                        case 'Y':   temp.set(i,'X');
                                    break;
                        case 'Z':   temp.set(i,'Y');
                                    break;                                                
                            
                        }
                        
                    }
                    
                for(i=0;i<temp.size();i++){
                    
                    output=output.concat(temp.get(i).toString());
                    
                }
                
                area.setOutput(output);
                
            }
            
        }
        
    }
    
}
