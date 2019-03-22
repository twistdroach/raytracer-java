package com.twistdroach.raytracer.basics;

public class Normal extends Vector3D {
	
	public Normal(Vector3D v) {
		this(v.x, v.y, v.z);
	}
	
	public Normal(double x, double y, double z) {
		super(x, y, z);
	}
}
