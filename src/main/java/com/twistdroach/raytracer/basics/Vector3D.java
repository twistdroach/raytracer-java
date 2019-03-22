package com.twistdroach.raytracer.basics;

public class Vector3D {
	double x, y, z;
	
	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3D(Vector3D v) {
		this(v.x, v.y, v.z);
	}
	
	public Vector3D multiply(double d) {
		x *= d;
		y *= d;
		z *= d;
		
		return this;
	}
	
	public Vector3D divide(double d) {
		x /= d;
		y /= d;
		z /= d;
		return this;
	}
	
	public Vector3D add(Vector3D v) {
		x += v.x;
		y += v.y;
		z += v.z;
		return this;
	}
	
	public Normal normal() {
		return new Normal(this);
	}
	
	public static Vector3D add(Vector3D v1, Vector3D v2) {
		Vector3D r = new Vector3D(v1);
		r.add(v2);
		return r;
	}
	
	public static double dot(Vector3D v1, Vector3D v2) {
		return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
	}
}
