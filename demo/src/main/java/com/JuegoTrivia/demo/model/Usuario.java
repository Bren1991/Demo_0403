package com.JuegoTrivia.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity 
@Table(name="usuarios")
public class Usuario {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idusuarios;
	
	


	@NotNull(message = "El campo usuario no puede estar vacio")
	@NotBlank
	@Size(min = 5,max = 12, message = "El usuario debe tener entre 5 y 12 caracteres")
	@Column(nullable = false, unique = true)
	private String nombre;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String pais;
	
	@Column(nullable = false)
	private Date fechaDeNacimiento;
	
	/*@Column(nullable = false)
	private Integer puntos;*/
	
	@Column(nullable = false)
	private String avatar;
	
	public Usuario() {
	}

	public Usuario(Integer idusuarios, String nombre, String password, String email, String pais,
			Date fechaDeNacimiento, Integer puntos, String avatar) {
		this.idusuarios = idusuarios;
		this.nombre = nombre;
		this.password = password;
		this.email = email;
		this.pais = pais;
		this.fechaDeNacimiento = fechaDeNacimiento;
		/**this.puntos = puntos;*/
		this.avatar = avatar;
	}

	public Integer getIdusuarios() {
		return idusuarios;
	}
	public void setIdusuarios(Integer idusuarios) {
		this.idusuarios = idusuarios;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	/*public Integer getPuntos() {
		return puntos;
	}
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}*/
	
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "Usuario [idusuarios=" + idusuarios + ", nombre=" + nombre + ", password=" + password + ", email="
				+ email + ", pais=" + pais + ", fechaDeNacimiento=" + fechaDeNacimiento + ", avatar=" + avatar + "]";
	}
	
	
}
