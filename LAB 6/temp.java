import java.util.*;
class temp
{
public static void main(String arg[])
{
int temp[]=new int[8],a;
temp[7]=0;
Scanner x=new Scanner(System.in);
for(a=0;a<7;a++)
{
System.out.print("Enter Temperature Of Day "+(a+1));
temp[a]=x.nextInt();
temp[7]=temp[7]+temp[a];
}
System.out.print("Average Temperature Of Week Is "+(float)temp[7]/7);
}
}
