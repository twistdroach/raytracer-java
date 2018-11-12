package com.twistdroach.raytracer.basics;

/**
 * Data handoff when a Ray intersection occurs
 * @author zrowitsch
 *
 */
public class ShadeRec {
	/** 
	 * Was an intersection found?
	 */
	public boolean hit = false;
	
	/**
	 * World coordinates of hit
	 */
	public Point3D hitPoint = null;
	
	/**
	 * Normal vector at hit point
	 */
	public Normal normal = null;

	/**
	 * Color at intersection point
	 */
	public RGBColor color = null;
}
