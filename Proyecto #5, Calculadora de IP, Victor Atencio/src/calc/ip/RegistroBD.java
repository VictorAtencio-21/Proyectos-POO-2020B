package calc.ip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegistroBD{
	public static RegistroBD DB = new RegistroBD();
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pst;
	private ResultSet rs;
	private String driverDB = "org.postgresql.Driver";
	private String dbName = "Resgistro IP";
	private String urlDB = "jdbc:postgresql://localhost:5432/" + this.dbName;
	private String userDB = "postgres";
	private String passDB = "0806memo";
	String Resultado="";
	
	public  RegistroBD(){
		try {
			Class.forName(driverDB);
			this.conn = DriverManager.getConnection(urlDB, userDB, passDB);
			System.out.println("Conexion Establecida");
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("Error");
			e.printStackTrace(); 
		}
		return;		
	}
	public static RegistroBD getInstances() {
		return DB;
	}	

	public String dbStatement(String query) {
		try {
		this.stmt = this.conn.createStatement();
		this.rs = this.stmt.executeQuery(query);
		while(rs.next()) {
			Resultado+="Tipo IPv4: "+rs.getString("tipoip")+"\n"+
					"Clase IPv4: "+rs.getString("Clase")+"\n"+
					"APIPA IPv4: "+rs.getString("APIPA")+"\n"+
					"Direccion Reservada IPv4: "+rs.getString("Reservada")+"\n"+
					"Servicio IPv4: "+rs.getString("ServicioIP")+"\n"+
					"Direccion IPv4: "+rs.getString("DireccionIP")+"\n"+
					"Gateway IPv4: "+rs.getString("Gateway")+"\n"+
					"Broadcast IPv4: "+rs.getString("Broadcast")+"\n"+
					"Rango IPv4: "+rs.getString("Rango")+"\n"+
					"IP Recomendada para Host IPv4: "+rs.getString("ipv4")+"\n";
			}
				} catch (SQLException e) {
		e.printStackTrace();
				}finally {
					try {
						this.stmt.close();
						this.rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
		return Resultado;
		}
	
	public void dbAgregar(String[] obj) {
		try {
			this.pst = this.conn.prepareStatement(
					"insert into RegistroIP values (?,?,?,?,?,?,?,?,?,?,?)"
					);
			this.pst.setString(1, (String) obj[0]);
			this.pst.setString(2, (String) obj[1]);
			this.pst.setString(3, (String) obj[2]);
			this.pst.setString(4, (String) obj[3]);
			this.pst.setString(5, (String) obj[4]);
			this.pst.setString(6, (String) obj[5]);
			this.pst.setString(7, (String) obj[6]);
			this.pst.setString(8, (String) obj[7]);
			this.pst.setString(9, (String) obj[8]);
			this.pst.setString(10, (String) obj[9]);
			this.pst.setString(11, (String) obj[10]);
			this.pst.setString(12, (String) obj[11]);
			this.pst.executeUpdate();
			} catch (SQLException e) {
		e.printStackTrace();
				} finally {
						try {
							this.pst.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
				}
		}
	public void dbClose() {
		try {
		this.conn.close();
		System.out.println("Conexion cerrada");
			} catch (SQLException e) {
		e.printStackTrace();
			}
		}
}