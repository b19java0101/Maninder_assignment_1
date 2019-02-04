package maninder;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args)
	{
		int a,len=0,rem,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("enter any number");
int n=s.nextInt();
a=n;
while(a>0)
{
	len++;
a=a/10;	
}
a=n;
while(a>0) {
	int power=1;
	rem=a%10;
for(int i=1;i<=len;i++)
{
	power=power*rem;
}
sum=sum+power;
a=a/10;
}
if(sum==n)
{
System.out.println("armstrong");
}
else
{
	System.out.println("not armstrong");
	}

	}

}
