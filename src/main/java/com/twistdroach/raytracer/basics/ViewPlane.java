package com.twistdroach.raytracer.basics;

public class ViewPlane {
	final int hres;
	final int vres;
	final double pixelSize;
	final double gamma;
	
	/**
	 * (0,0) is the bottom left corner of this plane
	 * @param hres
	 * @param vres
	 */
	public ViewPlane(int hres, int vres) {
		this.hres = hres;
		this.vres = vres;
		pixelSize = 1;
		gamma = 1;
	}
	
	public double getWorldXFromPixelX(int x) {
		return pixelSize * ((double)x - hres/2d + 0.5d);
	}
	
	public double getWorldYFromPixelY(int y) {
		return pixelSize * ((double)y - vres/2d + 0.5d);
	}
}
