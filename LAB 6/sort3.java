import java.util.*;
class sort3
{
public static void main(String arg[])
{
String n[]=new String[5],n1;
int a,b,c;
Scanner x=new Scanner(System.in);
c=n.length-1;
for(a=0;a<=c;a++)
{
System.out.print("Enter Name "+(a+1));
n[a]=x.nextLine();
}
for(a=0;a<c;a++)
{
for(b=a+1;b<=c;b++)
{
if(n[a].compareTo(n[b])<0)
{
n1=n[a];
n[a]=n[b];
n[b]=n1;
}
}
}
for(a=0;a<=c;a++)
{
System.out.println(n[a]);
}
}
}
