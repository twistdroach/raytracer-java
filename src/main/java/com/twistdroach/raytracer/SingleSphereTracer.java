package com.twistdroach.raytracer;

import com.twistdroach.raytracer.basics.GeometricObject;
import com.twistdroach.raytracer.basics.RGBColor;
import com.twistdroach.raytracer.basics.Ray;
import com.twistdroach.raytracer.basics.RayTracer;

public class SingleSphereTracer implements RayTracer {

	@Override
	public RGBColor traceRay(Ray ray, GeometricObject object) {
//		Sphere s = (Sphere)object;
//		if (s.hit(ray).hit) {
			return object.color;
//		}
//		return RGBColor.BLACK;
	}

}
