
public class ArgRunner{
	public static void main(String[] args){
		
			Calculator calc = new Calculator();
			
			String first = args[0];
			String second = args[1];
			calc.add(Integer.valueOf(first), Integer.valueOf(second));
			System.out.println("Result : " + calc.getResult());
			calc.cleanResult();
			
	}
}