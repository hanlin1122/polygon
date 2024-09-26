public class Rectangle extends Polygon{

  public Rectangle(LineSegment[] sides, Point[] vertices){
    super(4, sides, vertices);
  }

  public double area(){
    LineSegment[] sides = getSides();
    double sideOne = Math.pow((Math.pow((sides[0].ptA.x-sides[0].ptB.x),2)+Math.pow((sides[0].ptA.y-sides[0].ptB.y),2)), 0.5); //distance formula for side1
    double sideTwo = Math.pow((Math.pow((sides[1].ptA.x-sides[1].ptB.x),2)+Math.pow((sides[1].ptA.y-sides[1].ptB.y),2)), 0.5); //distance formula for side2
    if(sideTwo == sideOne){//checks if sides are opposite
      sideTwo = Math.pow((Math.pow((sides[2].ptA.x-sides[2].ptB.x),2)-Math.pow((sides[2].ptA.y-sides[2].ptB.y),2)), 0.5); //gets other side if opposite, if also same, square and doesnt matter if same
    }

    return sideOne*sideTwo;
  }

  public double perimeter(){
    LineSegment[] sides = getSides();
    return Math.pow((Math.pow((sides[0].ptA.x-sides[0].ptB.x),2)+Math.pow((sides[0].ptA.y-sides[0].ptB.y),2)), 0.5)+Math.pow((Math.pow((sides[1].ptA.x-sides[1].ptB.x),2)+Math.pow((sides[1].ptA.y-sides[1].ptB.y),2)), 0.5)+Math.pow((Math.pow((sides[2].ptA.x-sides[2].ptB.x),2)+Math.pow((sides[2].ptA.y-sides[2].ptB.y),2)), 0.5)+Math.pow((Math.pow((sides[3].ptA.x-sides[3].ptB.x),2)+Math.pow((sides[3].ptA.y-sides[3].ptB.y),2)), 0.5);
  }

  
}
