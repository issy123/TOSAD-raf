/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.dialect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import service.TargetConnection;

/**
 *
 * @author ismail
 */
public class OracleDialect extends DatabaseDialect {

    private Connection connection;

    @Override
    public void onCredentialsReceived() {
        this.createConnection();
    }

    public void createConnection() {
        try {
            String url = "jdbc:oracle:thin:@//" + this.credentials.get("DATABASE_URL");
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            this.connection = DriverManager.getConnection(url, this.credentials.get("DATABASE_USERNAME"), this.credentials.get("DATABASE_PASSWORD"));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException | NullPointerException e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public String getType() {
        return "ORACLE";
    }

    @Override
    public List<String> getTables() {
        System.out.println("GETTING TABLES");
        System.out.println(credentials);
        List<String> tables = new ArrayList<String>();
        try {
            Statement stmt = null;
            String query = "SELECT table_name FROM user_tables";
            try {
                stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    tables.add(rs.getString("table_name"));
                }
            } catch (SQLException e) {
                System.out.println(e.getErrorCode());
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return tables;
    }

    @Override
    public List<Map> getColumns(String tablename) {
        List<Map> list = new ArrayList<Map>();
        try {

            Statement stmt = null;
            String query = "select * from " + tablename + " WHERE ROWNUM = 1";
            try {
                stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                ResultSetMetaData rsmd = rs.getMetaData();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    Map<String, String> tables = new HashMap<String, String>();
                    tables.put("column_name", rsmd.getColumnName(i));
                    tables.put("column_type", rsmd.getColumnTypeName(i));
                    tables.put("nullable", Integer.toString(rsmd.isNullable(i)));
                    list.add(tables);
                }
                return list;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return null;
    }

    @Override
    public void insertBusinessRule(String businessRule) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> getBusinessRules() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}