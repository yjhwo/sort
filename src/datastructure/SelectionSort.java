package datastructure;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {40,70,20,80,60,90,10,30,50};
		int temp = 0, low = 0;
		
		for(int i=0; i<arr.length-1; i++){
			low = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[low]>arr[j]){
					low = j;
				}
			}
			// 최솟값과 교환
			temp = arr[i];
			arr[i] = arr[low];
			arr[low] = temp;
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}
}
