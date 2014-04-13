package programmieren.aufgabe1;


import java.util.ArrayList;
import java.util.List;

public class Fibonacci {


	public static List <Pair < Integer , Integer >> getFibonacciPaerchen (int n) {
		List <Pair <Integer, Integer>> list = new ArrayList<>();
		
		if(n == 0) {
			return list;
		}
		
		for(int i = 0; i <= n; i++) {
			switch(i) {
				case 0:
					list.add(new Pair<>(0,0));
					break;
				case 1:
					list.add(new Pair<>(1,1));
					break;
				case 2:
					list.add(new Pair<>(2,1));
					break;
				case 3:
					list.add(new Pair<>(3,2));
					break;
			}
		}
		
		for(int i = 4; i <= n; i++) {
			int currentNumber = list.get(i - 2).getRight() + list.get(i - 1).getRight();
			list.add(new Pair<>(i, currentNumber));
		}
		
		
		return list;
	}
}
