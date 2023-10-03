import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//NUMERO DE CASOS
		int nc= sc.nextInt();
		for(int i=0;i<nc;i++) {
			//CONTADOR
			int cont=0;
			//ESTA ORDENADO
			boolean eo=true;
			
			//Tamaño array
			int arr[]=new int[sc.nextInt()];
			//LLENAR ARRAY
			for(int j=0;j<arr.length;j++) {
				arr[j]=sc.nextInt();
			}
			
			//OPERAR ARRAU
			do {
			//SABER SI ESTA ORDENADO
			for(int m=0;m<arr.length;m++) { 
				if(m!=0 && arr[m-1]>arr[m] ) { 
					eo=false;
					break;
				}else eo=true;
			}
			
			if(!eo) {
				for(int m=0;m<arr.length;m++) if(arr[m]!=0) arr[m]-=1;
				//for(int e:arr) System.out.print(e+" ");
				cont++;
			}
			
			//System.out.println("");
			}while(!eo);
				
			
			System.out.println(cont);
			
		}

	}

}

