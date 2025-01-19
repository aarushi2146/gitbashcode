import java.util.*;

public class EvenNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
                System.out.println("Even numbers are :");
		for(int i=1;i<=n;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		System.out.println("Odd numbers are :");
		 for(int i=1;i<=n;i++){
                        if(i%2!=0){
                                System.out.println(i);
                        }
                }
	}
}

