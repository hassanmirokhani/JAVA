class std
{
private String d;
private int r,m;
public std()
{
d=null;
r=0;
m=0;
}
public std(String d1,int r1,int m1)
{
d=d1;
r=r1;
m=m1;
}
public void get(String d1,int r1,int m1)
{
d=d1;
r=r1;
m=m1;
}
public void show()
{
System.out.println("Data="+d+"\nRoll No="+r+"\nMarks="+m);
}
}
