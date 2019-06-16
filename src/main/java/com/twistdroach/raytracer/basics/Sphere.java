package com.twistdroach.raytracer.basics;

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
		// quadratic formula
		double a = ray.getDirection().dot(ray.getDirection());
		double b = ray.getOrigin().subtract(center).multiply(2.0d).dot(ray.getDirection());
		double c = ray.getDirection().dot(ray.getDirection()) - radius * radius;
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
				Vector3D normal = ray.getOrigin().subtract(center).add(dray);
				retVal.normal = normal.divide(radius).normal();
			    retVal.hitPoint = ray.getOrigin().add(dray);
			    retVal.hit = true;
			}
			
			//larger root
			t = (-b + e) / denominator;
			if (t > Constants.kEpsilon) {
				Vector3D dray = new Vector3D(ray.getDirection()).multiply(t);
				Vector3D normal = ray.getOrigin().subtract(center).add(dray);
				retVal.normal = normal.divide(radius).normal();
			    retVal.hitPoint = ray.getOrigin().add(dray);
			    retVal.hit = true;
			}
			
		}
		return retVal;
	}

}
