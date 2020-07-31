
// Strings in Java


class Main {

	public static void main(String[] args){

		
		String message = "  Hello World" + "!!"  ;

		System.out.println(message);

		System.out.println(message.endsWith("!!"));

		System.out.println(message.startsWith("!!"));

		System.out.println(message.length());

		System.out.println(message.indexOf("W"));

		System.out.println(message.replace("!", "*"));   // in java strings areimmutalbe

		System.out.println(message.toLowerCase());

		System.out.println(message.toUpperCase());

		System.out.println(message.trim());

		

		}

}
