

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NthSmalestTakeHomeExm {
	public static void main(String[] args) {

		Random rand= new Random(); 
		Set<Integer> ts = new TreeSet<Integer>();
		Scanner min = new Scanner(System.in);
		System.out.println("Whats the Min range for the list :");
		int Nmin = min.nextInt();
		Scanner max = new Scanner(System.in);
		System.out.println("Whats the Max range for the list :");
		int Nmax = max.nextInt();
		while(ts.size()<500) {
			int randNum = rand.nextInt((Nmax-1)-Nmin)+Nmin;
					ts.add(randNum);	
	}
		System.out.print(ts);
		List<Object> list = new ArrayList<Object>();
		list.addAll(ts);
		System.out.println();
	    Scanner Nth = new Scanner(System.in);
		System.out.println("choose the Nth smallest Random number generated you looking for: ");
		int N = Nth.nextInt();
		System.out.println("the "+N+"th smalest number is : " + list.get(N-1));
		
}
}
