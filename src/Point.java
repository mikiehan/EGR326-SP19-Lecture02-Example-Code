public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
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
        if(obj.getClass() == getClass()){ // if(obj instanceof Point){
            Point p = (Point) obj;
            return (x == p.x && y == p.y);
        }else{
            return false;
        }
    }
}
