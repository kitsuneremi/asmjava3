
package asm.service.impl;

import asm.model.Log;
import asm.repo.DBConnector;
import java.util.ArrayList;
import java.sql.*;


public class AccountServiceImpl {
    public ArrayList<Log> getdata() throws SQLException{
        ArrayList<Log> list = new ArrayList<>();
        String sql = "select * from users";
        try(
                Connection con = DBConnector.connection();
                PreparedStatement ps = con.prepareStatement(sql);
                
                ){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Log acc = new Log();
                acc.setUsername(rs.getString(1));
                acc.setPassword(rs.getString(2));
                acc.setRole(rs.getString(3));
                list.add(acc);
            }
        }
        return list;
    }
}
