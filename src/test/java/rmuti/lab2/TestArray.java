package rmuti.lab2;

import java.util.Arrays;

public class TestArray {
	
	public static void main(String args[]) {
	int[] a = {0,1,2,3,1,5,1};
	ArrayUtil obj = new ArrayUtil(a);
	System.out.println(obj.sumArray());
	obj.countOne();
	System.out.println(obj.countOne());
	obj.findOne();
	System.out.println(Arrays.toString(obj.findOne()));
	obj.doubleArray();
	System.out.println(Arrays.toString(obj.doubleArray()));
}
}
