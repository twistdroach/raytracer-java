package com.twistdroach.raytracer.basics;

/**
 * Immutable Point3D, let's see how the garbage collector handles it
 * @author zrowitsch
 *
 */
public final class Point3D {
	public final double x;
	public final double y;
	public final double z;
	
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
	
	public Vector3D subtract(Point3D other) {
		return new Vector3D(x - other.x, y - other.y, z - other.z);
	}
	
	public Point3D add(Vector3D v) {
		return new Point3D(x + v.x, y + v.y, z + v.z);
	}
	
	public String toString() {
		return "X=" + x + ",Y=" + y + ",Z=" + z;
	}
}
