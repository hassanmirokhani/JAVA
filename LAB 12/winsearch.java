import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class winsearch extends Frame implements ActionListener
{
Label l1,l2;
Button b1,b2;
TextField t[],t2;
int a;
public winsearch(String t1)
{
super(t1);
l1=new Label("Enter Roll No");
l2=new Label("Marks");
b1=new Button("Search");
b2=new Button("Exit");
t2=new TextField(20);
t=new TextField[20];
b1.addActionListener(this);
b2.addActionListener(this);
setLayout(new FlowLayout());
add(l1);
add(t2);
add(b1);
add(b2);
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
ResultSet r=st.executeQuery("select * from friend where Rollno='"+t2.getText()+'"");
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
