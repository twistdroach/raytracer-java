package com.twistdroach.raytracer.sampler2d;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Sampler2DTest {
	
	private static class ConcreteSampler2D extends Sampler2D {
		static double pcounter = 0;
		public ConcreteSampler2D() {
			super(2);
		}

		@Override
		public void build(List<Point2D> sampleSet, int samplesPerSet) {
			sampleSet.add(new Point2D(pcounter, pcounter));
			pcounter = pcounter + 0.001;
			sampleSet.add(new Point2D(pcounter, pcounter));
			pcounter = pcounter + 0.001;
		}
		
	}
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	//This will fail due to random sampling offset...
	@Ignore
	@Test
	public void testSimpleConcreteSampler2D() {
		ConcreteSampler2D samp = new ConcreteSampler2D();
		double tval = 0;
		for (int i=0; i<166; i++) {
			Point2D p0 = samp.getSample();
			assertEquals(tval, p0.x, 0.001d);
			tval = tval + .001;
		}
		tval = 0;
		for (int i=0; i<166; i++) {
			Point2D p0 = samp.getSample();
			assertEquals(tval, p0.x, 0.001d);
			tval = tval + .001;
		}
	}
	
	public static void testUnitSquare(final Sampler2D s, final int numSamples) {
		for (int j=0; j<83; j++) {
			for (int k=0; k<numSamples; k++) {
				Point2D p = s.getSample();
				assertTrue("Point x out of range " + p.toString(), p.x >= 0 && p.x <= 1);
				assertTrue("Point y out of range " + p.toString(), p.y >= 0 && p.y <= 1);
//				System.out.println(p.toString());
			}
		}
	}
}
