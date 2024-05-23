package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
        
/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class Conexao {

    /**
     *
     * @return
     * @throws SQLException
     */
    public Connection getConnection() throws SQLException{
    try{    
        Connection conexao = DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/ProjetoJava",
        "postgres", "fei");
        System.out.println("Conexao sucedida!");
        return conexao;
    }catch(SQLException e){
        System.out.println(e);
        return null;
    }
  } 
}
