package com.twistdroach.raytracer.sampler2d;

import java.util.List;
import java.util.Random;

import com.twistdroach.raytracer.basics.Utils;

public class MultiJitteredSampler2D extends Sampler2D {
	private static final Random RANDOM = new Random();
	
	public MultiJitteredSampler2D(int samplesPerSet) {
		super(samplesPerSet);
	}

	@Override
	public void build(final List<Point2D> sampleSet, final int samplesPerSet) {
		final int n = (int) Math.sqrt(samplesPerSet);
		if (n * n != samplesPerSet) {
			throw new IllegalArgumentException("samplesPerSet must be a perfect square for " + this.getClass().getCanonicalName());
		}
		
		final double subcellWidth = 1.0d/samplesPerSet;
		
		final double[] xarray = new double[samplesPerSet];
		final double[] yarray = new double[samplesPerSet];
		
		// Fill subcells with random points
		for (int j=0; j<n; j++) {
			for (int k=0; k<n; k++) {
				xarray[j * n + k] = ((j * n + k) * subcellWidth) + RANDOM.nextDouble() * subcellWidth;
				yarray[j * n + k] = ((j * n + k) * subcellWidth) + RANDOM.nextDouble() * subcellWidth;
			}
		}
		
		// Shuffle X
		for (int j=0; j<n; j++) {
			for (int k=0; k<n; k++) {
				final int randomOffset = Utils.getRandomIntegerInRange(k, n - 1);
				final double temp = xarray[j * n + k];
				xarray[j * n + k] = xarray[j * n + randomOffset];
				xarray[j * n + randomOffset] = temp;
			}
		}		
		
		// Shuffle Y
		for (int j=0; j<n; j++) {
			for (int k=0; k<n; k++) {
				final int randomOffset = Utils.getRandomIntegerInRange(k, n - 1);
				final double temp = yarray[j * n + k];
				yarray[j * n + k] = yarray[j * n + randomOffset];
				yarray[j * n + randomOffset] = temp;
			}
		}
		
		for (int j=0; j<n; j++) {
			for (int k=0; k<n; k++) {
				final double x = xarray[j * n + k];
				final double y = yarray[j * n + k];
				sampleSet.add(new Point2D(x,y));
			}
		}
	}

}
