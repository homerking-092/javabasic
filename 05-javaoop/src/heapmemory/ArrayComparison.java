package heapmemory;

import java.util.Arrays;

public class ArrayComparison {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;
		int[] arr3 = {1, 2, 3, 4, 5};
		
		arr1[0] = 10;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		System.out.println("-------------------");
		
		//주소값이 아닌 전체 배열 데이터를 보고싶다면
		//Arrays.toString(배열); 문법을 사용한다
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("-------------");
		
		System.out.print("[");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
		}
		System.out.print("]");
	}
}
