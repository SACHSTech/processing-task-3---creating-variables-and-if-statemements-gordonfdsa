import processing.core.PApplet;

/**
 * Generates an random position for an object everytime 
 * @author: Gordon Z 
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}