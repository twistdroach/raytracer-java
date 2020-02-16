package com.twistdroach.raytracer.sampler2d;

import org.junit.Test;

public class JitteredSampler2DTest {
	@Test
	public void testUnitSquare() {
		final int numSamples = 100;
		Sampler2D s = new JitteredSampler2D(numSamples);
		Sampler2DTest.testUnitSquare(s, numSamples);
	}
	
}
