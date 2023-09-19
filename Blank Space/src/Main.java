import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int pp = sc.nextInt();
		for(int i=0; i<pp;i++) {
			int m=0,cs=0,n= sc.nextInt();
			for(int j=0; j<n;j++) {
				int f=sc.nextInt();
				if(f==0) {
					m++;
				}else { 
					m=0;
				}
				if(cs<m) cs=m;
	
			}
			System.out.println(cs);	
		}	
	}
}