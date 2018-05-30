import java.io.*;
import java.util.*;
public class Lesson1 {
    public static void main(String[] args) {
        start();
    }	
	public static void start () {
        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int k = sc.nextInt();
			evenNotEven(k);
			System.out.println(simple(k));
		}
		else{
			System.out.println("The number is not an integer");
			start();
		}    
	} 
	public static void evenNotEven (int a) {
		if (a == 0){
			System.out.println("You entered a number 0");
		}
		else if (a%2>0) {
			System.out.println("Not even");
		} 
		else {
			System.out.println("Even");
		}
	} 
	public static String simple (int a) {
        if (a < 2){
			return "The entered figure does not refer not to simple not to compound\nYour number:"+a;
		}		
        for (int i = 2; i*i <= a; i++){
            if (a%i == 0) {
			return "Compound\nYour number:"+a;  
			}    		
		}
		return "Простое\nВаше число:"+a;
	}
}