import java.io.*;
import java.util.*;
public class Lesson10 {
    public static void main(String[] args) {
        start();
    }	
	public static void start () {
        System.out.println("Vvedite tri tsifry(0-9): ");
        Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a<10&&b<10&&c<10){
				something(a,b,c);
			}
			else{
				System.out.println("Nepravil'no");
				start();
			}  
		}else{
			System.out.println("Nepravil'no");
			start();
		}    
	} 
	private static void something(int a, int b, int c) {
		System.out.println(a+""+b+""+c);
		System.out.println(a+""+c+""+b);
		System.out.println(b+""+a+""+c);
		System.out.println(c+""+a+""+b);
		System.out.println(c+""+b+""+a);
		System.out.println(b+""+c+""+a);
	}
}