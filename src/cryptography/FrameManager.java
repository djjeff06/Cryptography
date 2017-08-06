/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;

/**
 *
 * @author msi
 */

import javax.swing.JFrame;

public class FrameManager {
    static private JFrame   startFrame,
                        anotherFrame,
                        justAnotherFrame;

static public synchronized JFrame getStartFrame()
{
    if(startFrame == null)
    {
        //frame isnt initialized, lets do it
        startFrame = new Cryptography();
        //...
    }

    return startFrame;
}

static public synchronized JFrame getAnotherFrame(String frameName)
{
    
    if(startFrame != null){
        startFrame.dispose();
        startFrame = null;
    }
        
    else if(anotherFrame != null){
        anotherFrame.dispose();
        anotherFrame = null;
    }
    
    if(anotherFrame == null)
    {
        //same as above, init it
        
        switch(frameName){
            case "Caesar":
                anotherFrame = new Caesar();
                break;
            case "ROT1":
                anotherFrame = new ROT1();
                break;
            case "Substitution":
                anotherFrame = new Substitution();
                break;
            case "Transposition":
                anotherFrame = new Transposition();
                break;
            case "Vigenere":
                anotherFrame = new Vigenere();
                break;
        }
        
    }

    return anotherFrame;
}

static public synchronized JFrame getJustAnotherFrame()
{
    //same again
    return justAnotherFrame;
}
}