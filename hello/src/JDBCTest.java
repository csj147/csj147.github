import java.lang.*;

public class JDBCTest {

    public static void main(String[] args){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
