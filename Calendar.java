import java.util.GregorianCalendar;
import java.util.Calendar;

public class HW0 {
	public static void main(String[] args)
	{
		int[] seasonMonth = {0,0,1,1,1,2,2,2,3,3,3,4};
		int[] seasonMonthOrder = {1,2,0,1,2,0,1,2,0,1,2,0};
		String str = "";
		String[] season = {"Winter", "Spring", "Summer", "Fall"};
		String[][] calendarTable = new String [35][3];
		GregorianCalendar d = new  GregorianCalendar();
		
		int today = d.get(Calendar.DAY_OF_MONTH);
		int year = d.get(Calendar.YEAR);
		int stringNum = 1;
		
		
				d.set(Calendar.DAY_OF_MONTH, 1);//d.set(Calendar.DAY_OF_YEAR, 1);
				int weekday = d.get(Calendar.DAY_OF_WEEK);
				int month;
				int curMonth = month = d.get(Calendar.MONTH);
				
				calendarTable[seasonMonth[month]*7][seasonMonthOrder[month]]  = "Вс Пн Вт Ср Чт Пт Сб";	
				
				for (int i = Calendar.SUNDAY; i < weekday; i++) {
					str += "   ";
				}
				
				do 
				{					
					int day = d.get(Calendar.DAY_OF_MONTH);
					if (day < 10) str += " ";
					
					str = str +day;
					
					if (day == today && month == curMonth)
						str += "*";
					else
						str += " ";
					
					if (weekday == Calendar.SATURDAY){
						
						//System.out.print((stringNum+seasonMonth[month]*6)+"&"+(seasonMonthOrder[month])+"&"+str);
						
						calendarTable[stringNum+seasonMonth[month]*7][seasonMonthOrder[month]]  = str;
						str = "";
						stringNum++;
					}
					
					weekday = d.get(Calendar.DAY_OF_WEEK);
					if (month != d.get(Calendar.MONTH)) {
						
						month = d.get(Calendar.MONTH);
						stringNum = 1;
						str = "";
						
						calendarTable[seasonMonth[month]*7][seasonMonthOrder[month]]  = "Вс Пн Вт Ср Чт Пт Сб";
						
						for (int i = Calendar.SUNDAY; i < weekday; i++) {
							str += "   ";
						}
					}	
					
					d.add(Calendar.DAY_OF_MONTH, 1);					
				}
				while (d.get(Calendar.YEAR)==year);
				
				for (int i = 0; i < calendarTable.length; i++){
					
					System.out.println();
					if (i%7==0){
						System.out.println(season[(i/7)%4]);
					}
					for (int j = 0; j < calendarTable[i].length; j++){
						if (calendarTable[i][j] == null)
							System.out.print("                      ");
						else
							System.out.print(calendarTable[i][j]+" ");
					}
						
				}
					
	}
}
