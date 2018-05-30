import java.io.*;
import java.util.*;
public class Lesson3 {
    public static void main(String[] args) {
        start();
    }	
	public static void start () {
        System.out.println("Vvedite slovo dlya proverki: ");
        Scanner sc = new Scanner(System.in);
		if (sc.hasNext()) {
			String t = sc.nextLine();
			String s = t.toLowerCase();
			palindrom(s);
			start();
		}
		else{
			System.out.println("Vvedite korrektno slovo");
			start();
		}    
	} 
	private static void palindrom(String s) {
		boolean b = true; 
		for (int i = 0; i < s.length() / 2 + 1; i++) {
			if (s.toCharArray()[i] != s.toCharArray()[s.length() - i - 1]) {
				b = !b;
				break;
			}
		}	 
		System.out.println(b ? "Slovo palindrom " + s : "Slovo NE palindrom " + s);
	}
}