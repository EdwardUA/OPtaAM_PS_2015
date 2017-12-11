package snippet;
import java.util.Scanner; // импортируем класс
public class zadanie1 {
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter your name: ");
	    String s = scan.next();
	    System.out.println("Hello "+s);//zadanie 1

	    Mass catBox = new Mass();
	    catBox.setDim(400, 200, 250);
	    int vol = catBox.getVolume();

	    mInfoTextView.setText("Объём ящика: " + vol);
	}
}
