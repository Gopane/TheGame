package Manage;

import Utils.JDBCUtils;
import bin.User;

import java.sql.*;

public class UserQu_imp implements UserQu{
    @Override
    public boolean ischar(String name) {
        Connection conn = JDBCUtils.getConnection();

        PreparedStatement ps = null;

        ResultSet rs =null;
        String str = null;
        try {
            ps = conn.prepareStatement("select name from chara where name = ?");
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                str = rs.getString("name");
                //System.out.println(str);
            }
            //System.out.println(str);
            if(str==null){
                ps= conn.prepareStatement("insert into chara(name) values (?)");
                ps.setString(1,name);
                ps.executeUpdate();
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,ps,rs);

        }
        return false;
    }
}
