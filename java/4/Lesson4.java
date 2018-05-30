import java.io.*;
import java.util.*;
public class Lesson4 {
    public static void main(String[] args) {
        start();
    }	
	public static void start () {
        System.out.println("Vvedite predlozheniye: ");
        Scanner sc = new Scanner(System.in);
		if (sc.hasNext()) {
			String t = sc.nextLine();
			String s = t.toLowerCase();
			numbers(s);
			sorting(s);
			start();
		}
		else{
			System.out.println("Vvedite korrektno slovo");
			start();
		} 
	} 
	private static void numbers(String s) {
        int count = 0;
        if(s.length() != 0){
            count++;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ' '||s.charAt(i) == ',' ){                        
                count++;
                }
            }
        } 
            System.out.println("Vy vveli "+count+"slov(a)");
	}
private static void sorting(String s) {
		String[] words = s.split("(\\s+|[,])");
		Arrays.sort(words);
		System.out.println("Slova otsortirovany: " + Arrays.toString(words));
	}
}