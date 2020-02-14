package com.twistdroach.raytracer.sampler2d;

import java.util.ArrayList;
import java.util.List;

public abstract class Sampler2D {
	private final int SETS_TO_BUILD = 83;
	private List<List<Point2D>> sampleLists = new ArrayList<List<Point2D>>();
	private int listIndex = 0;
	private int sampleIndex = 0;

	public Sampler2D(final int samplesPerSet) {
		build(samplesPerSet);
	}
	
	public Point2D getSample() {
		if (sampleIndex == sampleLists.get(listIndex).size()) {
			sampleIndex = 0;
			listIndex++;
		}
		if (listIndex == sampleLists.size()) {
			listIndex = 0;
		}
		Point2D p = sampleLists.get(listIndex).get(sampleIndex);
		sampleIndex++;
		return p;
	}
	
	private void validatePointInUnitSquare(Point2D p) {
		if (p.x < -1.0 || p.x > 1.0 ||
				p.y < -1.0 || p.y > 1.0) {
			throw new AssertionError(p);
		}
	}
	
	public void build(final int samplesPerSet) {
		for (int count = 0; count < SETS_TO_BUILD; count++) {
			List<Point2D> l = new ArrayList<Point2D>();
			sampleLists.add(l);
			build(l, samplesPerSet);
			for (Point2D p : l) {
				validatePointInUnitSquare(p);
			}
		}
	}
	
	public abstract void build(final List<Point2D> sampleSet, final int samplesPerSet);
}
