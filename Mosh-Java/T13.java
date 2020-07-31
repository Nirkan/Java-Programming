
// Formatting Numbers


import java.text.NumberFormat;

class Main{

	public static void main(String[] args){


	NumberFormat currency =	NumberFormat.getCurrencyInstance() ;

	NumberFormat percent = NumberFormat.getPercentInstance();


	String result = currency.format(1234567.891);

	String result2 = percent.format(0.1);

	String result3 = NumberFormat.getPercentInstance().format(0.25);

	System.out.println(result);

	System.out.println(result2);	

	System.out.println(result3);

	}


}
