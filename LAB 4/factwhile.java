class factwhile
{
public static void main(String arg[])
{
int a,b,c=1;
b=Integer.parseInt(arg[0]);
a=1;
while(a<=b)
{
c*=a;
a++;
}
System.out.print("The Factorial Of "+b+"="+c);
}
}
