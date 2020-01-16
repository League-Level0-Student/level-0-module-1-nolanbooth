
void setup() {
PImage  face = loadImage("tomdnajerry.jpg");
image(face, 0, 0);
size(300, 388);
face.resize(300, 388);
}
void draw() {
noStroke();
  fill(255,255,255);
  rect(20, 35, 150, 40);
fill(mouseX,mouseY,mouseX);
ellipse(130, 175, 40, 65);
fill(mouseY, mouseX, mouseY);
ellipse(130, 175, 25, 25);

fill(mouseX,mouseY,mouseX);
ellipse(80, 175, 40, 65);
fill(mouseY, mouseX, mouseY);
ellipse(80, 175, 25, 25);
}
