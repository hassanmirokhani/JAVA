class bookhassan069
{
private int c;
private float p;
private String t;
public void get(int c1,float p1, String t1)
{
c=c1;
p=p1;
t=t1;
}
public void get(int c1,String t1,float p1)
{
c=c1;
p=p1;
t=t1;
}
public void get(float p1,int c1,String t1)
{
c=c1;
p=p1;
t=t1;
}
public void get(float p1,String t1,int c1)
{
c=c1;
p=p1;
t=t1;
}
public void get(String t1,int c1,float p1)
{
c=c1;
p=p1;
t=t1;
}
public void get(String t1,float p1,int c1)
{
c=c1;
p=p1;
t=t1;
}
public void show()
{
System.out.println("Book Code="+c+"\nTitle"+t+"\nPrice="+p);
}
}
