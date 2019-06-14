class ballot2
{
public static void main(String arg[])
{
double a,b,c;
b=Double.parseDouble(arg[0]);
c=Double.parseDouble(arg[1]);
a=Math.random();
a=a*(b-c+1)+c;
System.out.println("1st Prize="+Math.floor(a));
a=Math.random();
a=a*(b-c+1)+c;
System.out.println("2nd Prize="+Math.floor(a));
a=Math.random();
a=a*(b-c+1)+c;
System.out.print("3rd Prize="+Math.floor(a));
}
}


