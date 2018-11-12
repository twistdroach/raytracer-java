package com.twistdroach.raytracer;

import java.util.List;

import com.twistdroach.raytracer.basics.GeometricObject;
import com.twistdroach.raytracer.basics.RGBColor;
import com.twistdroach.raytracer.basics.Ray;
import com.twistdroach.raytracer.basics.RayTracer;
import com.twistdroach.raytracer.basics.Sphere;

public class SingleSphereTracer implements RayTracer {

	@Override
	public RGBColor traceRay(Ray ray, List<GeometricObject> objects) {
		Sphere s = (Sphere)objects.get(0);
		if (s.hit(ray).hit) {
			return RGBColor.RED;
		}
		return RGBColor.BLACK;
	}

}
