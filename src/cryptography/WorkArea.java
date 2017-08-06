package cryptography;

/**
 *
 * @author jeff
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class WorkArea extends JFrame implements ActionListener{
    
    private JButton save=new JButton("SAVE");
    private JButton clear=new JButton("CLEAR");
    private JTextArea output=new JTextArea();
    private JFileChooser fc=new JFileChooser();
    
    public WorkArea(String title){
        
        this.setTitle(title+" Work Area");
        this.setSize(500,500);
        this.setDefaultCloseOperation(1);
        this.setVisible(true);
        
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        save.addActionListener(this);
        panel.add(save);
        clear.addActionListener(this);
        panel.add(clear);
        this.add(panel,BorderLayout.NORTH);
        this.add(output,BorderLayout.CENTER);
        output.setEditable(false);
        
    }
    
    public void setOutput(String val){
        
        output.append(val+"\n");
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==save){
                        
            try{
                
                int result=fc.showSaveDialog(WorkArea.this);
                fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                File outputFile=fc.getSelectedFile();
                BufferedWriter outputWriter=new BufferedWriter(new FileWriter(outputFile));
                outputWriter.write(output.getText()+"\n");
                outputWriter.close();
                
            }catch(Exception z){
                
                System.err.println(z);
                
            }
            
        }
        
        else if(e.getSource()==clear){
            
            output.setText("");
            
        }
        
    }
    
}
