package com.twistdroach.raytracer.sampler2d;

import java.util.List;

/**
 * Always samples the origin
 * @author zrowitsch
 *
 */
public class RegularSampler2D extends Sampler2D {

	public RegularSampler2D(int samplesPerSet) {
		super(samplesPerSet);
	}

	@Override
	public void build(List<Point2D> sampleSet, int samplesPerSet) {
		int n = (int) Math.sqrt(samplesPerSet);
		for (int j = 0; j<n; j++) {
			for (int k=0; k<n; k++) {
				Point2D p = new Point2D((j + 0.5d)/n, (k + 0.5d)/n);
				sampleSet.add(p);
				samplesPerSet--;
			}
		}
	}

}
