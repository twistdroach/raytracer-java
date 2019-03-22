package com.twistdroach.raytracer.basics;

public class Point3D {
	double x;
	double y;
	double z;
	
	public Point3D() {
		this(0d, 0d, 0d);
	}
	
	public Point3D(Point3D p) {
		this(p.x, p.y, p.z);
	}
	
	public Point3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static Vector3D subtract(Point3D p1, Point3D p2) {
		return new Vector3D(p1.x - p2.x, p1.y - p2.y, p1.z - p2.z);
	}
	
	public Point3D add(Vector3D v) {
		x += v.x;
		y += v.y;
		z += v.z;
		return this;
	}
	
	public static Point3D add(Point3D p, Vector3D v) {
		return new Point3D(p).add(v);
	}
	
	public String toString() {
		return "X=" + x + ",Y=" + y + ",Z=" + z;
	}
}
