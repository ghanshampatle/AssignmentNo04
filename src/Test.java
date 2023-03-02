/*Write the java program to design method for division of two number
 *  which returns int value to that method and result should be print into main method.
 */
public class Test {
	static int getDivision(int a, int b) {
		int c = a/b;
		return c;
	}
	public static void main(String[] args) {
		Test test = new Test();
		int k = test.getDivision(50,10);
		System.out.println("Division of two numbers are " + "50" + "&" + "10" + "is" + k);
	}

}
