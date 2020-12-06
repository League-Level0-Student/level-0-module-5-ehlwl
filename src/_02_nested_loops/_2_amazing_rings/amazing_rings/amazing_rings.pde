
void setup() {
  size(800,500);
}

void draw() {
  
  // Go to the recipe to run the demonstration before starting this program
  for (int j=0;j<500;j++){
    
  for(int i = 30;i>0;i--){
    if (i%2==0){
      int m = i*5;
   fill(0,0,0);
   ellipse(250+j,250,m,m);
    }
    else{
      int m = i*7;
      fill(200,200,200);
      ellipse(250+j,250,m,m);
    }
    background(200,200,200);
  }
  
  }
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
  
