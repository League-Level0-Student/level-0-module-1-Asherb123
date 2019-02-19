void setup() {
  PImage face = loadImage("YEEEEE.jpg");
  image(face, 0, 0);

  size(500, 350);
}

void draw() {






  fill(mouseX,mouseY, 0);
  ellipse(295, 123, 25, 25);

  ellipse(240, 143, 25, 25);

fill(mouseY,mouseX,0);
ellipse(295, 123, 10, 10);
ellipse(240, 143, 10, 10);




}
