package week1.day2.assignments;

import java.util.Arrays;

class MissingElementInArray {
	
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,7,6};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(i!=arr[i])
			{
				System.out.println(i);
				break;
			}
		}
	}
}
		

