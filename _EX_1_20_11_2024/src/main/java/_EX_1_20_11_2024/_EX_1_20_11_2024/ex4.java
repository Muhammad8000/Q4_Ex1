package _EX_1_20_11_2024._EX_1_20_11_2024;



/*** Rami Suri 209431477 - Muhammad Yousef 318452182 ***/

public class ex4 {
	
	public  String Compare(double a, double b, String operation) {
		
		switch(operation) {
		case "Regular":
			if(a>b) return "A";
			else return "B";		
		
		case "Negative":
			a= a*-1;
			b = b*-1;
			if(a>b) return "A";
			else return "B";
			
		case "Reciprocal":
			try {	
				
				
			a = 1/a;
			b = 1/b;	
			if (a == Double.POSITIVE_INFINITY ||a == Double.NEGATIVE_INFINITY 
				|| b == Double.POSITIVE_INFINITY ||b == Double.NEGATIVE_INFINITY)
	                throw new ArithmeticException();
			}
			catch(ArithmeticException ae) {
				return "Error";
			}
			if(a>b) return "A";
			else return "B";
		
		}
		return "Error";
		
	}
}
