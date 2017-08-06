package cryptography;

/**
 *
 * @author jeff
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Transposition extends JFrame implements ActionListener{
    
    private JLabel lbl=new JLabel("Transposition cipher!");
    private TextField txt1=new TextField();
    private JLabel lbl1=new JLabel("Rails:");
    private JButton two=new JButton("2");
    private JButton three=new JButton("3");
    private JButton four=new JButton("4");
    private TextField input1=new TextField();
    private JLabel railfence=new JLabel("(1) Rail Fence Cipher");
    private JButton RFEncode=new JButton("Encode");
    private JButton RFDecode=new JButton("Decode");
    private JButton info1=new JButton("i");
    private int i;
    private WorkArea area=new WorkArea("Transposition");
    private TextField txt2=new TextField();
    private JLabel lbl2=new JLabel("Row Dimension:");
    private TextField input2=new TextField();
    private JButton ch1=new JButton("2");
    private JButton ch2=new JButton("3");
    private JButton ch3=new JButton("4");
    private JLabel route=new JLabel("(2) Route Cipher");
    private JButton REncode=new JButton("Encode");
    private JButton info2=new JButton("i");
    private JLabel direction=new JLabel("Direction");
    private TextField input3=new TextField();
    private JButton c=new JButton("Clockwise");
    private JButton cc=new JButton("Counter-Clockwise");
    private TextField input4=new TextField();
    private TextField input5=new TextField();
    private JButton right=new JButton("Right");
    private JButton left=new JButton("Left");
    private JButton top=new JButton("Top");
    private JButton bot=new JButton("Bottom");
    private JLabel columnar=new JLabel("          (3) Columnar Cipher           ");
    private TextField txt3=new TextField();
    private JLabel keyword=new JLabel("Keyword:");
    private TextField keyInput=new TextField();
    private JButton CEncode=new JButton("Encode");
    private JButton CDecode=new JButton("Decode");
    private JButton info3=new JButton("i");
    private JButton back = new JButton("Back");
    
    
    public Transposition(){
        
        //railfence cipher
        this.add(lbl,BorderLayout.NORTH);
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        this.add(panel,BorderLayout.CENTER);
        panel.add(railfence);
        txt1.setColumns(35);
        panel.add(txt1);
        panel.add(lbl1);
        input1.setColumns(3);
        input1.setEditable(false);
        panel.add(input1);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        panel.add(two);
        panel.add(three);
        panel.add(four);
        RFEncode.addActionListener(this);
        panel.add(RFEncode);
        RFDecode.addActionListener(this);
        panel.add(RFDecode);
        info1.addActionListener(this);
        panel.add(info1);
        
        //route cipher
        panel.add(route);
        txt2.setColumns(35);
        panel.add(txt2);
        panel.add(lbl2);
        input2.setColumns(3);
        input2.setEditable(false);
        panel.add(input2);
        ch1.addActionListener(this);
        ch2.addActionListener(this);
        ch3.addActionListener(this);
        panel.add(ch1);
        panel.add(ch2);
        panel.add(ch3);
        panel.add(direction);
        input3.setColumns(15);
        input3.setEditable(false);
        panel.add(input3);
        c.addActionListener(this);
        cc.addActionListener(this);
        panel.add(c);
        panel.add(cc);
        input4.setColumns(10);
        input4.setEditable(false);
        panel.add(input4);
        top.addActionListener(this);
        bot.addActionListener(this);
        panel.add(top);
        panel.add(bot);
        input5.setColumns(10);
        input5.setEditable(false);
        panel.add(input5);
        right.addActionListener(this);
        left.addActionListener(this);
        panel.add(right);
        panel.add(left);
        REncode.addActionListener(this);
        panel.add(REncode);
        info2.addActionListener(this);
        panel.add(info2);
        
        //Columnar cipher
        panel.add(columnar);
        txt3.setColumns(35);
        panel.add(txt3);
        panel.add(keyword);
        keyInput.setColumns(20);
        panel.add(keyInput);
        CEncode.addActionListener(this);
        CDecode.addActionListener(this);
        panel.add(CEncode);
        panel.add(CDecode);
        info3.addActionListener(this);
        panel.add(info3);
        
        this.setSize(300,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        //RailFenceCipher
        if(e.getSource()==RFEncode){
            
            ArrayList <Character> con1=new ArrayList<>();
            ArrayList <Character> con2=new ArrayList<>();
            ArrayList <Character> con3=new ArrayList<>();
            ArrayList<Character> con4=new ArrayList<>();
            ArrayList <Character> combined=new ArrayList<>();
            String input,message;
            int turn=0;
            input=txt1.getText();
            txt1.setText("");
            input=input.toUpperCase();
            char[] charArr=input.toCharArray();
            
            if(input.equals("")){
                
                JOptionPane.showMessageDialog(this,"Please input a message to be encrypted!");
                
            }
            
            else if(input1.getText().equals("2")){
                
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
                
                //store the message in two different containers
                for(i=0;i<charArr1.length;i++){
                    
                    if(charArr1[i]!='♫'){
                        if(i%2==0){
                        
                            con1.add(charArr1[i]);
                        
                        }
                    
                        else{
                        
                            con2.add(charArr1[i]);
                        
                        }
                    }
                    
                    else
                        break;
                    
                }
                
                //combine them into one container -> new ciphered message
                for(i=0;i<con1.size();i++){
                    
                   combined.add(con1.get(i));
                    
                }
                for(i=0;i<con2.size();i++){
                    
                    combined.add(con2.get(i));
                    
                }
                
                message=combined.get(0).toString();
                for(i=1;i<combined.size();i++){
                    
                    message=message.concat(combined.get(i).toString());
                    if((i+1)%5==0){
                        
                        message=message.concat(" ");
                        
                    }
                    
                }
                
                area.setOutput(message+"\n");
                
            }
            
            else if(input1.getText().equals("3")){
                
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
                
                //store the message in three different containers
                for(i=0;i<charArr1.length;i++){
                    
                    if(charArr1[i]!='♫'){
                        if(turn==0){
                        
                            con1.add(charArr1[i]);
                            turn=1;
                        
                        }
                    
                        else if(turn==1){
                        
                            con2.add(charArr1[i]);
                            turn=2;
                            
                        }
                        
                        else if(turn==2){
                            
                            con3.add(charArr1[i]);
                            turn=3;
                            
                        }
                        
                        else if(turn==3){
                            
                            con2.add(charArr1[i]);
                            turn=0;
                            
                        }
                        
                    }
                    
                    else
                        break;
                    
                }
                
                //combine them into one container -> new ciphered message
                for(i=0;i<con1.size();i++){
                    
                   combined.add(con1.get(i));
                    
                }
                for(i=0;i<con2.size();i++){
                    
                    combined.add(con2.get(i));
                    
                }
                for(i=0;i<con3.size();i++){
                    
                    combined.add(con3.get(i));
                    
                }
                
                
                message=combined.get(0).toString();
                for(i=1;i<combined.size();i++){
                    
                    message=message.concat(combined.get(i).toString());
                    if((i+1)%5==0){
                        
                        message=message.concat(" ");
                        
                    }
                    
                }
                
                area.setOutput(message+"\n");
                
            }
            
            else if(input1.getText().equals("4")){
                
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
                
                //store the message in four different containers
                for(i=0;i<charArr1.length;i++){
                    
                    if(charArr1[i]!='♫'){
                        if(turn==0){
                        
                            con1.add(charArr1[i]);
                            turn=1;
                        
                        }
                    
                        else if(turn==1){
                        
                            con2.add(charArr1[i]);
                            turn=2;
                        
                        }
                        
                        else if(turn==2){
                            
                            con3.add(charArr1[i]);
                            turn=3;
                            
                        }
                        
                        else if(turn==3){
                            
                            con4.add(charArr1[i]);
                            turn=4;
                            
                        }
                        
                        else if(turn==4){
                            
                            con3.add(charArr1[i]);
                            turn=5;
                            
                        }
                        
                        else if(turn==5){
                            
                            con2.add(charArr1[i]);
                            turn=0;
                            
                        }
                        
                    }
                    
                    else
                        break;
                    
                }
                
                //combine them into one container -> new ciphered message
                for(i=0;i<con1.size();i++){
                    
                   combined.add(con1.get(i));
                    
                }
                for(i=0;i<con2.size();i++){
                    
                    combined.add(con2.get(i));
                    
                }
                
                for(i=0;i<con3.size();i++){
                    
                    combined.add(con3.get(i));
                    
                }
                
                for(i=0;i<con4.size();i++){
                    
                    combined.add(con4.get(i));
                    
                }
                
                message=combined.get(0).toString();
                for(i=1;i<combined.size();i++){
                    
                    message=message.concat(combined.get(i).toString());
                    if((i+1)%5==0){
                        
                        message=message.concat(" ");
                        
                    }
                    
                }
                
                area.setOutput(message+"\n");
                
            }
            else{
                
                JOptionPane.showMessageDialog(this,"Please specify the number of rails to be used");
                
            }
            
        }
        
        else if(e.getSource()==info1){
            
            JOptionPane.showMessageDialog(this, "Rail Fence cipher is a type of transposition cipher that writes the text downwards on successive rails of an imaginary fence "
                        + "then moving up when the bottom is reached. The cipher message is then read off by the rows.");
            
        }
        
        //get user preference on number of rails
        else if(e.getSource()==two){
            
            input1.setText("2");
            
        }
        
        else if(e.getSource()==three){
            
            input1.setText("3");
            
        }
        
        else if(e.getSource()==four){
            
            input1.setText("4");
            
        }
        
        else if(e.getSource()==RFDecode){
            
            ArrayList <Character> con1=new ArrayList<>();
            ArrayList <Character> con2=new ArrayList<>();
            ArrayList <Character> con3=new ArrayList<>();
            ArrayList<Character> con4=new ArrayList<>();
            ArrayList<Character> temp=new ArrayList<>();
            ArrayList <Character> combined=new ArrayList<>();
            String input,message;
            int turn=0;
            input=txt1.getText();
            txt1.setText("");
            char[] charArr=input.toCharArray();
            
            if(input1.getText().equals("2")){
                
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
                
                //store the message in in an arraylist
                for(i=0;i<charArr1.length;i++){
                    
                    if(charArr1[i]!='♫'){
                        
                        temp.add(charArr1[i]);
                        
                    }
                    
                    else
                        break;
                    
                }
                
                //divide them into two containers
                if(temp.size()%2==0){
                    
                    for(i=0;i<(temp.size()/2);i++){
                    
                        con1.add(temp.get(i));
                        
                    }
                    
                    for(i=(temp.size()/2);i<temp.size();i++){
                        
                        con2.add(temp.get(i));
                        
                    }
                        
                }
                
                else{
                    
                    for(i=0;i<((temp.size())/2);i++){
                    
                        con1.add(temp.get(i));
                        
                    }
                    
                    con1.add(temp.get(((temp.size())/2)));
                    
                    for(i=((temp.size())/2)+1;i<temp.size();i++){
                        
                        con2.add(temp.get(i));
                        
                    }
                    
                }
                
                //combine them into one container -> new decoded message
                int count1=0;
                int count2=0;
                for(i=0;i<temp.size();i++){
                    
                    if(i%2==0){
                        
                        combined.add(con1.get(count1));
                        count1++;
                        
                    }
                    
                    else{
                        
                        combined.add(con2.get(count2));
                        count2++;
                        
                    }
                    
                }
                
                message=combined.get(0).toString();
                for(i=1;i<combined.size();i++){
                    
                    message=message.concat(combined.get(i).toString());
                    
                }
                
                area.setOutput(message+"\n");
                
            }
            
            else if(input1.getText().equals("3")){
                
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
                
                //store the message in in an arraylist
                for(i=0;i<charArr1.length;i++){
                    
                    if(charArr1[i]!='♫'){
                        
                        temp.add(charArr1[i]);
                        
                    }
                    
                    else
                        break;
                    
                }
                
                int check=0;
                int check1=0;
                int check2=0;
                for(i=0;i<temp.size();i++){
                        
                    if(check==0){
                        
                        check1++;
                        check=1;
                        
                    }
                    
                    else if(check==1){
                        
                        check2++;
                        check=2;
                        
                    }
                    
                    else if(check==2){
                        
                        check=3;
                        
                    }
                    
                    else if(check==3){
                        
                        check2++;
                        check=0;
                        
                    }
                    
                }
                
                //divide them into THREE containers
                    
                for(i=0;i<check1;i++){
                    
                    con1.add(temp.get(i));
                        
                }
                    
                for(i=check1;i<(check1+check2);i++){
                        
                    con2.add(temp.get(i));
                        
                }
                    
                for(i=(check1+check2);i<temp.size();i++){
                        
                    con3.add(temp.get(i));
                        
                }
                
                //combine them into one container -> new decoded message
                int count1=0;
                int count2=0;
                int count3=0;
                for(i=0;i<temp.size();i++){
                    
                    if(turn==0){
                        
                        combined.add(con1.get(count1));
                        count1++;
                        turn=1;
                        
                    }
                    
                    else if(turn==1){
                        
                        combined.add(con2.get(count2));
                        count2++;
                        turn=2;
                        
                    }
                    
                    else if(turn==2){
                        
                        combined.add(con3.get(count3));
                        count3++;
                        turn=3;
                        
                    }
                    
                    else if(turn==3){
                        
                        combined.add(con2.get(count2));
                        count2++;
                        turn=0;
                        
                    }
                    
                }
                
                message=combined.get(0).toString();
                for(i=1;i<combined.size();i++){
                    
                    message=message.concat(combined.get(i).toString());
                    
                }
                
                area.setOutput(message+"\n");
                
            }
            
            else if(input1.getText().equals("4")){
                
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
                
                //store the message in in an arraylist
                for(i=0;i<charArr1.length;i++){
                    
                    if(charArr1[i]!='♫'){
                        
                        temp.add(charArr1[i]);
                        
                    }
                    
                    else
                        break;
                    
                }
                
                int check=0;
                int check1=0;
                int check2=0;
                int check3=0;
                for(i=0;i<temp.size();i++){
                        
                    if(check==0){
                        
                        check1++;
                        check=1;
                        
                    }
                    
                    else if(check==1){
                        
                        check2++;
                        check=2;
                        
                    }
                    
                    else if(check==2){
                        
                        check3++;
                        check=3;
                        
                    }
                    
                    else if(check==3){
                        
                        check=4;
                        
                    }
                    
                    else if(check==4){
                        
                        check3++;
                        check=5;
                        
                    }
                    
                    else if(check==5){
                        
                        check2++;
                        check=0;
                        
                    }
                    
                }
                
                //divide them into THREE containers
                    
                for(i=0;i<check1;i++){
                    
                    con1.add(temp.get(i));
                        
                }
                    
                for(i=check1;i<(check1+check2);i++){
                        
                    con2.add(temp.get(i));
                        
                }
                    
                for(i=(check1+check2);i<(check1+check2+check3);i++){
                        
                    con3.add(temp.get(i));
                        
                }
                
                for(i=(check1+check2+check3);i<temp.size();i++){
                    
                    con4.add(temp.get(i));
                    
                }
                
                //combine them into one container -> new decoded message
                int count1=0;
                int count2=0;
                int count3=0;
                int count4=0;
                for(i=0;i<temp.size();i++){
                    
                    if(turn==0){
                        
                        combined.add(con1.get(count1));
                        count1++;
                        turn=1;
                        
                    }
                    
                    else if(turn==1){
                        
                        combined.add(con2.get(count2));
                        count2++;
                        turn=2;
                        
                    }
                    
                    else if(turn==2){
                        
                        combined.add(con3.get(count3));
                        count3++;
                        turn=3;
                        
                    }
                    
                    else if(turn==3){
                        
                        combined.add(con4.get(count4));
                        count4++;
                        turn=4;
                        
                    }
                    
                    else if(turn==4){
                        
                        combined.add(con3.get(count3));
                        count3++;
                        turn=5;
                        
                    }
                    
                    else if(turn==5){
                        
                        combined.add(con2.get(count2));
                        count2++;
                        turn=0;
                        
                    }
                    
                }
                
                message=combined.get(0).toString();
                for(i=1;i<combined.size();i++){
                    
                    message=message.concat(combined.get(i).toString());
                    
                }
                
                area.setOutput(message+"\n");
                
            }
            
            else{
                
                JOptionPane.showMessageDialog(this,"Please specify the number of rails to be used");
                
            }
            
        }
        
        else if(e.getSource()==info2){
            
            JOptionPane.showMessageDialog(this,"In Route Cipher, the message is first written out in a specified dimension, then read off in a pattern given in the key.");
            
        }
        
        else if(e.getSource()==ch1){
            
            input2.setText("2");
            
        }
        
        else if(e.getSource()==ch2){
            
            input2.setText("3");
            
        }
        
        else if(e.getSource()==ch3){
            
            input2.setText("4");
            
        }
        
        else if(e.getSource()==c){
            
            input3.setText("Clockwise");
            
        }
        
        else if(e.getSource()==cc){
            
            input3.setText("CounterClockwise");
            
        }
        
        else if(e.getSource()==top){
            
            input4.setText("Top");
            
        }
        
        else if(e.getSource()==bot){
            
            input4.setText("Bottom");
            
        }
        
        else if(e.getSource()==left){
            
            input5.setText("Left");
            
        }
        
        else if(e.getSource()==right){
            
            input5.setText("Right");
            
        }
        
        else if(e.getSource()==REncode){
            
            String input=txt2.getText();
            txt2.setText("");
            input=input.toUpperCase();
            char[] charArr=input.toCharArray();
            char[] charArr1=new char[100];
            ArrayList <Character> temp=new ArrayList<>();
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
            String rowInput=input2.getText();
            String dirInput=input3.getText();
            String height=input4.getText();
            String width=input5.getText();
            ArrayList <Character> con1=new ArrayList<>();
            ArrayList <Character> con2=new ArrayList<>();
            ArrayList <Character> con3=new ArrayList<>();
            ArrayList <Character> con4=new ArrayList<>();
            ArrayList <Character> finCon=new ArrayList<>();
            String output="";
            int turn=0;
            
            if(input.equals("")){
                
                JOptionPane.showMessageDialog(this,"Please input a message to be encrypted!");
                
            }
            
            else if(rowInput.equals("2")){
                
                for(i=0;i<temp.size();i++){
                    
                    if(i%2==0){
                        
                        con1.add(temp.get(i));
                        
                    }
                    
                    else{
                        
                        con2.add(temp.get(i));
                        
                    }
                    
                }
                
                if(dirInput.equals("Clockwise")){
                    
                    if(height.equals("Top")){
                        
                        if(width.equals("Right")){
                            
                            //store the two containers into one, encryption process#1
                            finCon.add(con1.get(con1.size()-1));
                            for(i=con2.size()-1;i>=0;i--){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            for(i=0;i<con1.size()-1;i++){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            
                            //transforming the character array to string then place it on output textarea
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else if(width.equals("Left")){
                            
                            //store the two containers into one, encryption process#1
                            for(i=0;i<con1.size();i++){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            for(i=con2.size()-1;i>=0;i--){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else{
                            
                            JOptionPane.showMessageDialog(this,"Please indicate whether starting from right or left!");
                            
                        }
                        
                    }
                    
                    else if(height.equals("Bottom")){
                        
                        if(width.equals("Right")){
                            
                            //store the two containers into one, encryption process#1
                            for(i=con2.size()-1;i>=0;i--){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            for(i=0;i<con1.size();i++){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            
                            //transforming the character array to string then place it on output textarea
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else if(width.equals("Left")){
                            
                            //store the two containers into one, encryption process#1
                            finCon.add(con2.get(0));
                            for(i=0;i<con1.size();i++){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            for(i=con2.size()-1;i>0;i--){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else{
                            
                            JOptionPane.showMessageDialog(this,"Please indicate whether starting from right or left!");
                            
                        }
                        
                    }
                    
                    else{
                        
                        JOptionPane.showMessageDialog(this,"Please indicate whether starting from top or bottom!");
                        
                    }
                    
                }
                
                else if(dirInput.equals("CounterClockwise")){
                    
                    if(height.equals("Top")){
                        
                        if(width.equals("Right")){
                            
                            //store the two containers into one, encryption process#1
                            for(i=con1.size()-1;i>=0;i--){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            for(i=0;i<con2.size();i++){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            //transforming the character array to string then place it on output textarea
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else if(width.equals("Left")){
                            
                            //store the two containers into one, encryption process#1
                            finCon.add(con1.get(0));
                            for(i=0;i<con2.size();i++){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            for(i=con1.size()-1;i>0;i--){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else{
                            
                            JOptionPane.showMessageDialog(this,"Please indicate whether starting from right or left!");
                            
                        }
                        
                    }
                    
                    else if(height.equals("Bottom")){
                        
                        if(width.equals("Right")){
                            
                            //store the two containers into one, encryption process#1
                            finCon.add(con2.get(con2.size()-1));
                            for(i=con1.size()-1;i>=0;i--){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            for(i=0;i<con2.size()-1;i++){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            //transforming the character array to string then place it on output textarea
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else if(width.equals("Left")){
                            
                            //store the two containers into one, encryption process#1
                            for(i=0;i<con2.size();i++){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            for(i=con1.size()-1;i>=0;i--){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else{
                            
                            JOptionPane.showMessageDialog(this,"Please indicate whether starting from right or left!");
                            
                        }
                        
                    }
                    
                    else{
                        
                        JOptionPane.showMessageDialog(this,"Please indicate whether starting from top or bottom!");
                        
                    }
                    
                }
                
                else{
                    
                    JOptionPane.showMessageDialog(this,"Please input your preferred direction for encryption!");
                    
                }
                
            }
            
            else if(rowInput.equals("3")){
                
                //store the message into 3 containers
                for(i=0;i<temp.size();i++){
                    
                    if(turn==0){
                        
                        con1.add(temp.get(i));
                        turn=1;
                        
                    }
                    
                    else if(turn==1){
                        
                        con2.add(temp.get(i));
                        turn=2;
                        
                    }
                    
                    else if(turn==2){
                        
                        con3.add(temp.get(i));
                        turn=0;
                        
                    }
                    
                }
                
                if(dirInput.equals("Clockwise")){
                    
                    if(height.equals("Top")){
                        
                        if(width.equals("Right")){
                            
                            //store the two containers into one, encryption process#1
                            finCon.add(con1.get(con1.size()-1));
                            finCon.add(con2.get(con2.size()-1));
                            for(i=con3.size()-1;i>=0;i--){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            finCon.add(con2.get(0));
                            for(i=0;i<con1.size()-1;i++){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            for(i=con2.size()-2;i>0;i--){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            //transforming the character array to string then place it on output textarea
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else if(width.equals("Left")){
                            
                            //store the two containers into one, encryption process#1
                            for(i=0;i<con1.size();i++){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            finCon.add(con2.get(con2.size()-1));
                            for(i=con3.size()-1;i>=0;i--){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            for(i=0;i<con2.size()-1;i++){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else{
                            
                            JOptionPane.showMessageDialog(this,"Please indicate whether starting from right or left!");
                            
                        }
                        
                    }
                    
                    else if(height.equals("Bottom")){
                        
                        if(width.equals("Right")){
                            
                            //store the two containers into one, encryption process#1
                            for(i=con3.size()-1;i>=0;i--){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            finCon.add(con2.get(0));
                            for(i=0;i<con1.size();i++){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            for(i=con2.size()-1;i>0;i--){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            //transforming the character array to string then place it on output textarea
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else if(width.equals("Left")){
                            
                            //store the two containers into one, encryption process#1
                            finCon.add(con3.get(0));
                            finCon.add(con2.get(0));
                            for(i=0;i<con1.size();i++){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            finCon.add(con2.get(con2.size()-1));
                            for(i=con3.size()-1;i>0;i--){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            for(i=1;i<con2.size()-1;i++){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else{
                            
                            JOptionPane.showMessageDialog(this,"Please indicate whether starting from right or left!");
                            
                        }
                        
                    }
                    
                    else{
                        
                        JOptionPane.showMessageDialog(this,"Please indicate whether starting from top or bottom!");
                        
                    }
                    
                }
                
                else if(dirInput.equals("CounterClockwise")){
                    
                    if(height.equals("Top")){
                        
                        if(width.equals("Right")){
                            
                            //store the two containers into one, encryption process#1
                            for(i=con1.size()-1;i>=0;i--){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            finCon.add(con2.get(0));
                            for(i=0;i<con3.size();i++){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            for(i=con2.size()-1;i>0;i--){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            //transforming the character array to string then place it on output textarea
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else if(width.equals("Left")){
                            
                            //store the two containers into one, encryption process#1
                            finCon.add(con1.get(0));
                            finCon.add(con2.get(0));
                            for(i=0;i<con3.size();i++){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            finCon.add(con2.get(con2.size()-1));
                            for(i=con1.size()-1;i>0;i--){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            for(i=1;i<con2.size()-1;i++){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else{
                            
                            JOptionPane.showMessageDialog(this,"Please indicate whether starting from right or left!");
                            
                        }
                        
                    }
                    
                    else if(height.equals("Bottom")){
                        
                        if(width.equals("Right")){
                            
                            //store the two containers into one, encryption process#1
                            finCon.add(con3.get(con3.size()-1));
                            finCon.add(con2.get(con2.size()-1));
                            for(i=con1.size()-1;i>=0;i--){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            finCon.add(con2.get(0));
                            for(i=0;i<con3.size()-1;i++){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            for(i=con2.size()-2;i>0;i--){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            //transforming the character array to string then place it on output textarea
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else if(width.equals("Left")){
                            
                            //store the two containers into one, encryption process#1
                            for(i=0;i<con3.size();i++){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            finCon.add(con2.get(con2.size()-1));
                            for(i=con1.size()-1;i>=0;i--){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            for(i=0;i<con2.size()-1;i++){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else{
                            
                            JOptionPane.showMessageDialog(this,"Please indicate whether starting from right or left!");
                            
                        }
                        
                    }
                    
                    else{
                        
                        JOptionPane.showMessageDialog(this,"Please indicate whether starting from top or bottom!");
                        
                    }
                    
                }
                
                else{
                    
                    JOptionPane.showMessageDialog(this,"Please input your preferred direction for encryption!");
                    
                }
                
            }
            
            else if(rowInput.equals("4")){
                
                //store the message into 4 containers
                for(i=0;i<temp.size();i++){
                    
                    if(turn==0){
                        
                        con1.add(temp.get(i));
                        turn=1;
                        
                    }
                    
                    else if(turn==1){
                        
                        con2.add(temp.get(i));
                        turn=2;
                        
                    }
                    
                    else if(turn==2){
                        
                        con3.add(temp.get(i));
                        turn=3;
                        
                    }
                    
                    else if(turn==3){
                        
                        con4.add(temp.get(i));
                        turn=0;
                        
                    }
                    
                }
                
                if(dirInput.equals("Clockwise")){
                    
                    if(height.equals("Top")){
                        
                        if(width.equals("Right")){
                            
                            //store the two containers into one, encryption process#1
                            finCon.add(con1.get(con1.size()-1));
                            finCon.add(con2.get(con2.size()-1));
                            finCon.add(con3.get(con3.size()-1));
                            for(i=con4.size()-1;i>=0;i--){
                                
                                finCon.add(con4.get(i));
                                
                            }
                            finCon.add(con3.get(0));
                            finCon.add(con2.get(0));
                            for(i=0;i<con1.size()-1;i++){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            for(i=con2.size()-2;i>0;i--){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            for(i=1;i<con3.size()-1;i++){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            
                            //transforming the character array to string then place it on output textarea
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else if(width.equals("Left")){
                            
                            //store the two containers into one, encryption process#1
                            for(i=0;i<con1.size();i++){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            finCon.add(con2.get(con2.size()-1));
                            finCon.add(con3.get(con3.size()-1));
                            for(i=con4.size()-1;i>=0;i--){
                                
                                finCon.add(con4.get(i));
                                
                            }
                            finCon.add(con3.get(0));
                            for(i=0;i<con2.size()-1;i++){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            for(i=con3.size()-2;i>0;i--){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else{
                            
                            JOptionPane.showMessageDialog(this,"Please indicate whether starting from right or left!");
                            
                        }
                        
                    }
                    
                    else if(height.equals("Bottom")){
                        
                        if(width.equals("Right")){
                            
                            //store the two containers into one, encryption process#1
                            for(i=con4.size()-1;i>=0;i--){
                                
                                finCon.add(con4.get(i));
                                
                            }
                            finCon.add(con3.get(0));
                            finCon.add(con2.get(0));
                            for(i=0;i<con1.size();i++){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            for(i=con2.size()-1;i>0;i--){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            for(i=1;i<con3.size();i++){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            
                            //transforming the character array to string then place it on output textarea
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else if(width.equals("Left")){
                            
                            //store the two containers into one, encryption process#1
                            finCon.add(con4.get(0));
                            finCon.add(con3.get(0));
                            finCon.add(con2.get(0));
                            for(i=0;i<con1.size();i++){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            finCon.add(con2.get(con2.size()-1));
                            finCon.add(con3.get(con3.size()-1));
                            for(i=con4.size()-1;i>0;i--){
                                
                                finCon.add(con4.get(i));
                                
                            }
                            for(i=1;i<con3.size()-1;i++){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            for(i=con2.size()-2;i>0;i--){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else{
                            
                            JOptionPane.showMessageDialog(this,"Please indicate whether starting from right or left!");
                            
                        }
                        
                    }
                    
                    else{
                        
                        JOptionPane.showMessageDialog(this,"Please indicate whether starting from top or bottom!");
                        
                    }
                    
                }
                
                else if(dirInput.equals("CounterClockwise")){
                    
                    if(height.equals("Top")){
                        
                        if(width.equals("Right")){
                            
                            //store the two containers into one, encryption process#1
                            for(i=con1.size()-1;i>=0;i--){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            finCon.add(con2.get(0));
                            finCon.add(con3.get(0));
                            for(i=0;i<con4.size();i++){
                                
                                finCon.add(con4.get(i));
                                
                            }
                            for(i=con3.size()-1;i>0;i--){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            for(i=1;i<con2.size();i++){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            //transforming the character array to string then place it on output textarea
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else if(width.equals("Left")){
                            
                            //store the two containers into one, encryption process#1
                            finCon.add(con1.get(0));
                            finCon.add(con2.get(0));
                            finCon.add(con3.get(0));
                            for(i=0;i<con4.size();i++){
                                
                                finCon.add(con4.get(i));
                                
                            }
                            finCon.add(con3.get(con3.size()-1));
                            finCon.add(con2.get(con2.size()-1));
                            for(i=con1.size()-1;i>0;i--){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            for(i=1;i<con2.size()-1;i++){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            for(i=con3.size()-2;i>0;i--){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else{
                            
                            JOptionPane.showMessageDialog(this,"Please indicate whether starting from right or left!");
                            
                        }
                        
                    }
                    
                    else if(height.equals("Bottom")){
                        
                        if(width.equals("Right")){
                            
                            //store the two containers into one, encryption process#1
                            finCon.add(con4.get(con4.size()-1));
                            finCon.add(con3.get(con3.size()-1));
                            finCon.add(con2.get(con2.size()-1));
                            for(i=con1.size()-1;i>=0;i--){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            finCon.add(con2.get(0));
                            finCon.add(con3.get(0));
                            for(i=0;i<con4.size()-1;i++){
                                
                                finCon.add(con4.get(i));
                                
                            }
                            for(i=con3.size()-2;i>0;i--){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            for(i=1;i<con2.size()-1;i++){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            //transforming the character array to string then place it on output textarea
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else if(width.equals("Left")){
                            
                            //store the two containers into one, encryption process#1
                            for(i=0;i<con4.size();i++){
                                
                                finCon.add(con4.get(i));
                                
                            }
                            finCon.add(con3.get(con3.size()-1));
                            finCon.add(con2.get(con2.size()-1));
                            for(i=con1.size()-1;i>=0;i--){
                                
                                finCon.add(con1.get(i));
                                
                            }
                            finCon.add(con2.get(0));
                            for(i=0;i<con3.size()-1;i++){
                                
                                finCon.add(con3.get(i));
                                
                            }
                            for(i=con2.size()-2;i>0;i--){
                                
                                finCon.add(con2.get(i));
                                
                            }
                            
                            for(i=0;i<finCon.size();i++){
                                
                                output=output.concat(finCon.get(i).toString());
                                
                            }
                            area.setOutput(output);
                            
                        }
                        
                        else{
                            
                            JOptionPane.showMessageDialog(this,"Please indicate whether starting from right or left!");
                            
                        }
                        
                    }
                    
                    else{
                        
                        JOptionPane.showMessageDialog(this,"Please indicate whether starting from top or bottom!");
                        
                    }
                    
                }
                
                else{
                    
                    JOptionPane.showMessageDialog(this,"Please input your preferred direction for encryption!");
                    
                }
                
            }
            
            else{
                
                JOptionPane.showMessageDialog(this,"Please input your preferred row dimension!");
                
            }
            
            
        }
        
        else if(e.getSource()==info3){
            
            JOptionPane.showMessageDialog(this,"In columnar cipher, the message is written out by a number of columns determined from the length of the keyword\n"
                    + "then the ciphered message is read per column by the order of letters in the keyword, each letter of the keyword represents one column.");
            
        }
        
        else if(e.getSource()==CEncode){
            
            if(keyInput.getText().equals("")){
                
                JOptionPane.showMessageDialog(this,"Please enter a keyword");
                
            }
            
            else if(keyInput.getText().length()>4||keyInput.getText().length()<2){
                
                JOptionPane.showMessageDialog(this,"Keyword too long or too short! Choose another.");
                
            }
            
            else if(checkUnique(keyInput.getText())==false){
                
                JOptionPane.showMessageDialog(this,"Letters in keyword must be unique!");
                
            }
            
            else{
                
                if(txt3.getText()==""){
                    
                    JOptionPane.showMessageDialog(this,"Please enter your message");
                    
                }
                
                else{
                    
                    String key=keyInput.getText();
                    String message=txt3.getText();
                    message=message.toUpperCase();
                    ArrayList <Character> con1=new ArrayList<>();
                    ArrayList <Character> con2=new ArrayList<>();
                    ArrayList <Character> con3=new ArrayList<>();
                    ArrayList <Character> con4=new ArrayList<>();
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
                    
                    int turn=0;
                    String output="";
                    
                    //divide them into two containers/columns
                    if(key.length()==2){
                        
                        for(i=0;i<temp.size();i++){
                            
                            if(turn==0){
                            
                                con1.add(temp.get(i));
                                turn=1;
                            
                            }
                            
                            else{
                                
                                con2.add(temp.get(i));
                                turn=0;
                                
                            }
                            
                        }
                        
                        if(con1.size()!=con2.size()){
                            
                            con2.add('Z');
                            
                        }
                        
                        //encrypting process, know the order of the column via the keyword
                        if(key.charAt(0)<key.charAt(1)){
                            
                            for(i=0;i<con1.size();i++){
                                
                                output=output.concat(con1.get(i).toString());
                                
                            }
                            
                            for(i=0;i<con2.size();i++){
                                
                                output=output.concat(con2.get(i).toString());
                                
                            }
                            
                        }
                        
                        else{
                            
                            for(i=0;i<con2.size();i++){
                                
                                output=output.concat(con2.get(i).toString());
                                
                            }
                            
                            for(i=0;i<con1.size();i++){
                                
                                output=output.concat(con1.get(i).toString());
                                
                            }
                            
                        }
                        
                    }
                    
                    else if(key.length()==3){
                        
                        //divide into 3 containers
                        for(i=0;i<temp.size();i++){
                            
                            if(turn==0){
                            
                                con1.add(temp.get(i));
                                turn=1;
                            
                            }
                            
                            else if(turn==1){
                                
                                con2.add(temp.get(i));
                                turn=2;
                                
                            }
                            
                            else if(turn==2){
                                
                                con3.add(temp.get(i));
                                turn=0;
                                
                            }
                            
                        }
                        
                        if(con1.size()!=con2.size()){
                            
                            con2.add('Z');
                            
                        }
                        
                        if(con1.size()!=con3.size()){
                                
                            con3.add('X');
                                
                        }
                        
                        
                        
                        //know order of columns via keyword
                        if(key.charAt(0)<key.charAt(1)&&key.charAt(0)<key.charAt(2)){
                            
                            for(i=0;i<con1.size();i++){
                                        
                                output=output.concat(con1.get(i).toString());
                                        
                            }
                         
                            if(key.charAt(1)<key.charAt(2)){
                                
                                for(i=0;i<con2.size();i++){
                                
                                    output=output.concat(con2.get(i).toString());
                                
                                }
                                
                                for(i=0;i<con3.size();i++){
                                
                                    output=output.concat(con3.get(i).toString());
                                
                                }
                                
                            }
                            
                            else{
                                
                                for(i=0;i<con3.size();i++){
                                
                                    output=output.concat(con3.get(i).toString());
                                
                                }
                                
                                for(i=0;i<con2.size();i++){
                                
                                    output=output.concat(con2.get(i).toString());
                                
                                }
                                
                            }
                            
                        }
                        
                        else if(key.charAt(1)<key.charAt(0)&&key.charAt(1)<key.charAt(2)){
                            
                            for(i=0;i<con2.size();i++){
                                        
                                output=output.concat(con2.get(i).toString());
                                        
                            }
                            
                            if(key.charAt(0)<key.charAt(2)){
                                
                                for(i=0;i<con1.size();i++){
                                
                                    output=output.concat(con1.get(i).toString());
                                
                                }
                                
                                for(i=0;i<con3.size();i++){
                                
                                    output=output.concat(con3.get(i).toString());
                                
                                }
                                
                            }
                            
                            else{
                                
                                for(i=0;i<con3.size();i++){
                                
                                    output=output.concat(con3.get(i).toString());
                                
                                }
                                
                                for(i=0;i<con1.size();i++){
                                
                                    output=output.concat(con1.get(i).toString());
                                
                                }
                                
                            }
                            
                        }
                        
                        else{
                            
                            for(i=0;i<con3.size();i++){
                                        
                                output=output.concat(con3.get(i).toString());
                                        
                            }
                            
                            if(key.charAt(0)<key.charAt(1)){
                                
                                for(i=0;i<con1.size();i++){
                                        
                                    output=output.concat(con1.get(i).toString());
                                        
                                }
                                
                                for(i=0;i<con2.size();i++){
                                        
                                    output=output.concat(con2.get(i).toString());
                                        
                                }
                                
                            }
                            
                            else{
                                
                                for(i=0;i<con2.size();i++){
                                        
                                    output=output.concat(con2.get(i).toString());
                                        
                                }
                                
                                for(i=0;i<con1.size();i++){
                                        
                                    output=output.concat(con1.get(i).toString());
                                        
                                }
                                
                            }
                            
                        }
                        
                    }
                    
                    else if(key.length()==4){
                        
                        //divide into 4 containers
                        for(i=0;i<temp.size();i++){
                            
                            if(turn==0){
                            
                                con1.add(temp.get(i));
                                turn=1;
                            
                            }
                            
                            else if(turn==1){
                                
                                con2.add(temp.get(i));
                                turn=2;
                                
                            }
                            
                            else if(turn==2){
                                
                                con3.add(temp.get(i));
                                turn=3;
                                
                            }
                            
                            else if(turn==3){
                                
                                con4.add(temp.get(i));
                                turn=0;
                                
                            }
                            
                        }
                        
                        if(con1.size()!=con2.size()){
                            
                            con2.add('Z');
                            
                        }
                    
                        if(con1.size()!=con3.size()){
                                
                            con3.add('X');
                            
                        }
                        
                        if(con1.size()!=con4.size()){
                                    
                            con4.add('C');
                                    
                        }
                        
                        //know order of columns via keyword
                        if(key.charAt(0)<key.charAt(1)&&key.charAt(0)<key.charAt(2)&&key.charAt(0)<key.charAt(3)){
                            
                            for(i=0;i<con1.size();i++){
                                        
                                output=output.concat(con1.get(i).toString());
                                        
                            }
                         
                            if(key.charAt(1)<key.charAt(2)&&key.charAt(1)<key.charAt(3)){
                                
                                for(i=0;i<con2.size();i++){
                                
                                    output=output.concat(con2.get(i).toString());
                                
                                }
                                
                                if(key.charAt(2)<key.charAt(3)){
                                    
                                    for(i=0;i<con3.size();i++){
                                
                                        output=output.concat(con3.get(i).toString());
                                
                                    }
                                    
                                    for(i=0;i<con4.size();i++){
                                
                                        output=output.concat(con4.get(i).toString());
                                
                                    }
                                    
                                }
                                
                                else{
                                    
                                    for(i=0;i<con4.size();i++){
                                
                                        output=output.concat(con4.get(i).toString());
                                
                                    }
                                    
                                    for(i=0;i<con3.size();i++){
                                
                                        output=output.concat(con3.get(i).toString());
                                
                                    }
                                    
                                }
                                
                            }
                            
                            else if(key.charAt(2)<key.charAt(1)&&key.charAt(2)<key.charAt(3)){
                                
                                for(i=0;i<con3.size();i++){
                                
                                    output=output.concat(con3.get(i).toString());
                                
                                }
                                
                                if(key.charAt(1)<key.charAt(3)){
                                    
                                    for(i=0;i<con2.size();i++){
                                
                                        output=output.concat(con2.get(i).toString());
                                
                                    }
                                    
                                    for(i=0;i<con4.size();i++){
                                
                                        output=output.concat(con4.get(i).toString());
                                
                                    }
                                    
                                }
                                
                                else{
                                    
                                    for(i=0;i<con4.size();i++){
                                
                                        output=output.concat(con4.get(i).toString());
                                
                                    }
                                    
                                    for(i=0;i<con2.size();i++){
                                
                                        output=output.concat(con2.get(i).toString());
                                
                                    }
                                    
                                }
                                
                            }
                            
                            else{
                                
                                for(i=0;i<con4.size();i++){
                                
                                    output=output.concat(con4.get(i).toString());
                                
                                }
                                
                                if(key.charAt(1)<key.charAt(2)){
                                    
                                    for(i=0;i<con2.size();i++){
                                
                                        output=output.concat(con2.get(i).toString());
                                
                                    }
                                    
                                    for(i=0;i<con3.size();i++){
                                
                                        output=output.concat(con3.get(i).toString());
                                
                                    }
                                    
                                }
                                
                                else{
                                    
                                    for(i=0;i<con3.size();i++){
                                
                                        output=output.concat(con3.get(i).toString());
                                
                                    }
                                    
                                    for(i=0;i<con2.size();i++){
                                
                                        output=output.concat(con2.get(i).toString());
                                
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                        else if(key.charAt(1)<key.charAt(0)&&key.charAt(1)<key.charAt(2)&&key.charAt(1)<key.charAt(3)){
                            
                            for(i=0;i<con2.size();i++){
                                        
                                output=output.concat(con2.get(i).toString());
                                        
                            }
                            
                            if(key.charAt(0)<key.charAt(2)&&key.charAt(0)<key.charAt(3)){
                                
                                for(i=0;i<con1.size();i++){
                                
                                    output=output.concat(con1.get(i).toString());
                                
                                }
                                
                                if(key.charAt(2)<key.charAt(3)){
                                    
                                    for(i=0;i<con3.size();i++){
                                
                                        output=output.concat(con3.get(i).toString());
                                
                                    }
                                    
                                    for(i=0;i<con4.size();i++){
                                
                                        output=output.concat(con4.get(i).toString());
                                
                                    }
                                    
                                }
                                
                                else{
                                    
                                    for(i=0;i<con4.size();i++){
                                
                                        output=output.concat(con4.get(i).toString());
                                
                                    }
                                    
                                    for(i=0;i<con3.size();i++){
                                
                                        output=output.concat(con3.get(i).toString());
                                
                                    }
                                    
                                }
                                
                            }
                            
                            else if(key.charAt(2)<key.charAt(0)&&key.charAt(2)<key.charAt(3)){
                                
                                for(i=0;i<con3.size();i++){
                                
                                    output=output.concat(con3.get(i).toString());
                                
                                }
                                
                                if(key.charAt(0)<key.charAt(3)){
                                    
                                    for(i=0;i<con1.size();i++){
                                
                                        output=output.concat(con1.get(i).toString());
                                
                                    }
                                    
                                    for(i=0;i<con4.size();i++){
                                
                                        output=output.concat(con4.get(i).toString());
                                
                                    }
                                    
                                }
                                
                                else{
                                    
                                    for(i=0;i<con4.size();i++){
                                
                                        output=output.concat(con4.get(i).toString());
                                
                                    }
                                    
                                    for(i=0;i<con1.size();i++){
                                
                                        output=output.concat(con1.get(i).toString());
                                
                                    }
                                    
                                }
                                
                            }
                            
                            else{
                                
                                for(i=0;i<con4.size();i++){
                                
                                    output=output.concat(con4.get(i).toString());
                                
                                }
                                
                                if(key.charAt(0)<key.charAt(2)){
                                    
                                    for(i=0;i<con1.size();i++){
                                
                                        output=output.concat(con1.get(i).toString());
                                
                                    }
                                    
                                    for(i=0;i<con3.size();i++){
                                
                                        output=output.concat(con3.get(i).toString());
                                
                                    }
                                    
                                }
                                
                                else{
                                    
                                    for(i=0;i<con3.size();i++){
                                
                                        output=output.concat(con3.get(i).toString());
                                
                                    }
                                    
                                    for(i=0;i<con1.size();i++){
                                
                                        output=output.concat(con1.get(i).toString());
                                
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                        else if(key.charAt(2)<key.charAt(0)&&key.charAt(2)<key.charAt(1)&&key.charAt(2)<key.charAt(3)){
                            
                            for(i=0;i<con3.size();i++){
                                        
                                output=output.concat(con3.get(i).toString());
                                        
                            }
                            
                            if(key.charAt(0)<key.charAt(1)&&key.charAt(0)<key.charAt(3)){
                                
                                for(i=0;i<con1.size();i++){
                                        
                                    output=output.concat(con1.get(i).toString());
                                        
                                }
                                
                                if(key.charAt(1)<key.charAt(3)){
                                    
                                    for(i=0;i<con2.size();i++){
                                        
                                        output=output.concat(con2.get(i).toString());
                                        
                                    }
                                    
                                    for(i=0;i<con4.size();i++){
                                        
                                        output=output.concat(con4.get(i).toString());
                                        
                                    }
                                    
                                }
                                
                                else{
                                    
                                    for(i=0;i<con4.size();i++){
                                        
                                        output=output.concat(con4.get(i).toString());
                                        
                                    }
                                    
                                    for(i=0;i<con2.size();i++){
                                        
                                        output=output.concat(con2.get(i).toString());
                                        
                                    }
                                    
                                }
                                
                            }
                            
                            else if(key.charAt(1)<key.charAt(0)&&key.charAt(1)<key.charAt(3)){
                                
                                for(i=0;i<con2.size();i++){
                                        
                                    output=output.concat(con2.get(i).toString());
                                        
                                }
                                
                                if(key.charAt(0)<key.charAt(3)){
                                    
                                    for(i=0;i<con1.size();i++){
                                        
                                        output=output.concat(con1.get(i).toString());
                                        
                                    }
                                    
                                    for(i=0;i<con4.size();i++){
                                        
                                        output=output.concat(con4.get(i).toString());
                                        
                                    }
                                    
                                }
                                
                                else{
                                    
                                    for(i=0;i<con4.size();i++){
                                        
                                        output=output.concat(con4.get(i).toString());
                                        
                                    }
                                    
                                    for(i=0;i<con1.size();i++){
                                        
                                        output=output.concat(con1.get(i).toString());
                                        
                                    }
                                    
                                }
                                
                            }
                            
                            else{
                                
                                for(i=0;i<con4.size();i++){
                                        
                                    output=output.concat(con4.get(i).toString());
                                        
                                }
                                
                                if(key.charAt(0)<key.charAt(1)){
                                    
                                    for(i=0;i<con1.size();i++){
                                        
                                        output=output.concat(con1.get(i).toString());
                                        
                                    }
                                    
                                    for(i=0;i<con2.size();i++){
                                        
                                        output=output.concat(con2.get(i).toString());
                                        
                                    }
                                    
                                }
                                
                                else{
                                    
                                    for(i=0;i<con2.size();i++){
                                        
                                        output=output.concat(con2.get(i).toString());
                                        
                                    }
                                    
                                    for(i=0;i<con1.size();i++){
                                        
                                        output=output.concat(con1.get(i).toString());
                                        
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                        else{
                            
                            for(i=0;i<con4.size();i++){
                                        
                                output=output.concat(con4.get(i).toString());
                                        
                            }
                            
                            if(key.charAt(0)<key.charAt(1)&&key.charAt(0)<key.charAt(2)){
                                
                                for(i=0;i<con1.size();i++){
                                        
                                    output=output.concat(con1.get(i).toString());
                                        
                                }
                                
                                if(key.charAt(1)<key.charAt(2)){
                                    
                                    for(i=0;i<con2.size();i++){
                                        
                                        output=output.concat(con2.get(i).toString());
                                        
                                    }
                                    
                                    for(i=0;i<con3.size();i++){
                                        
                                        output=output.concat(con3.get(i).toString());
                                        
                                    }
                                    
                                }
                                
                                else{
                                    
                                    for(i=0;i<con3.size();i++){
                                        
                                        output=output.concat(con3.get(i).toString());
                                        
                                    }
                                    
                                    for(i=0;i<con2.size();i++){
                                        
                                        output=output.concat(con2.get(i).toString());
                                        
                                    }
                                    
                                }
                                
                            }
                            
                            else if(key.charAt(1)<key.charAt(0)&&key.charAt(1)<key.charAt(2)){
                                
                                for(i=0;i<con2.size();i++){
                                        
                                    output=output.concat(con2.get(i).toString());
                                        
                                }
                                
                                if(key.charAt(0)<key.charAt(2)){
                                    
                                    for(i=0;i<con1.size();i++){
                                        
                                        output=output.concat(con1.get(i).toString());
                                        
                                    }
                                    
                                    for(i=0;i<con3.size();i++){
                                        
                                        output=output.concat(con3.get(i).toString());
                                        
                                    }
                                    
                                }
                                
                                else{
                                    
                                    for(i=0;i<con3.size();i++){
                                        
                                        output=output.concat(con3.get(i).toString());
                                        
                                    }
                                    
                                    for(i=0;i<con1.size();i++){
                                        
                                        output=output.concat(con1.get(i).toString());
                                        
                                    }
                                    
                                }
                                
                            }
                            
                            else{
                                
                                for(i=0;i<con3.size();i++){
                                        
                                    output=output.concat(con3.get(i).toString());
                                        
                                }
                                
                                if(key.charAt(0)<key.charAt(1)){
                                    
                                    for(i=0;i<con1.size();i++){
                                        
                                        output=output.concat(con1.get(i).toString());
                                        
                                    }
                                    
                                    for(i=0;i<con2.size();i++){
                                        
                                        output=output.concat(con2.get(i).toString());
                                        
                                    }
                                    
                                }
                                
                                else{
                                    
                                    for(i=0;i<con2.size();i++){
                                        
                                        output=output.concat(con2.get(i).toString());
                                        
                                    }
                                    
                                    for(i=0;i<con1.size();i++){
                                        
                                        output=output.concat(con1.get(i).toString());
                                        
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                    }
                    
                    area.setOutput(output);
                    
                }
                
            }
            
        }
        
        else if(e.getSource()==CDecode){
            
            if(keyInput.getText().equals("")){
                
                JOptionPane.showMessageDialog(this,"Please enter a keyword");
                
            }
            
            else if(keyInput.getText().length()>4||keyInput.getText().length()<2){
                
                JOptionPane.showMessageDialog(this,"Keyword too long or too short! Choose another.");
                
            }
            
            else if(checkUnique(keyInput.getText())==false){
                
                JOptionPane.showMessageDialog(this,"Letters in keyword must be unique!");
                
            }
            
            else{
                
                if(txt3.getText()==""){
                    
                    JOptionPane.showMessageDialog(this,"Please enter your message");
                    
                }
                
                else{
                    
                    String key=keyInput.getText();
                    String message=txt3.getText();
                    message=message.toUpperCase();
                    ArrayList <Character> con1=new ArrayList<>();
                    ArrayList <Character> con2=new ArrayList<>();
                    ArrayList <Character> con3=new ArrayList<>();
                    ArrayList <Character> con4=new ArrayList<>();
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
                    
                    int turn=0,count;
                    String output="";
                    
                    if(key.length()==2){
                        
                        for(i=0;i<temp.size();i++){
                            
                            if(i<temp.size()/2){
                                
                                con1.add(temp.get(i));
                                
                            }
                            
                            else{
                                
                                con2.add(temp.get(i));
                                
                            }
                            
                        }
                        
                        j=0;
                        if(key.charAt(0)<key.charAt(1)){
                            
                            for(i=0;i<temp.size();i++){
                                
                                if(i%2==0){
                                    
                                    output=output.concat(con1.get(j).toString());
                                    
                                }
                                
                                else{
                                    
                                    output=output.concat(con2.get(j).toString());
                                    j++;
                                    
                                }
                                
                            }
                            
                        }
                        
                        else{
                            
                            for(i=0;i<temp.size();i++){
                                
                                if(i%2==0){
                                    
                                    output=output.concat(con2.get(j).toString());
                                    
                                }
                                
                                else{
                                    
                                    output=output.concat(con1.get(j).toString());
                                    j++;
                                    
                                }
                                
                            }
                            
                        }
                        
                        area.setOutput(output);
                        
                    }
                    
                    else if(key.length()==3){
                        
                        //STORE THE MESSAGE INTO THREE CONTAINERS
                        count=temp.size()/3;
                        int count1=count;
                        int count2=count;
                        for(i=0;i<temp.size();i++){
                            
                            if(count1>0){
                                
                                con1.add(temp.get(i));
                                count1--;
                                
                            }
                            
                            else if(count2>0){
                                
                                con2.add(temp.get(i));
                                count2--;
                                
                            }
                            
                            else{
                                
                                con3.add(temp.get(i));
                                
                            }
                            
                        }
                        
                        //con1 first
                        if(key.charAt(0)<key.charAt(1)&&key.charAt(0)<key.charAt(2)){
                            
                            //con2<con3
                            if(key.charAt(1)<key.charAt(2)){
                                
                                j=0;
                                for(i=0;i<temp.size();i++){
                                    
                                    if(turn==0){
                                        
                                        output=output.concat(con1.get(j).toString());
                                        turn=1;
                                        
                                    }
                                    
                                    else if(turn==1){
                                        
                                        output=output.concat(con2.get(j).toString());
                                        turn=2;
                                        
                                    }
                                    
                                    else{
                                        
                                        output=output.concat(con3.get(j).toString());
                                        j++;
                                        turn=0;
                                        
                                    }
                                    
                                }
                                
                            }
                            
                            //con3<con2
                            else{
                                
                                j=0;
                                for(i=0;i<temp.size();i++){
                                    
                                    if(turn==0){
                                        
                                        output=output.concat(con1.get(j).toString());
                                        turn=1;
                                        
                                    }
                                    
                                    else if(turn==1){
                                        
                                        output=output.concat(con3.get(j).toString());
                                        turn=2;
                                        
                                    }
                                    
                                    else{
                                        
                                        output=output.concat(con2.get(j).toString());
                                        j++;
                                        turn=0;
                                        
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                        //con2 first
                        else if(key.charAt(1)<key.charAt(0)&&key.charAt(1)<key.charAt(2)){
                            
                            if(key.charAt(0)<key.charAt(2)){
                                
                                j=0;
                                for(i=0;i<temp.size();i++){
                                    
                                    if(turn==0){
                                        
                                        output=output.concat(con2.get(j).toString());
                                        turn=1;
                                        
                                    }
                                    
                                    else if(turn==1){
                                        
                                        output=output.concat(con1.get(j).toString());
                                        turn=2;
                                        
                                    }
                                    
                                    else{
                                        
                                        output=output.concat(con3.get(j).toString());
                                        j++;
                                        turn=0;
                                        
                                    }
                                    
                                }
                                
                            }
                            
                            else{
                                
                                j=0;
                                for(i=0;i<temp.size();i++){
                                    
                                    if(turn==0){
                                        
                                        output=output.concat(con3.get(j).toString());
                                        turn=1;
                                        
                                    }
                                    
                                    else if(turn==1){
                                        
                                        output=output.concat(con1.get(j).toString());
                                        turn=2;
                                        
                                    }
                                    
                                    else{
                                        
                                        output=output.concat(con2.get(j).toString());
                                        j++;
                                        turn=0;
                                        
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                        //con3 first
                        else{
                            
                            //con1<con2
                            if(key.charAt(0)<key.charAt(1)){
                                
                                j=0;
                                for(i=0;i<temp.size();i++){
                                    
                                    if(turn==0){
                                        
                                        output=output.concat(con2.get(j).toString());
                                        turn=1;
                                        
                                    }
                                    
                                    else if(turn==1){
                                        
                                        output=output.concat(con3.get(j).toString());
                                        turn=2;
                                        
                                    }
                                    
                                    else{
                                        
                                        output=output.concat(con1.get(j).toString());
                                        j++;
                                        turn=0;
                                        
                                    }
                                    
                                }
                                
                            }
                            
                            //con2<con1
                            else{
                                
                                j=0;
                                for(i=0;i<temp.size();i++){
                                    
                                    if(turn==0){
                                        
                                        output=output.concat(con3.get(j).toString());
                                        turn=1;
                                        
                                    }
                                    
                                    else if(turn==1){
                                        
                                        output=output.concat(con2.get(j).toString());
                                        turn=2;
                                        
                                    }
                                    
                                    else{
                                        
                                        output=output.concat(con1.get(j).toString());
                                        j++;
                                        turn=0;
                                        
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                        area.setOutput(output);
                        
                    }
                    
                    else if(key.length()==4){
                        
                        //STORE THE MESSAGE INTO FOUR CONTAINERS
                        count=temp.size()/4;
                        int count1=count;
                        int count2=count;
                        int count3=count;
                        for(i=0;i<temp.size();i++){
                            
                            if(count1>0){
                                
                                con1.add(temp.get(i));
                                count1--;
                                
                            }
                            
                            else if(count2>0){
                                
                                con2.add(temp.get(i));
                                count2--;
                                
                            }
                            
                            else if(count3>0){
                                
                                con3.add(temp.get(i));
                                count3--;
                                
                            }
                            
                            else{
                                
                                con4.add(temp.get(i));
                                
                            }
                            
                        }
                        
                        //con1 first
                        if(key.charAt(0)<key.charAt(1)&&key.charAt(0)<key.charAt(2)&&key.charAt(0)<key.charAt(3)){
                            
                            if(key.charAt(1)<key.charAt(2)&&key.charAt(1)<key.charAt(3)){
                                
                                if(key.charAt(2)<key.charAt(3)){
                                
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con4.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                
                                }
                                
                                else{
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con3.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                            }
                            
                            else if(key.charAt(2)<key.charAt(1)&&key.charAt(2)<key.charAt(3)){
                                
                                if(key.charAt(1)<key.charAt(3)){
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con4.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                                else{
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con2.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                            }
                            
                            else{
                                
                                if(key.charAt(2)<key.charAt(3)){
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con3.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                                else{
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con2.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                        //con2 first
                        else if(key.charAt(1)<key.charAt(0)&&key.charAt(1)<key.charAt(2)&&key.charAt(1)<key.charAt(3)){
                            
                            if(key.charAt(0)<key.charAt(2)&&key.charAt(0)<key.charAt(3)){
                                
                                if(key.charAt(2)<key.charAt(3)){
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con4.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                                else{
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con3.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                            }
                            
                            else if(key.charAt(2)<key.charAt(0)&&key.charAt(2)<key.charAt(3)){
                                
                                if(key.charAt(0)<key.charAt(3)){
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con4.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                                else{
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con3.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                            }
                            
                            else{
                                
                                if(key.charAt(0)<key.charAt(2)){
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con2.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }                                    
                                    
                                }
                                
                                else{
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con2.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                        //con3 first
                        else if(key.charAt(2)<key.charAt(0)&&key.charAt(2)<key.charAt(1)&&key.charAt(2)<key.charAt(3)){
                            
                            //con1<con2
                            if(key.charAt(0)<key.charAt(1)&&key.charAt(0)<key.charAt(3)){
                                
                                if(key.charAt(1)<key.charAt(3)){
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con4.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                                else{
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con3.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                            }
                            
                            else if(key.charAt(1)<key.charAt(0)&&key.charAt(1)<key.charAt(3)){
                                
                                if(key.charAt(0)<key.charAt(3)){
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con4.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                                else{
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con3.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                            }
                            
                            else{
                                
                                if(key.charAt(0)<key.charAt(1)){
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con2.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                                else{
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con1.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con2.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                        //last letter of keyword first
                        else{
                            
                            if(key.charAt(0)<key.charAt(1)&&key.charAt(0)<key.charAt(2)){
                                
                                if(key.charAt(1)<key.charAt(2)){
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con1.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                                else{
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con1.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                            }
                            
                            else if(key.charAt(1)<key.charAt(0)&&key.charAt(1)<key.charAt(2)){
                                
                                if(key.charAt(0)<key.charAt(2)){
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con1.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                                else{
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con1.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                            }
                            
                            else{
                                
                                if(key.charAt(0)<key.charAt(1)){
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con1.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                                else{
                                    
                                    j=0;
                                    for(i=0;i<temp.size();i++){
                                    
                                        if(turn==0){
                                        
                                            output=output.concat(con4.get(j).toString());
                                            turn=1;
                                        
                                        }
                                    
                                        else if(turn==1){
                                        
                                            output=output.concat(con3.get(j).toString());
                                            turn=2;
                                        
                                        }
                                        
                                        else if(turn==2){
                                        
                                            output=output.concat(con2.get(j).toString());
                                            turn=3;
                                        
                                        }
                                    
                                        else{
                                        
                                            output=output.concat(con1.get(j).toString());
                                            j++;
                                            turn=0;
                                        
                                        }
                                    
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                        area.setOutput(output);
                        
                    }
                    
                }
            }
            
        }
        
    }
    
    public boolean checkUnique(String s){
        
        int j;
        
        for(i=0;i<s.length();i++){
            
            if(i!=0){
                
                for(j=0;j<i;j++){
                    
                    if(s.charAt(i)==s.charAt(j)){
                    
                        return false;
                        
                    }
                    
                }
                
            }
            
        }
        
        return true;
        
    }
    
}
