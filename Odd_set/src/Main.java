import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		boolean ant=true,cont=false;
		for(int i=0;i<t;i++) {
			//cada caso
			int n=sc.nextInt();
			int[] arr = new int[2*n];
			for(int j=0;j<(2*n);j++) arr[j]=sc.nextInt();
			ant=true;
			for(int j=0;j<(2*n);j+=2) {
				cont=false;
				int a=arr[j];
				int b=arr[j+1];
				if((a+b)%2==1 && ant) {
					cont=true;
				}else {
					cont=false;
					ant=false;
				}
			}
			System.out.println((cont)?"Yes":"NO");	
		}
	}
}
