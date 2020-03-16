package Utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;
    //静态语句
    static {
//获取对象
        //类加载器
        //加载资源文件放到输入流中

        InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties");

        //创建Properties的对象
        Properties p = new Properties();

        //加载流文件
        try {
            p.load(is);
            driver = p.getProperty("driver");
            url = p.getProperty("url");
            user = p.getProperty("username");
            password = p.getProperty("password");
            //加载驱动
            Class.forName(driver);
            System.out.println("加载成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获得连接对象的方法
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //释放资源
    public static void close(Connection conn, Statement statement, ResultSet resultSet){
        try {
            if(resultSet!=null){
                resultSet.close();
                resultSet = null;
            }
            if(statement!=null){
                statement.close();
                statement = null;
            }
            if(conn!=null){
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
