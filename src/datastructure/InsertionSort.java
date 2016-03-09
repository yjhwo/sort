package datastructure;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {40,70,20,80,60,90,10,30,50};
		int temp = 0;
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<i; j++){
				if(arr[i]<arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
