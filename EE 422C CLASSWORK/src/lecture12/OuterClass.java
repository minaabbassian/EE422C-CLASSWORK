package lecture12;

public class OuterClass {
	private String priv = "abc";
	public String publ = "xyz";
	static private String spriv = "def";
	static public String spubl = "uvw";
	
	private static class Node {
		int data;
		Node next;
		public void printPubl() {
			// System.out.println(priv + publ + spriv + spubl);
		}
	}
	
	// Question:
	// Line 13 doesn't compile because:
	/*
	 A. priv, publ, and spriv are inaccessible
	 B. spriv and priv are inaccessible
	 C. priv and publ are inaccessible
	 D. priv and spubl are inaccessible
	 E. Other combination
	 */
	
	 class Printer {
		public void printPubl() {
			//System.out.println(priv + publ + spriv + spubl);
		}
	}
}
