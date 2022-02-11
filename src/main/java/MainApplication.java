package main.java;

import java.util.Arrays;
import java.util.List;

public class MainApplication {

	public static void main(String[] args) {
		
		// Initialize input
		String[] args1 = new String[]{"abcdqw", "aafdcw4ffs", "ddheehed", "ddwq43334"};
		String[] args2 = new String[]{"ab", "acbdw", "dddddddddd", "fdfdfdfdffe333d"};
		String[] args3 = new String[]{"fdswddddd", "ab", "dddd", "ddd3dffff3"};
		List<String[]> rows = Arrays.asList(args1, args2, args3);
		
		// Call the function to generate result
		int[] result = CalcMaxColLengths.maxColLengths(rows);
		System.out.println(Arrays.toString(result));
    }
	
}
