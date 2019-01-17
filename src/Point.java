import java.awt.*;

public class Point {
    private int x;
    private int y;
    private Color c;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
        this.c = Color.blue;
    }

    public Point(int x, int y, Color c){
        this(x,y);
        this.c = c;
    }

    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "(" + x +", "+ y +")";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!= null && obj.getClass() == getClass()){ // if(obj instanceof Point){
            Point p = (Point) obj;
            return (x == p.x && y == p.y);
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 19; //some prime number
        result = 37 * result + x;
        result = 65531 * result + y;
        return result;
    }
}
