
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
ellipse(130, 175, 40, 65);
fill(150, 50, 20);
ellipse(130, 175, 25, 25);

fill();

}
