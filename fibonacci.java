package Program;
import java.util.*;
public class i {
	public static void main(String[] args) {
			long first=1;
			long second=1;
			long third=0;
			int i;
			long temp=0;
			long get=0;
			long ans=0;
			Scanner in=new Scanner(System.in);
			System.out.printf("\nEnter a Value :");
			get=in.nextInt();
			
			while(true)
			{
				
			third=second+first;
			
			if(third==get)
			{
				System.out.printf("\nFibnocci Number"); break;
			}
			else
			{
				System.out.printf("\nNot Fibnocci Number");
				if(true)
					break;
			}
			
			temp=third;
			second=first;
			first=temp;
			
			
			if(ans==10)break;
			
									
		}
			
	}
}


