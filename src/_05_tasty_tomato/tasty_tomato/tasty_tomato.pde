void setup() {
    size(500, 500);
    background(200, 200, 200);
    noStroke();
    fill(200,100,50);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(100,200,0);
    rect(176, 103, 12, 32);
rect(10,10,10,10);
}

void draw() {
if (mousePressed){
fill(200,200,200);
ellipse(mouseX,mouseY,60,60);
}
fill(200,200,200);
ellipse(mouseX,mouseY,60,60);
}
