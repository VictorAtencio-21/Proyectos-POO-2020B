package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDConexion {
	public static BDConexion DB = new BDConexion();
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pst;
	private ResultSet rs;
	private String driverDB = "org.postgresql.Driver";
	private String dbName = "Register";
	private String urlDB = "jdbc:postgresql://localhost:5432/" + this.dbName;
	private String userDB = "postgres";
	private String passDB = "0806memo";
	String Resultado="";
	
	public  BDConexion(){
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
	
	public static BDConexion getInstances() {
		return DB;
	}	

	public String dbStatement(String query) {
		try {
		this.stmt = this.conn.createStatement();
		this.rs = this.stmt.executeQuery(query);
		while(rs.next()) {
			Resultado+="Nombre: "+rs.getString("nombre")+"Raza: "+rs.getString("raza")+"Edad: "+rs.getString("edad")+"Peso: "+rs.getString("peso")+"Color: "+rs.getString("PlumajePelajeColor")+"\n";
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
	
	public void dbAgregar(Object[] obj) {
		try {
			this.pst = this.conn.prepareStatement("insert into BDZooPooAPP values (?,?,?,?,?,?)");
			this.pst.setInt(1, (int) obj[0]);
			this.pst.setString(2, (String) obj[1]);
			this.pst.setString(3, (String) obj[2]);
			this.pst.setInt(4, (int) obj[3]);
			this.pst.setFloat(5, (Float) obj[4]);
			this.pst.setString(6, (String) obj[5]);
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