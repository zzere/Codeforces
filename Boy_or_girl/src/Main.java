import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name= sc.next();		
		char[] mm = name.toCharArray();		
		int con=0;
		for(int i=0;i<mm.length;i++) {
			for(int j=0;j<mm.length;j++)
				if(i!=j && mm[i]==mm[j]) mm[j]='.' ;
		}
		for(char m: mm) {
			if(m!='.') con++;
		}
		System.out.println((con%2==0)?"CHAT WITH HER!":"IGNORE HIM!");
	}
}
