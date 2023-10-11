import processing.core.PApplet;

/**
 * Description:
 * Creates an image with a house and a sun. The position for the sun is randomly
 * generated everytime. Depending on the position of the sun, the image will
 * display a sunrise, mid day(noon), or sunset image.
 * 
 * @author: Gordon Z
 */
class Main {
  public static void main(String[] args) {

    String[] processingArgs = { "MySketch" };
    Sketch mySketch = new Sketch();
    PApplet.runSketch(processingArgs, mySketch);
  }

}