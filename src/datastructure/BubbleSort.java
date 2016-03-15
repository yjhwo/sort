package datastructure;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {40,70,20,80,60,90,10,30,50};
		// length = 9 최대 8번비교는 해야..
		int tmp = 0;
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
//		Arrays.sort(arr);	// sort쓰면 한 번에 가능
//		Arrays.sort(arr, Collections.reverseOrder());
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}

}
