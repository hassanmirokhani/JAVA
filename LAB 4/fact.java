class fact
{
public static void main(String arg[])
{
int a,b,c;
b=Integer.parseInt(arg[0]);
for(a=1,c=1;a<=b;a++)
{
c*=a;
}
System.out.print("The Factorial Of "+b+"="+c);
}
}
