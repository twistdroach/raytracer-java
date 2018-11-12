package com.twistdroach.raytracer.basics;

public class Sphere extends GeometricObject {
	
	final Point3D origin;
	final double radius;
	
	public Sphere(Point3D origin, double radius) {
		this.origin = origin;
		this.radius = radius;
	}
	
	@Override
	public ShadeRec hit(Ray ray) {
		// TODO Auto-generated method stub
		return null;
	}

}
