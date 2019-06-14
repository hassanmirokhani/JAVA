class time
{
private int h,m,s;
public time()
{
h=0;
m=0;
s=0;
}
public time(int h1,int m1,int s1)
{
h=h1;
m=m1;
s=s1;
gettime(h,m,s);
}
public void gettime(int h1,int m1,int s1)
{
h=h1;
m=m1;
s=s1;
while(s>=60)
{
s-=60;
m++;
}
while(m>=60)
{
m-=60;
h++;
}
}
public void showtime()
{
System.out.println(h+":"+m+":"+s);
}
public time addtime(time t)
{
time temp=new time();
temp.h=h+t.h;
temp.m=m+t.m;
temp.s=s+t.s;
temp.gettime(temp.h,temp.m,temp.s);
return(temp);
}
}
