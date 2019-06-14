class ballot1
{
public static void main(String arg[])
{
double a,b;
b=Double.parseDouble(arg[0]);
a=Math.random();
a=a*b+1;
System.out.println("1st Prize="+Math.floor(a));
a=Math.random();
a=a*b+1;
System.out.println("2nd Prize="+Math.floor(a));
a=Math.random();
a=a*b+1;
System.out.print("3rd Prize="+Math.floor(a));
}
}


