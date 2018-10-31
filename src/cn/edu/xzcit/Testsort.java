/**
 * 
 */
package cn.edu.xzcit;

import java.util.Arrays;

/**
 * @author jiaeric
 *
 */
public class Testsort {

	/**
	 * @param args
	 */
	public static int[]  a  = {30,20,56,78,80,90,21};
//	int[]  b = new int[7];
	static int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1 = 0;
		//int temp;
	   	mySort(a); 
		mySort1(a);
		 System.out.println(a.length);
		// System.out.println(Arrays.toString(a));
		 System.out.println("************");
		 System.out.println(Arrays.toString(mySort1(a)));
	     System.out.println(num);
	     System.out.println(num1);
	     
	     int[]  array1 = {23,45,12,99,23,89,56};
	   // 
	     mySort(array1);
	     System.out.println("************");
	     System.out.println(Arrays.toString(array1));
	     
	   //  System.out.println("************");
	   //  Testsort.mySort1(array1);
		// System.out.println(Arrays.toString(mySort1(array1)));
	}
	
	// jiaericcccccccccccccccc
	 
	private static void mySort(int[] a) {
		
		for(int i = a.length-1; i>0 ;i--) {
			 boolean flag = false;
			 for(int j = 0 ; j < i ;j++) {
				 if(a[j] > a[j+1]) {
					int temp= a[j+1];
				     a[j+1] = a[j];
				     a[j]= temp;
				     flag = true;
				 }
			 }
			if(!flag) {
				break;
			} 
		 }
	}
	
	private static int[] mySort1(int[] b) {
		
		
		 for(int i = b.length-1; i>0 ;i--) {
			 
			 for(int j = 0 ; j < i ;j++) {
				 if(b[j] > b[j+1]) {
					int temp= b[j+1];
				     b[j+1] = b[j];
				     b[j]= temp;
				 }
			 }
			 
		 }
		
		return b;	
	}
	
	
	

}
