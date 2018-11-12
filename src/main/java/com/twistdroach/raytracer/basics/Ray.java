package com.twistdroach.raytracer.basics;

/**
 * A Ray is origin(point) + t*direction(unit vector)
 * and t is considered from neg to pos infinity
 * @author zrowitsch
 *
 */
public class Ray {
	private Point3D origin;
	private Vector3D direction;
	
	public Ray(Point3D origin, Vector3D direction) {
		this.origin = origin;
		this.direction = direction;
	}
}
