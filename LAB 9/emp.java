abstract class emp
{
private int c;
private String n;
public emp()
{
c=0;
n=null;
}
public emp(int c1,String n1)
{
c=c1;
n=n1;
}
public void get(int c1,String n1)
{
c=c1;
n=n1;
}
public void show()
{
System.out.println("Code="+c+"\nName="+n);
}
}
