package datastructure;

public class hanoi_tower {

	static void hanoi_tower(int n, char from, char tmp, char to){
		
		if(n==1) 
			System.out.println("원판 1을 "+from+"에서 "+to+"로 옮긴다.");
		else{
			hanoi_tower(n-1, from, to, tmp);
			System.out.println("원판 "+n+"을 "+from+"에서 "+to+"로 옮긴다.");
			hanoi_tower(n-1, tmp, from, to);
		}
		
	}
	
	public static void main(String[] args) {
		hanoi_tower(4,'A','B','C');
	}
	
}
