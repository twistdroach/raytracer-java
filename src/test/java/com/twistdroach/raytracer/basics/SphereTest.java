package com.twistdroach.raytracer.basics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SphereTest {
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	private boolean hitSphere(double rayOriginX, double rayOriginY, double rayOriginZ) {
		Point3D c = new Point3D(0,0,0);
		Sphere s = new Sphere(c, 1);
		
		Vector3D viewPlaneDirection = new Vector3D(0, 0, -1);
		Point3D viewPlaneOrigin = new Point3D(rayOriginX, rayOriginY, rayOriginZ);
		Ray r = new Ray(viewPlaneOrigin, viewPlaneDirection);
		
		ShadeRec sr = s.hit(r);
		return sr.hit;
	}
	
	@Test
	public void testSimpleHit() {
		assertTrue(hitSphere(0,0,2));
	}
	
	@Test
	public void testSimpleMiss() {
		assertFalse(hitSphere(3, 3, 2));
		assertFalse(hitSphere(2, 2, 2));
	}
}
