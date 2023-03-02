//5. Write the Java Program to calculate total of five subject marks and average of it.


public class TotalAverage {
	public static void main(String[] args) {
		
		int marathi = 86;
		int hindi = 78;
		int english = 90;
		int history = 68;
		int science = 80;
		 int total = (marathi+hindi+english+history+science);
		 int avr = (total/5);
		 
		 System.out.println("Total of Five Subject Marks " + total);
		 System.out .println("Average of total five Subject " + avr);
		 
	}

}
