import java.util.*;
class techHassan069
{
public static void main(String arg[])
{
int a,b,e,r,c;
String nt[][]=new String[5][2],d;
String n[]={"Name","Technology"};
r=nt.length-1;
c=nt[0].length-1;
Scanner sc=new Scanner(System.in);
for(a=0;a<=r;a++)
{
for(b=0;b<=c;b++)
{
System.out.print("Enter "+n[b]);
nt[a][b]=sc.nextLine();
}
}
for(a=0;a<r;a++)
{
for(b=a+1;b<=r;b++)
{
if(nt[a][1].compareTo(nt[b][1])<0)
{
for(e=0;e<=c;e++)
{
d=nt[a][e];
nt[a][e]=nt[b][e];
nt[b][e]=d;
}
}
}
}
System.out.println();
for(a=0;a<=c;a++)
{
System.out.print(" "+n[a]+"\t");
}
System.out.println();
for(a=0;a<=r;a++)
{
for(b=0;b<=c;b++)
{
System.out.print(nt[a][b]+"\t");
}
System.out.println();
}
}
}