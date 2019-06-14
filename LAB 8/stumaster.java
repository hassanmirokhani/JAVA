class stumaster
{
stupersonal x=new stupersonal();;
stufee y=new stufee();
stumarks z=new stumarks();
public void get(String n1,String fn1,String ad1,int sf1,int mf1,int yf1,int r1,float p1)
{
x.get(n1,fn1,ad1);
y.get(sf1,mf1,yf1);
z.get(r1,p1);
}
public void show()
{
x.show();
y.show();
z.show();
}
}
