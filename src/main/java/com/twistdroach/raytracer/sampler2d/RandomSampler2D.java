package com.twistdroach.raytracer.sampler2d;

import java.util.List;
import java.util.Random;

public class RandomSampler2D extends Sampler2D {
	private static final Random RANDOM = new Random();
	
	public RandomSampler2D(int samplesPerSet) {
		super(samplesPerSet);
	}
	
	@Override
	public void build(List<Point2D> sampleSet, int samplesPerSet) {
		while (samplesPerSet > 0) {
			sampleSet.add(new Point2D(RANDOM.nextDouble(), RANDOM.nextDouble()));
			samplesPerSet--;
		}
	}

}
