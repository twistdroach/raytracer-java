package com.twistdroach.raytracer;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BufferedImage img = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);

        frame.getContentPane().add(new JLabel(new ImageIcon(img)));

        frame.setSize(250,250);

        frame.setVisible(true);
        
    	PixelListener textOutput =new PixelListener() {
			@Override
			public void writePixel(int x, int y, RGBColor c) {
				img.setRGB(x, y, c.getColor());
				frame.repaint();
			}
    	};

    	SimpleScene scene = new SimpleScene();
    	scene.build();
    	scene.render(textOutput);
    }
}
