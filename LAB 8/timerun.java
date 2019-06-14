class timerun
{
public static void main(String arg[])
{
time x=new time();
time y=new time(20,23,65);
time z=new time();
x.gettime(1,60,90);
z=x.addtime(y);
x.showtime();
y.showtime();
z.showtime();
}
}
