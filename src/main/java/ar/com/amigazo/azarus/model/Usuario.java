package ar.com.amigazo.azarus.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
@Access(AccessType.FIELD)
public class Usuario extends ParentEntity{

	private static final long serialVersionUID = 1L;

	@Column (nullable=false, length=255)
	private String nombreUsuario;

	@Column (nullable=false, length=255)
	private String apellido;
	
	@Column (nullable=false, length=255)
	private String nombre;
	
	@Column (nullable=false, length=255)
	private String  ip;
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	
	
}
