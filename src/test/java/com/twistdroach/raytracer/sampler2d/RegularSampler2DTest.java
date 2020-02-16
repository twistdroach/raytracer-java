package com.twistdroach.raytracer.sampler2d;

import org.junit.Test;

public class RegularSampler2DTest {
	@Test
	public void testUnitSquare() {
		final int numSamples = 100;
		Sampler2D s = new RegularSampler2D(numSamples);
		Sampler2DTest.testUnitSquare(s, numSamples);
	}
	
}
