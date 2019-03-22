package com.twistdroach.raytracer.basics;

/**
 * Immutable Vector3D, let's see how the garbage collector handles it
 * @author zrowitsch
 *
 */
public class Vector3D {
	public final double x;
	public final double y;
	public final double z;
	
	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3D(Vector3D v) {
		this(v.x, v.y, v.z);
	}
	
	public Vector3D multiply(double d) {
		return new Vector3D(x*d, y*d, z*d);
	}
	
	public Vector3D divide(double d) {
		return new Vector3D(x/d, y/d, z/d);
	}
	
	public Vector3D add(Vector3D other) {
		return new Vector3D(x+other.x, y+other.y, z+other.z);
	}
	
	public Normal normal() {
		return new Normal(this);
	}
	
	public double dot(Vector3D other) {
		return x*other.x + y*other.y + z*other.z;
	}
}
