class abc
{
private int a;
private static int count=0;
public abc()
{
a=0;
count++;
}
public abc(int a1)
{
a=a1;
count++;
}
public void get(int a1)
{
a=a1;
count++;
}
public void show()
{
System.out.println("Value="+a);
}
public static void showcount()
{
System.out.println("Object Count="+count);
}
}
