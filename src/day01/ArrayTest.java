package day01;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int [] arr = new int [6];
		
		System.out.println(arr.toString());
		System.out.println(Arrays.toString(arr));
		
		
		//Arryays.fill(배열, 값) >> 해당 배열을 특정값으로 사용
		Arrays.fill(arr, 100);
		System.out.println(Arrays.toString(arr));
		
		
		//배열 재할당 
		arr = new int[] {5,2,4,3,1};
 		System.out.println(Arrays.toString(arr));
		
		// 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//copyOfRange(배열, 최소(포함안됨), 끝 (포함됨))
		int [] copyArr = Arrays.copyOfRange(arr, 1, 3);
		System.out.println(Arrays.toString(copyArr));
		
		
		//2차원 배열 출력 
		int [][] arr2d = {{1,2}, {3,4,},{5,6}};
		System.out.println(arr2d);
		System.out.println(Arrays.toString(arr2d[0]));
		for(int i =0; i<arr2d.length; i++) {
			System.out.println(Arrays.toString(arr2d[i]));
				
		}
		System.out.println(Arrays.deepToString(arr2d));
		
		
	}

}
