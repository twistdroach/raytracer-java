package com.twistdroach.raytracer.basics;

public class RGBColor {
	public static final RGBColor RED = new RGBColor(1, 0, 0);
	public static final RGBColor GREEN = new RGBColor(0, 1, 0);
	public static final RGBColor BLUE = new RGBColor(0, 0, 1);
	public static final RGBColor BLACK = new RGBColor(0, 0, 0);
	public static final RGBColor WHITE = new RGBColor(1, 1, 1);
	
	public final double r;
	public final double g;
	public final double b;
	
	public RGBColor(int red, int green, int blue) {
		if (red < 0 || red > 1 ||
				green < 0 || green > 1 ||
				blue < 0 || blue > 1)
			throw new IllegalArgumentException("RGB values must be 0<=x<=1");
		r = red;
		g = green;
		b = blue;
	}
	
	public int getColor() {
		return ((int)(r*255) << 16) | ((int)(g*255) << 8) | (int)(b * 255);
	}
	
	@Override
	public String toString() {
		return String.format("% .2f, % .2f, % .2f", r, g, b);
		
	}
}
