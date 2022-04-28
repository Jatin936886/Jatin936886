package Project1_1;
import java.util.*;
public class Even {
	public static void main(String args[]) {
		int n=0,i=0;
		Scanner number=new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		n=number.nextInt();
		for(i=1;i<n;i++) {
			if(i%2==0)
				System.out.println(i+"");
			
		}
		System.out.println();
	}

}
