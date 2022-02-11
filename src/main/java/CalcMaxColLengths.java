package main.java;

import java.util.List;

public class CalcMaxColLengths {

	public static int[] maxColLengths(List<String[]> rows) {
	
		// Initialize result array (Assuming the input list of String array might have different size of columns. Eg: [["ab"],["a","abc"]])
		int length = 0;
		for (String[] row : rows) {
			if (row.length > length) {
				length = row.length;
			}
		}
		int[] result = new int[length];
		
		// Loop through rows and cols for maximum col length
		for (String[] row : rows) {
			for (int i = 0; i < row.length; i++) {
				if (row[i].length() > result[i]) {
					result[i] = row[i].length();
				} 
			}
		}
		return result;
	}
}
