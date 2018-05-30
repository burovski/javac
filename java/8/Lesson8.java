import java.io.*;
import java.util.*;
public class Lesson8 {
    public static void main(String[] args) {
        start();
    }	
	public static void start () {
        System.out.println("Vvedite verkhniy predel diapazona(мах=100): ");
        Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int a = sc.nextInt();
			if (a<=100){
				mas(a);
			}
			else{
				System.out.println("Nepravil'nyy format vvoda,  vveite tseloye chislo(мах=100): ");
			}
		}
		else{
			System.out.println("Nepravil'nyy format vvoda,  vveite tseloye chislo(мах=100): ");
			start();
		}    
	} 
	public static void mas(int a) {
		int[] array = new int[a];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			//System.out.println(array[i]);
		}
		System.out.println(Arrays.toString(array));
		palindrom(array);
	}
	public static void palindrom(int[] array) {
		for (int i = 10; i < array.length; i++) {
			int a = array[i];
			String str = String.valueOf(a);
			pal(str);
		}
	}
	public static void pal(String str) {
        boolean t = str.equals(new StringBuilder().append(str).reverse().toString());
		if (t){
			System.out.println(str + "Palindrom");
		}		
    }	
}