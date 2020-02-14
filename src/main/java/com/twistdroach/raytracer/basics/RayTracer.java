package com.twistdroach.raytracer.basics;


public interface RayTracer {
	public RGBColor traceRay(Ray ray, GeometricObject object);
}
