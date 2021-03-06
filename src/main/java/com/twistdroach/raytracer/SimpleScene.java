package com.twistdroach.raytracer;

import com.twistdroach.raytracer.basics.Point3D;
import com.twistdroach.raytracer.basics.RGBColor;
import com.twistdroach.raytracer.basics.Sphere;
import com.twistdroach.raytracer.basics.ViewPlane;
import com.twistdroach.raytracer.basics.World;

public class SimpleScene extends World {
	public void build() {
		setRayTracer(new SingleSphereTracer());
		ViewPlane vp = new ViewPlane(200, 200);
		setViewPlane(vp);
		setViewPlaneZ(100d);
		Sphere s = new Sphere(new Point3D(-20, 0, 0), 65d, RGBColor.GREEN);
		addObject(s);
		s = new Sphere(new Point3D(50, 0, 0), 35d, RGBColor.BLUE);
		addObject(s);
	}
}
