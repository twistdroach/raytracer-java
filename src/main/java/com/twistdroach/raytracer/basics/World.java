package com.twistdroach.raytracer.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains objects and the view plain only
 * @author zrowitsch
 *
 */
public abstract class World {
	final List<GeometricObject> objects = new ArrayList<GeometricObject>();
	ViewPlane viewPlane = null;
	double viewPlaneWorldZ = 0d;
	RayTracer tracer = null;
	
	public abstract void build();
	
	public void setRayTracer(RayTracer r) {
		this.tracer = r;
	}
	
	public void setViewPlaneZ(double z) {
		this.viewPlaneWorldZ = z;
	}
	
	public void setViewPlane(ViewPlane vp) {
		this.viewPlane = vp;
	}
	
	public void addObject(GeometricObject o) {
		objects.add(o);
	}
	
	public void render(PixelListener pixelListener) {
		//orthogonal only
		Vector3D viewPlaneDirection = new Vector3D(0, 0, -1);
		
		for (int r=0; r<viewPlane.hres; r++) {
			for (int c=0; c<viewPlane.vres; c++) {
				double worldX = viewPlane.getWorldXFromPixelX(r);
				double worldY = viewPlane.getWorldYFromPixelY(c);
				Ray ray = new Ray(new Point3D(worldX, worldY, viewPlaneWorldZ), viewPlaneDirection);
				RGBColor color = tracer.traceRay(ray, objects);
				pixelListener.writePixel(r, c, color);
			}
		}
	}
}
