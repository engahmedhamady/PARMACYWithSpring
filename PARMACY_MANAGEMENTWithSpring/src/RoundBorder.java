/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

/**
 *
 * @author ahmed
 */
public class RoundBorder  implements Border{
     private int radius;


    RoundBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isBorderOpaque() {
        return  true;//To change body of generated methods, choose Tools | Templates.
    }
    
}
