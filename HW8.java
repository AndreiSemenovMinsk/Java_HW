import java.util.*;

import static java.lang.Math.tan;

@SuppressWarnings("unused")
public class HW0 {

public static void main(String[] args) {
	
	int j = 0;
	int nomParametr = 0;
	double dbl = 0;
	double a = 0;
	double b = 0;
	double h = 0;
	double res = 0;
	
	@SuppressWarnings("resource")
	Scanner cin  = new Scanner(System.in);
	System.out.println("Введите начало диапазона>>");
	
	while (cin.hasNext())
	{
		if (cin.hasNextDouble())
		{				
			dbl = cin.nextDouble();
			if (nomParametr == 0) { 
				a = dbl;
				System.out.println("Введите конец диапазона>>");
			}	else if (nomParametr == 1) { 
						if (dbl < a) {
							System.out.println("Конец диапазона должен быть больше неачала!");
							nomParametr--;
						} else {
							System.out.println("Введите шаг диапазона>>");
							b = dbl;
						}
			}	else if (nomParametr == 2) { 
						if (b - a < dbl) {
							System.out.println("Шаг задан слишком большим!");
							nomParametr--;
						} else {
							
							h = dbl;
							System.out.println("Таблица значений!");
							
							for (int i = 0; a + h*i < b; i++)
							{
								System.out.println("F("+ (a + h*i)+ ") = " +(2* tan((a + h*i)/2)+1));
							}
				
							break;
						}
			}	
			nomParametr++;
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