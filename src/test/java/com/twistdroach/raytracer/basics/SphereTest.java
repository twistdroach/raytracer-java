package com.twistdroach.raytracer.basics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SphereTest {
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testSimpleHit() {
		Point3D c = new Point3D(0,0,0);
		Sphere s = new Sphere(c, 2);
		
		Vector3D viewPlaneDirection = new Vector3D(0, 0, -1);
		Point3D viewPlaneOrigin = new Point3D(0,0,2);
		Ray r = new Ray(viewPlaneOrigin, viewPlaneDirection);
		
		ShadeRec sr = s.hit(r);
		assertTrue(sr.hit);
	}
	
	@Test
	public void testSimpleMiss() {
		Point3D c = new Point3D(0,0,0);
		Sphere s = new Sphere(c, 2);
		
		Vector3D viewPlaneDirection = new Vector3D(0, 0, -1);
		Point3D viewPlaneOrigin = new Point3D(3,3,2);
		Ray r = new Ray(viewPlaneOrigin, viewPlaneDirection);
		
		ShadeRec sr = s.hit(r);
		assertFalse(sr.hit);
	}
}
