import java.util.*;

import static java.lang.Math.pow;

@SuppressWarnings("unused")
public class HW0 {

public static void main(String[] args) {
	
	int j = 0;
	double dbl = 0;
	int res = 0;
	
	@SuppressWarnings("resource")
	Scanner cin  = new Scanner(System.in);
	System.out.println("Введите значение переменной x>>");
	
	while (cin.hasNext())
	{
		if (cin.hasNextDouble())
		{				
			dbl = cin.nextDouble();
			if (dbl <= -3) {
			System.out.println("Результат: 9");
			} else if (dbl > 3) {
				System.out.println("Результат: " + (1/(pow(dbl, 2)+1)));
				} else {
					System.out.println("Результат не определен!");
					}
			break;
		}
		else
		{
			cin.nextLine();
			if (j == 0) System.out.println("Введите число!");
			else 
				System.out.println("Нажмите на клавиатуре кнопки 1,2,3,4,5,6,7,8,9 или 0!");
			j++;
		}	
	}
}
}