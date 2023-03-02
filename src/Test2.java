//5. Write the Java Program to calculate total of five subject marks and average of it.
public class Test2 {
	
	public static int average(int marathi, int hindi, int english, int history, int science) {
		int total = marathi+hindi+english+history+science;
		
		int averag = total/5;
		System.out.println("Average of numbers are >"+ averag);
		return averag;
	}
	public static void main(String []args) {
		average(89,93,81,67,76);
		
	}
	

}
