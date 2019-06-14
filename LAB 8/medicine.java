class medicine
{
private String n;
private int q;
private float p;
public medicine()
{
n=null;
q=0;
p=0f;
}
public medicine(String n1,int q1,float p1)
{
n=n1;
q=q1;
p=p1;
}
public void get(String n1,int q1,float p1)
{
n=n1;
q=q1;
p=p1;
}
public void show()
{
System.out.println("Medicine Name="+n+"\nQuantity="+q+"\nPrice="+p);
}
}
