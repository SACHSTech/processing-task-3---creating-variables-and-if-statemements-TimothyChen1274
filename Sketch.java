import processing.core.PApplet;
import java.util.Random;
/*
A program that draws a moon or sun in different sizes and colours depending on the position and size which also the background and foreground.
@author: T. Chen
*/
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    if (intWone >= 100) {
    background(135, 206, 235);
    }
    else if (intWone <= 100) { 
    background(14, 4, 48);
    }
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // Canvas Size
    size(400,400);

    // Sun & Moon
    boolean blnEclipse;
    blnEclipse = (intXone == 200 || intWone >=250);
    if (intWone >= 100) {
    fill(253, 184, 19);
    }
    else if (intWone <= 100) { 
    fill(184, 174, 163);
    }
    
    ellipse(intXone, intYone, intWone, intWone);
   
    if (blnEclipse) {
    background(250, 214, 165);
    stroke(255, 33, 29);
    fill(0, 0, 0);
    ellipse(intXone, intYone, intWone, intWone);
    }
   
    boolean blnBlueMoon;
    blnBlueMoon = ((intXone >=150 && intXone <=250) && (intYone <=200 && intWone >=250));
    if (blnBlueMoon) {
    background(43, 70, 118);
    stroke(25, 255, 135);
    fill(194, 242, 254);
    ellipse(intXone, intYone, intWone, intWone);
    }

    // Ground
    if (intWone >= 100) {
    stroke(124, 252, 0);
    }
    else if (intWone <= 100) { 
    stroke(13, 31, 2);
    }
    
    if (intWone >= 100) {
    fill(124, 252, 0);
    }
    else if (intWone <= 100) { 
    fill(13, 31, 2);
    }
    rect(0, 400, 400, -80); 
    
    // House Base
    stroke(0, 0, 0);
    if (intWone >= 100) {
    fill(249, 253, 183);
    }
    else if (intWone <= 100) { 
    fill(203, 174, 161);
    }
    rect(50, 215, 200, 150);

    // House Roof
    stroke(0, 0, 0);
    fill(128, 0, 0); 
    triangle(50, 215, 250, 215, 150, 115);

    // Driveway
    stroke(0, 0, 0);
    fill(128, 128, 118);
    rect(50, 365, 125, 80);

    // Door
    stroke(0, 0, 0);
    fill(93, 41, 6);
    rect(190, 285, 40, 80);

    fill(247, 198, 107);
    ellipse(215, 330, 10, 10);

    // Window
    if (intWone >= 100) {
    fill(255, 255, 255);
    }
    else if (intWone <= 100) { 
    fill(20, 20, 23);
    }
    stroke(0, 0, 0);
    rect(75, 265, 60, 60);
    line(75, 297, 135, 297);
    line(105, 265, 105, 325);
    
    // Time & Date
    int intHours = hour();
    int intMinutes = minute();
    String s = String.valueOf(intHours);
    text(s, 10, 28);
    s = String.valueOf(intMinutes);
    text(s, 30, 28);
  
  }

    // Random
    Random myRandom = new Random();

    int intXone = myRandom.nextInt(400);
    int intYone = myRandom.nextInt(320);
    int intWone = myRandom.nextInt(350);

}