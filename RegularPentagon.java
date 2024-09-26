public class RegularPentagon extends Polygon{

  public RegularPentagon(LineSegment[] sides, Point[] vertices){
    super(5, sides, vertices);
  }

  public double area(){
    LineSegment side = getSides()[0];
    double sideLength = Math.pow((Math.pow((side.ptA.x-side.ptB.x),2)+Math.pow((side.ptA.y-side.ptB.y),2)), 0.5);
    return (Math.pow(5 * (5 + 2 * (Math.pow(5,0.5))),0.5) * sideLength * sideLength) / 4;
  }

  public double perimeter(){
    LineSegment side = getSides()[0];
    double sideLength =  Math.pow((Math.pow((side.ptA.x-side.ptB.x),2)+Math.pow((side.ptA.y-side.ptB.y),2)), 0.5);
    return sideLength*5;
  }
}
