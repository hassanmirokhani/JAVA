import java.util.*;
class sort2
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int r[]=new int[5],m[]=new int[5],s[]=new int[5],d,a,b,c;
c=r.length-1;
for(a=0;a<=c;a++)
{
System.out.print("Enter Roll No");
r[a]=sc.nextInt();
System.out.print("Enter Marks");
m[a]=sc.nextInt();
System.out.print("Enter Semester");
s[a]=sc.nextInt();
}
for(a=0;a<c;a++)
{
for(b=a+1;b<=c;b++)
{
if(m[a]<m[b])
{
d=m[a];
m[a]=m[b];
m[b]=d;
d=r[a];
r[a]=r[b];
r[b]=d;
d=s[a];
s[a]=s[b];
s[b]=d;
}
}
}
System.out.println();
System.out.print("Roll No\tMarks\tSemester\n");
for(b=0;b<=c;b++)
{
System.out.println(r[b]+"\t"+m[b]+"\t"+s[b]);
}
}
}