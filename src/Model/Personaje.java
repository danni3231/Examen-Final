package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Personaje {
	
	private PApplet app;
	private PImage img;
	private int x;
	private int y;
	private int edad;
	private int suerte;
	
	public Personaje(int x, int y, PImage img, PApplet app){
		this.x=x;
		this.y=y;
		this.img=img;
		this.app=app;
		this.edad= (int) app.random(30);
		this.edad= (int) app.random(30);
	}


}