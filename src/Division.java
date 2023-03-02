//Division
public class Division {
	int getDivision(int a , int b) {
		int P = a/b;
		return P;
	}
	public static void main(String[] args) {
		Division division = new Division();
		int Div = division.getDivision(50, 10);
		System.out.println("Division is>>" + Div);
		
	}
	
	

}
