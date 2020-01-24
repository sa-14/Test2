
public class MultiCatch {

	public static void main(String[] args) {

		int num1, num2;
		
		try {
			num1 = 0;
			num2 = 10 / num1;
			System.out.println(num2);
			System.out.println("execute");
			
		}
		
		catch (ArithmeticException a){
			System.err.println("Can't divide by zero");
			
			
		}
		
		catch (Exception e) {
			System.out.println("exception");
			
			
		}
		
		
		finally {
			System.out.println("Completed");
		}
		
	}

}
