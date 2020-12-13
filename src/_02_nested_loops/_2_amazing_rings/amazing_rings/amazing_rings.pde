int xPos = 250;
int sPos = 650;
void setup() {
  size(800,500);
}

void draw() {
  
  // Go to the recipe to run the demonstration before starting this program
  background(200,200,200);
    
  for(int i = 30;i>0;i--){
    if (i%2==0){
      int m = i*10;
   fill(0,0,0);
   ellipse(xPos,250,m,m);
    }
    else{
      int m = i*10;
      fill(200,200,200);
      ellipse(xPos,250,m,m);
    }
  }
    for(int i = 30;i>0;i--){
    if (i%2==0){
      int m = i*10;
   fill(0,0,0);
   ellipse(sPos,250,m,m);
    }
    else{
      int m = i*10;
      fill(200,200,200);
      ellipse(sPos,250,m,m);
    }
  }
  xPos = xPos +1;
  sPos = sPos -1;
  }
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */

  
