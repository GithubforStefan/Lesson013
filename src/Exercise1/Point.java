package Exercise1;

public class Point {
    final Integer x;
    final Integer y;

    public Point(int x,int y) {
       this.x = x;
        this.y = y;
    }

    public boolean equals(Object object) {
        if (object instanceof Point) {
            Point point = (Point) object;
            return this.x.equals(point.x) && this.y.equals(point.y);
        }

        return false;
    }

    public int hashCode(){
        return this.x+this.y;
    }

}
