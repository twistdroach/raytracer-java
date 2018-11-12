package com.twistdroach.raytracer.basics;

public interface PixelListener {
	public void writePixel(int x, int y, RGBColor c);
}
