import processing.core.PApplet;
import processing.core.PFont;
import java.util.Random;

public class Sketch extends PApplet {

  public void settings() {
    // put your size call here
    size(600, 600);
  }

  // background color
  public void setup() {
    background(252, 86, 3);
  }

  Random myRandom = new Random();
  // generates random x and y coordinates for the sun
  int randomPositionX = myRandom.nextInt(500) + 50;
  int randomPositionY = myRandom.nextInt(400);

  public void draw() {

    // if the randomly generated coordinate will get blocked by the house, keep generating
    // a new one
    while (randomPositionY >= 200 && randomPositionX >= 200 && randomPositionX <= 400)
      randomPositionX = myRandom.nextInt(500) + 50;

    if (randomPositionY >= 200 && randomPositionX <= 200) {
      // location in bottom left corner, morning/sunrise time, change background color to orange
      background(242, 122, 2);
      // change sun color to bright yellow
      fill(253, 255, 117);
    } else if(randomPositionY >= 200 && randomPositionX >= 400) {
      // location in bottom right corner, evening/sunset, change background to dark blue
      background(31, 31, 94);
      //change sun color to red 
      fill(252, 86, 3);
    } else {
      // location in top side of the screen, noon, change background to light blue
      background(3, 252, 240);
      //change sun color to medium yellow 
      fill(252, 227, 3);

    }
    // Set line color to black, weight to 2
    stroke(0);
    strokeWeight(2);

    // Draw the sun (random positions)
    ellipse(randomPositionX, randomPositionY, 180, 180);

    // Draw house main frame
    fill(201, 152, 54);
    rect(180, 300, 240, 200);

    // Draw door
    fill(166, 91, 22);
    rect(250, 420, 60, 80);

    // Draw window
    stroke(84, 172, 255);
    fill(150, 255, 245);
    rect(300, 330, 80, 60);
    strokeWeight(2);

    // Draw grass
    stroke(0);
    fill(52, 224, 75);
    rect(0, 500, 600, 100);

    // Draw roof
    fill(194, 37, 19);
    triangle(120, 300, 480, 300, 300, 150);

    // Displaying time

    // Create font
    fill(0);
    stroke(0);
    PFont myFont = createFont("Comic Sans", 20);
    textFont(myFont, 20);

    // Display font and text for general date
    text(year() + " / " + month() + " / " + day(), 450, 580);

    // Display font and text for specific time (String.format simply makes single
    // digits have leading zeros)
    text(hour() + " : " + String.format("%02d", minute()) + " : " + String.format("%02d", second()), 470, 560);
  }

}