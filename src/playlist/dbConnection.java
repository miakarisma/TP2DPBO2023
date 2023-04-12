/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author ACER
 */
public class dbConnection {
    private Statement stmt = null;
    public Connection conn = null;
    
    public dbConnection() {
        String ConAddress = "jdbc:mysql://localhost/db_tp2_dpbo";
        String user = "root";
        String pass = "";
        connect(ConAddress, user, pass);
    }
    
    private void connect(String ConAddress, String user, String pass) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = DriverManager.getConnection(ConAddress, user, pass);
            } catch (SQLException ex) {
                Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt = conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(ClassNotFoundException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet selectQuery(String sql) {
        try {
            stmt.executeQuery(sql);
            return stmt.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int updateQuery(String sql) {
        try {
            return stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public Statement getStmt() {
        return stmt;
    }
}
