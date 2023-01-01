import java.util. *;
public class Main {
	public static int gcd(int m,int n)
	{
		
			while(m!=n)
		{
			if(m>n)
			m=m-n;
			else
			n=n-m;
						
			}return m;
		
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers\n");
		int m=sc.nextInt();
		int n=sc.nextInt();
	int res=	gcd(m,n);
	System.out.println("result is"+" "+res);
			}
}