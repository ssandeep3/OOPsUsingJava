package testprj;
import java.lang.*;

class Point{
	private float x, y;
	Point(){	x=0;y=0;}
	Point(float a){	x=a;y=0;}
	Point(float a, float b){	x = a; y = b;}
	public void get() {
		System.out.println("Point:("+x+","+y+")");
	}
	public void set(float a, float b) {
		x = a;	y = b;
	}
	public float pointDistance(Point p1, Point p2) {
		double d;
		d = Math.sqrt(((p1.x-p2.x)*(p1.x-p2.x))+((p1.y-p2.y)*(p1.y-p2.y)));
		return (float)d;
	}
}

public class PointDist {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		System.out.println(p1.pointDistance(p1, p2));
		p1.set(78.0f, 67.45f);
		p2.set(49.98f, 23.87f);
		System.out.println(p1.pointDistance(p1, p2));
		Point m = new Point(56.8f, 100.98f);
		Point n = new Point(56.8f, 100.98f);
		System.out.println(p1.pointDistance(m, n));
		m.get();
	}

}
