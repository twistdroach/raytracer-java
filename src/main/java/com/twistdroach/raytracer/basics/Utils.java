package com.twistdroach.raytracer.basics;

import java.util.Random;

public final class Utils {
	private Utils() {
		
	}
	
	private static final Random RANDOM = new Random();
	
	public static int getRandomIntegerInRange(int minInclusive, int maxExclusive) {

		if (minInclusive > maxExclusive) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		
		if (minInclusive == maxExclusive) {
			return minInclusive;
		}

		return RANDOM.nextInt((maxExclusive - minInclusive) + 1) + minInclusive;
	}
}
