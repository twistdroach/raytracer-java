package com.twistdroach.raytracer.basics;

/**
 * Base class of geometric objects
 * @author zrowitsch
 *
 */
public abstract class GeometricObject {
	
	/**
	 * Simple color to be replaced by a Material some day
	 */
	public RGBColor color;
	
	abstract public ShadeRec hit(Ray ray);
	
}
