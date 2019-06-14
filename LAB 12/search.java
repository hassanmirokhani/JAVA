import java.sql.*;
class search
{
public static void main(String arg[])
{
try
{
Class.forName("sun.jdbc.odbc.JbdcOdbcDriver");
Connection cn=DriverManager.getConnection("jdbc:odbc:hassandsn");
Statement st=cn.createStatement();
ResultSet r=st.executeQuery("select * from friend where Rollno='"+arg[0]+"'");
while(r.next())
{
System.out.println(r.getString("Rollno")+" "+r.getInt("Marks"));
}
st.close();
cn.close();
}catch(Exception e){}
}
}


