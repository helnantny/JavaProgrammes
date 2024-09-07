import java.util.scanner;
piblic class factorial
{
public static void main(String args[])
{
scanner sc=new Scanner(System.in);
int f=1;
System.out.println("enter the number");
int n=sc.nestInt();
for(int i=0;i<=n;i++)
{
 f=f*i;
 }
 System.out.println("factorial="+f);
 }}
