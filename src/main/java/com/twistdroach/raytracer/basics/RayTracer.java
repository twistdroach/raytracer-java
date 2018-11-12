package com.twistdroach.raytracer.basics;

import java.util.List;

public interface RayTracer {
	public RGBColor traceRay(Ray ray, List<GeometricObject> objects);
}
