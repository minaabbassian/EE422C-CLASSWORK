package classwork6_interface;

public class Statics {
	static int staticInt;
	int nonStaticInt;

	public static void staticFoo() {
		staticInt = 3;
		nonStaticInt = 4; // not OK
		(new Statics()).nonStaticInt = 5;
		this.nonStaticInt = 7; // not OK
	}

	public void nonStaticFoo() {
		staticInt = 3;
		nonStaticInt = 5;
	}
}

class Main {
	public static void main (String [] args) {
		Statics.staticFoo();
		Statics s = new Statics();
		s.nonStaticFoo();
	}
}
