import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean cont=false;
		int la1=sc.nextInt();
		int[] array1 = new int[la1];
		for(int i=0;i<la1;i++) array1[i]=sc.nextInt();
		int la2=sc.nextInt();
		int[] array2 = new int[la2];
		for(int i=0; i<la2; i++) array2[i]=sc.nextInt();	
		for(int i=0; i<la1;i++) {
			for(int j=0; j<la2; j++) {
				boolean ar1=true,ar2=true;
				int temp = array1[i]+array2[j];			
				for(int k=0;k<la1;k++) {
					if(temp==array1[k]) {
						ar1=false;
						break;
					}
				}
				for(int k=0;k<la2;k++) {
					if(temp==array2[k]) {
						ar2=false;
						break;
					}
				}
				if(ar1 && ar2) {
					System.out.println(array1[i]+" "+array2[j]);
					cont=true;
					break;
				}
			}
			if(cont) break;
		}
	}
}
