class weather
{
public static void main(String arg[])
{
int a;
a=Integer.parseInt(arg[0]);
if(a<=10)
{
System.out.print("Cold Weather");
}
if(a>=11&&a<=30)
{
System.out.print("Pleasant Weather");
}
if(a>=31)
{
System.out.print("Hot Weather");
}
}
}

