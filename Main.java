class Main {
  public static void main(String[] args) {
    test2();
  }
  public static void test1() {
    Rectangle[] rectangles = new Rectangle[10];
    for(int i = 0; i < 10; i++) {
      Point A = new Point(0, 0);
      Point B = new Point(0, i+1);
      Point C = new Point(i+2, i+1);
      Point D = new Point(i+2, 0);
      LineSegment AB = new LineSegment(A, B);
      LineSegment BC = new LineSegment(B, C);
      LineSegment CD = new LineSegment(C, D);
      LineSegment AD = new LineSegment(A, D);
      LineSegment[] sides = {AB, BC, CD, AD};
      Point[] vertices = {A, B, C, D};
      rectangles[i] = new Rectangle(sides, vertices);
    }
    Rectangle.printReport();
  }

  public static void test2() {
  double ans =0;
   RegularPentagon[] pentagons = new RegularPentagon[25];
    for(int sideLength = 1; sideLength <= 25; sideLength++) {
      double x = Math.sin(Math.toRadians(36))*sideLength;
      double y = Math.sin(Math.toRadians(54))*sideLength;

      Point A = new Point(0, 0);
      Point B = new Point(-1*x, y);
      Point C = new Point(sideLength/2, y+(-1*x));
      Point D = new Point(sideLength+x, y);
      Point E = new Point(sideLength, 0);
      
      LineSegment AB = new LineSegment(A, B);
      LineSegment BC = new LineSegment(B, C);
      LineSegment CD = new LineSegment(C, D);
      LineSegment DE = new LineSegment(D, E);
      LineSegment AE = new LineSegment(A, E);
      Point[] vertices = {A,B,C,D,E};
      LineSegment[] sides = {AB, BC, CD, DE,AE};
      pentagons[sideLength-1] = new RegularPentagon(sides, vertices);
      ans+=pentagons[sideLength-1].area();
    }
    System.out.println(ans);
   }
  }
