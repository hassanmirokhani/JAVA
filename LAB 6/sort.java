import java.util.*;
class sort
{
public static void main(String arg[])
{
int m[]=new int[5],a;
int b,c,d;
c=m.length-1;
Scanner x=new Scanner(System.in);
for(a=0;a<=c;a++)
{
System.out.print("Enter Number "+(a+1));
m[a]=x.nextInt();
}
for(d=0;d<c;d++)
{
for(b=d+1;b<=c;b++)
{
if(m[d]<m[b])
{
a=m[b];
m[b]=m[d];
m[d]=a;
}
}
}
System.out.println();
for(b=0;b<=c;b++)
{
System.out.println(m[b]);
}
}
}
