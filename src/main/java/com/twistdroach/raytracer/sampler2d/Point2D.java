package com.twistdroach.raytracer.sampler2d;

/**
 * Immutable Point2D
 * @author zrowitsch
 *
 */
public final class Point2D {
	public final double x;
	public final double y;
	
	public Point2D() {
		this(0d, 0d);
	}
	
	public Point2D(Point2D p) {
		this(p.x, p.y);
	}
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "X=" + x + ",Y=" + y;
	}
}
