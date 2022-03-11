/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mariu
 */
public class conexionSQL {
  /*  Connection conectar =null;
    
    public Connection conexion(){
    
        try {
            Class.forName("con.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root","1234");
            JOptionPane.showMessageDialog( null ,"Connexion Exitosa");
        } catch (Exception e) {
                        JOptionPane.showMessageDialog( null ,"Error de connexion" + e.getMessage());

        }*/
       
        public static  String HOSTDB = "localhost";	
	public static final String NOMBREDB = "biblioteca";
	public static final String USUARIODB = "root";
	public static final String CLAVEDB = "1234";
	private static final String OPCIONESHORA = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	// las opciones de hora también las puedes poner en mysql 
	// SET GLOBAL time_zone = '+1:00';
	public static final String PUERTOMYSQL = "3306";
	public static final String URLMYSQL = "jdbc:mysql://"+ HOSTDB +":"+PUERTOMYSQL + "/" + NOMBREDB + OPCIONESHORA;

	//----------------------------------------------------------....
	public static Connection conectarConBaseDeDatos() {
		try {
			Connection conexion = DriverManager.getConnection(URLMYSQL, USUARIODB, CLAVEDB);
			return conexion;
		} catch (SQLException e) {
			 JOptionPane.showMessageDialog( null ,"Error de connexion" + e.getMessage());
			return null;
		}		
	}	
    
      //  return conectar;  }  
    
    
    
   //   
    
    
}
