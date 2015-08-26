void setup()
{
	size(500,500);
}

void draw()
{
  
 star();
 poop();
 dots();
 
}

// central  circle that changes size
 void poop()
 { fill((int) (Math.random() * 256),(int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 100));
  stroke(0, 0, 0, 50);
ellipse(250, 250, mouseX,mouseY);}
 
// dots that follow mouse
void dots()
{ fill((int) (Math.random() * 256),(int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 100));
  noStroke();
ellipse(mouseX,mouseY, 50, 50);
}

//Center star
void star()
{fill((int) (Math.random() * 256),(int) (Math.random() * 256), (int) (Math.random() * 100));

ellipse(250,250, 5, mouseX/2 + mouseY/2);
ellipse(250,250, mouseX/2 + mouseY/2,5 );
}

