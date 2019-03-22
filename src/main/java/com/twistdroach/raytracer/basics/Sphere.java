package com.twistdroach.raytracer.basics;

import com.twistdroach.raytracer.basics.Constants;

public class Sphere extends GeometricObject {
	
	final Point3D center;
	final double radius;
	
	public Sphere(Point3D center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	@Override
	public ShadeRec hit(Ray ray) {
		ShadeRec retVal = new ShadeRec();
		Vector3D temp = Point3D.subtract(ray.getOrigin(), center);
		// quadratic formula
		double a = Vector3D.dot(ray.getDirection(), ray.getDirection());
		double b = Vector3D.dot(new Vector3D(temp).multiply(2.0d), ray.getDirection());
		double c = Vector3D.dot(ray.getDirection(), ray.getDirection()) - radius * radius;
		double discriminant = b * b - 4.0d * a * c;
		
		// the discriminant determines how many hits we have on the sphere
		System.out.println(ray.getOrigin());
		if (discriminant < 0.0d) {
			retVal.hit = false;
		} else {
			double e = Math.sqrt(discriminant);
			double denominator = 2.0d * a;
			
			//smaller root
			double t = (-b - e) / denominator;
			if (t > Constants.kEpsilon) {
				Vector3D dray = new Vector3D(ray.getDirection()).multiply(t);
				Vector3D normal = Vector3D.add(temp, dray);
				retVal.normal = normal.divide(radius).normal();
			    retVal.hitPoint = Point3D.add(ray.getOrigin(), dray);
			    retVal.hit = true;
			}
			
			//larger root
			t = (-b + e) / denominator;
			if (t > Constants.kEpsilon) {
				Vector3D dray = new Vector3D(ray.getDirection()).multiply(t);
				Vector3D normal = Vector3D.add(temp, dray);
				retVal.normal = normal.divide(radius).normal();
			    retVal.hitPoint = Point3D.add(ray.getOrigin(), dray);
			    retVal.hit = true;
			}
			
		}
		return retVal;
	}

}
