
public class Rectangle {
	public Point point1;
	public Point point2;
	
	public Rectangle(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
	}
	public double xStorona()
    {
       return this.point2.x-this.point1.x;
    }
	public double yStorona()
    {
       return this.point2.y-this.point1.y;
    }
	
	/*public boolean peresikaytsya(){
		return this.point1.x < this.point1.y && this.point2.x<this.point2.y && this.point1.x>this.point1.y && this.point2.x>this.point2.y ;
		
	}*/
	boolean intersects(Point point1, Point point2) {//Box box1, Box box2
		//Y not intersects

		if (point1.y < point2.y || point1.y > point2.y) {

		return false;

		}

		//X not intersects

		if (point1.x < point2.x || point1.x > point2.x) {

		return false;

		}

		return true;

		}
	
	//http://ua.onlinemschool.com/math/formula/ellipse/
	/*
	 nam nada 1)a,b - a polovina po x, b po y
	 			2)tochka kotoryu podstavlyaem (estb)
	 */
	boolean elipstochka(Point point1, Point point2,Point pointelips)
	{
		//return (sqrt(point1.x) / sqrt(pointelips.x) + sqrt(Y) / sqrt(B) > 1);
		
	}
	/* 
	 * If (sqrt(X) / sqrt(A) + sqrt(Y) / sqrt(B) > 1) Then Мы покинули эллипс!

Код:

If (sqrt(X) / sqrt(A) + sqrt(Y) / sqrt(B) = 1) Then Спасите, нас сожрал край эллипса!

Код:

If (sqrt(X) / sqrt(A) + sqrt(Y) / sqrt(B) < 1) Then Ололо, мы внутри!
	 */
	
	
}
