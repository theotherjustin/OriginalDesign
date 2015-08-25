import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
	size(500,500);
}

public void draw()
{
  
 star();
 poop();
 dots();
 
}
public void star()
{fill(random(255),random(255), 0, 30);
ellipse(250,250, 5, mouseX/2 + mouseY/2);
ellipse(250,250, mouseX/2 + mouseY/2,5 );

}
 public void poop()
 { fill(random(255),random(255), random(255), 60);
  stroke(0, 0, 0, 50);
ellipse(250, 250, mouseX,mouseY);}

public void dots()
{ fill(random(255),random(255), random(255), 40);
  noStroke();
ellipse(mouseX,mouseY, 50, 50);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
