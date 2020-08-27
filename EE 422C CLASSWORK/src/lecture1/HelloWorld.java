package lecture1;

public class HelloWorld {
	public static void main (String[] args) {
		if(args.length > 0) { //if no argument, then doesn't print anything
			if(args[0].contentEquals("Eng")) {
				System.out.println("Hello World!");
			} else {
				System.out.println("Bonjour!");
			}
		}
		
	}

}
