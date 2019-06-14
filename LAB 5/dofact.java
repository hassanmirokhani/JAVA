class dofact
{
public static void main(String arg[])
{
int a,b,c=1;
b=Integer.parseInt(arg[0]);
a=1;
do
{
c=c*a;
a++;
}while(a<=b); 
System.out.print("Factorial Of "+b+" Is "+c);
}
}

