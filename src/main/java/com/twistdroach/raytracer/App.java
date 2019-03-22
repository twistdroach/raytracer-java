package com.twistdroach.raytracer;

import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.twistdroach.raytracer.basics.PixelListener;
import com.twistdroach.raytracer.basics.RGBColor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JFrame frame = new JFrame();
        //DrawPanel button = new DrawPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.getContentPane().add(button);
        BufferedImage img = new BufferedImage(200, 200, BufferedImage.TYPE_INT_BGR);

        frame.getContentPane().add(new JLabel(new ImageIcon(img)));

        frame.setSize(200,200);

        frame.setVisible(true);
        
    	PixelListener textOutput =new PixelListener() {
			@Override
			public void writePixel(int x, int y, RGBColor c) {
				if (c == RGBColor.BLACK) {
					img.setRGB(x, y, Color.BLACK.getRGB());
				} else {
					img.setRGB(x, y, Color.WHITE.getRGB());
				}
				frame.repaint();
				System.out.println(String.format("X: %d, Y: %d, Color: %s", x, y, c.toString()));
				
			}
    	};

    	SimpleScene scene = new SimpleScene();
    	scene.build();
    	scene.render(textOutput);
    }
}
