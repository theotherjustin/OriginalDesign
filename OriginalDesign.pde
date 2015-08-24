void setup()
{
	size(500,500);
}

void draw()
{
 
noStroke();
  fill(random(255),random(255), random(255), 60);
ellipse(250, 250, mouseX,mouseY);
  fill(random(255),random(255), random(255));
 ellipse(mouseX, mouseY, 50, 50);

}

