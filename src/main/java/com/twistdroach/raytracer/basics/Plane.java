package com.twistdroach.raytracer.basics;

public class Plane extends GeometricObject {

	final Point3D point;
	final Normal normal;
	
	public Plane(Point3D point, Normal normal) {
		this.point = point;
		this.normal = normal;
	}
	
	@Override
	public ShadeRec hit(Ray ray) {
		// TODO Auto-generated method stub
		return null;
	}

}
