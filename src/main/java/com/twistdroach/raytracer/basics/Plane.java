package com.twistdroach.raytracer.basics;

public class Plane extends GeometricObject {

	final Point3D point;
	final Vector3D normal;
	
	public Plane(Point3D point, Vector3D normal) {
		this.point = point;
		this.normal = normal;
	}
	
	@Override
	public ShadeRec hit(Ray ray) {
		// TODO Auto-generated method stub
		return null;
	}

}
