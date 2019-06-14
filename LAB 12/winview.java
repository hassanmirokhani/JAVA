import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class winview extends Frame implements ActionListener
{
Label l1,l2;
Button b1,b2;
TextField t[];
int a;
public winview(String t1)
{
super(t1);
l1=new Label("Roll No");
l2=new Label("Marks");
b1=new Button("View");
b2=new Button("Exit");
t=new TextField[100];
b1.addActionListener(this);
b2.addActionListener(this);
setLayout(new FlowLayout());
add(b1);
add(b2);
add(l1);
add(l2);
setSize(200,800);
setVisible(true);
show();
}
public void actionPerformed(ActionEvent f)
{
if(f.getSource()==b1)
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cn=DriverManager.getConnection("jdbc:odbc:hassandsn");
Statement st=cn.createStatement();
ResultSet r=st.executeQuery("select * from friend");
a=1;
while(r.next())
{
t[a]=new TextField(20);
add(t[a]);
t[a].setText(r.getString("Rollno"));
a++;
t[a]=new TextField(20);
add(t[a]);
t[a].setText(String.valueOf(r.getInt("Marks")));
a++;
}
show();
st.close();
cn.close();
}catch(Exception e){}
}
if(f.getSource()==b2)
{
System.exit(0);
}
}
}
