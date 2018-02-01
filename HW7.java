import java.util.*;

import static java.lang.Math.pow;

@SuppressWarnings("unused")
public class HW0 {

public static void main(String[] args) {
	
	int arrInt[] = {-1, 2, 3}; 
	
	for (int x: arrInt) {
		if (x < 0)	{
			System.out.println("Результат: " + pow(x, 4));
		} else {
			System.out.println("Результат: " + pow(x, 2));
		}
	}
}
}