public class LineTester {
    public static void main(String[] args) {
        //create a line l with two points as follows:
        Line l = new Line(new Point(1,0), new Point(5,0));
        //display the length of line l
        System.out.printf("Length of line with coordinates (%.1f,%.1f) and (%.1f,%.1f) : %.2f",l.getStartPoint().getxCoordinate(),
                l.getStartPoint().getyCoordinate(),l.getEndPoint().getxCoordinate(),l.getEndPoint().getyCoordinate(),l.getLength());
    }
}

