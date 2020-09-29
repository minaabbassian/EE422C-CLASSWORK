package lecture9;

import java.util.*;
import java.io.*;

public class ReverseLines {
	public static void main (String [] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input.txt"));
		reverse(sc);
	}

	public static void reverse(Scanner sc) {
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			reverse(sc);
			System.out.println(line);
		}
	}
}

/*

import java.io.*;

public class FileCrawl {
	public static void main (String [] args) {
		File f = new File("/Users/vallathn/CLionProjects");
		crawl(f);
	}

    public static void crawl(File f) {
        crawl(f, "");   // call private recursive helper
    }
    
    // Recursive helper to implement crawl/indent behavior.
    private static void crawl(File f, String indent) {
        System.out.println(indent + f.getName());
        if (f.isDirectory()) {
            // recursive case; print contained files/dirs
            for (File subFile : f.listFiles()) {
                crawl(subFile, indent + "    ");
            }
        }
    }
}
*/
