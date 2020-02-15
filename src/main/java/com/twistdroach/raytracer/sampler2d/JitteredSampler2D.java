package com.twistdroach.raytracer.sampler2d;

import java.util.List;
import java.util.Random;

public class JitteredSampler2D extends Sampler2D {
	private static final Random RANDOM = new Random();
	
	public JitteredSampler2D(int samplesPerSet) {
		super(samplesPerSet);
	}

	@Override
	public void build(List<Point2D> sampleSet, int samplesPerSet) {
		int n = (int) Math.sqrt(samplesPerSet);
		for (int j = 0; j<n; j++) {
			for (int k=0; k<n; k++) {
				Point2D p = new Point2D((j + RANDOM.nextDouble())/n, (k + RANDOM.nextDouble())/n);
				sampleSet.add(p);
				samplesPerSet--;
			}
		}
	}

}
