class stdl extends std
{
private String t;
private int b,s;
public stdl()
{
super();
t=null;
b=0;
s=0;
}
public stdl(String d1,int r1,int m1,String t1,int b1,int s1)
{
super(d1,r1,m1);
t=t1;
b=b1;
s=s1;
}
public void get(String d1,int r1,int m1,String t1,int b1,int s1)
{
super.get(d1,r1,m1);
t=t1;
b=b1;
s=s1;
}
public void show()
{
super.show();
System.out.println("Technology="+t+"\nBatch="+b+"\nSemester="+s);
}
}