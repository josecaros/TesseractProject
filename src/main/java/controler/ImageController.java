/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class ImageController {
    
    public ImageController(){
        
    } 
    
    public void setLabelWithImagePath( JLabel label, String path){
        ImageIcon img = new ImageIcon(path);
        Image fit = img.getImage();
        fit = fit.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(fit));
    }
    
    public void setLabelWithImage(Image ima, JLabel label){
        ima= ima.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(ima));
    }
    
}
