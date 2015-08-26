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

// central  circle that changes size
 public void poop()
 { fill((int) (Math.random() * 256),(int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 100));
  stroke(0, 0, 0, 50);
ellipse(250, 250, mouseX,mouseY);}
 
// dots that follow mouse
public void dots()
{ fill((int) (Math.random() * 256),(int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 100));
  noStroke();
ellipse(mouseX,mouseY, 50, 50);
}

//Center star
public void star()
{fill((int) (Math.random() * 256),(int) (Math.random() * 256), (int) (Math.random() * 100));

ellipse(250,250, 5, mouseX/2 + mouseY/2);
ellipse(250,250, mouseX/2 + mouseY/2,5 );
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
