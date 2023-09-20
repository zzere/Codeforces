import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean ar1=false,ar2=false, cont=false;
		int num1=0,num2=0;
		int la1=sc.nextInt();
		int[] array1 = new int[la1];
		for(int i=0;i<la1;i++) array1[i]=sc.nextInt();
		int la2=sc.nextInt();
		int[] array2 = new int[la2];
		for(int i=0; i<la2; i++) array2[i]=sc.nextInt();
		
		for(int i=0; i<la1;i++) {
			for(int j=0; j<la2; j++) {
				int temp = array1[i]+array2[j];
				//compara la suma con cada elemento de los arrays
				for(int k=0;k<la1;k++) {
					if(temp==array1[k]) { 
						ar1=true;
						break;
					}else num1=array1[k];
					for(int g=0;g<la2;g++) {
						if(temp==array2[g]) {
							break;
						}else num2=array2[g];	
					}
				}
			}
		}
		System.out.println(num1+" "+num2);
	}
}
