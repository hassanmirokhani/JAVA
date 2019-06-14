import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class winrec extends Frame implements ActionListener
{
Label l1,l2;
Button b1,b2;
TextField t1,t2;
public winrec(String t)
{
super(t);
l1=new Label("Rollno");
l2=new Label("Marks");
b1=new Button("Save");
b2=new Button("Exit");
t1=new TextField(20);
t2=new TextField(20);
b1.addActionListener(this);
b2.addActionListener(this);
setLayout(new FlowLayout());
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
add(b2);
setSize(200,300);
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
st.executeUpdate("insert into friend values('"+t1.getText()+"',"+t2.getText()+")");
st.close();
cn.close();
}catch(Exception e){}
show();
}
if(f.getSource()==b2)
{
System.exit(0);
}
}
}
