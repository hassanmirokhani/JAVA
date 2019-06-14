import java.sql.*;
class rec
{
public static void main(String arg[])
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cn=DriverManager.getConnection("jdbc:odbc:hassandsn");
Statement st=cn.createStatement();
st.executeUpdate("insert into friend values('"+arg[0]+"',"+arg[1]+")");
st.close();
cn.close();
}catch(Exception e){}
}
}


