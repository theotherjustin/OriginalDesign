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
void star()
{fill(random(255),random(255), 0, 30);
ellipse(250,250, 5, mouseX/2 + mouseY/2);
ellipse(250,250, mouseX/2 + mouseY/2,5 );

}
 void poop()
 { fill(random(255),random(255), random(255), 60);
  stroke(0, 0, 0, 50);
ellipse(250, 250, mouseX,mouseY);}

void dots()
{ fill(random(255),random(255), random(255), 40);
  noStroke();
ellipse(mouseX,mouseY, 50, 50);
}

