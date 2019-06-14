class dopattern
{
public static void main(String arg[])
{
int a,b;
a=5;
do
{
b=1;
do
{
System.out.print("*");
b++;
}while(b<=a);
System.out.print("\n");
a--;
}while(a>=1);
}
}


