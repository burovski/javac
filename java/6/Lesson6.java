import java.io.*;
import java.util.*;
public class Lesson6 {
    public static void main(String[] args) {
        start();
    }	
	public static void start () {
        System.out.println("Vvedite tri dliny otrezkov dlya proverki na pryamougol'nost' treugol'nika: ");
        Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(tren(a,b,c));
		}
		else{
			System.out.println("Chislo ne tseloye");
			start();
		}    
	}
	private static String tren(int a, int b, int c) {
		int max;
		int d;
		if(a>b){
			max=a;
		}
		else{
			max=b;
		}
		if(c>max){
			max=c;
		}
		else{
			max=max;
		}
		d=max*max;
		if(d==(a*a)+(b*b)){
			return "Yavlyayetsya pryamougol'nym treugol'nikom";
		}
		else{
			return "NE yavlyayetsya pryamougol'nym treugol'nikom";
		}
	}
}