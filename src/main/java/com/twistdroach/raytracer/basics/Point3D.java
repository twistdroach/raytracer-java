package com.twistdroach.raytracer.basics;

public class Point3D {
	double x;
	double y;
	double z;
	
	public Point3D() {
		this(0d, 0d, 0d);
	}
	
	public Point3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
