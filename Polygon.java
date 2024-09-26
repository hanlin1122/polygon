public class Polygon{
  private int numberOfSides;
  private LineSegment[] sides;
  private Point[] vertices;

  private static int polygonsCreated = 0;
  private static Polygon[] allPolygons = new Polygon[0];


  public static void printReport(){
    System.out.println(polygonsCreated+ " polygons have been created.");
    for(int i =0; i<polygonsCreated; i++){
      System.out.println(allPolygons[i].toString());
    }
  }

  public Polygon(int numberOfSides,LineSegment[] sides,Point[] vertices){
    this.numberOfSides = numberOfSides;
    this.sides=  sides;
    this.vertices=vertices;
    
    polygonsCreated++;
    
    Polygon[] storage = new Polygon[allPolygons.length];
    for(int i = 0; i<allPolygons.length;i++)
      storage[i] = allPolygons[i];
    
    allPolygons = new Polygon[polygonsCreated];
    for(int i = 0; i<allPolygons.length-1;i++)
      allPolygons[i] = storage[i];
    allPolygons[allPolygons.length-1] = this;
  }
  

  public double area(){
    System.out.println("Error: Cannot calculate area for this Polygon");
    return 0;
  }

  public double perimeter(){
    System.out.println("Error: Cannot calculate perimeter for this Polygon");
    return 0;
  }

  public String toString(){
    return "Polygon with "+numberOfSides+ " sides, area = "+area()+", perimeter = "+perimeter();
  }

  public LineSegment[] getSides(){
    return sides;
  }

  public Point[] getVertices(){
    return vertices;
  }
}
