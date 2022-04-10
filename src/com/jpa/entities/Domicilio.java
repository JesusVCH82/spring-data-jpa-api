package com.jpa.entities;

public class Domicilio {
	
	private Long id;
	private String calle;
	private String numero;
	private String colonia;
	private String estado;
	private String ciudad;
	private String cp;
	
	private Long id_Domicilio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public Long getId_Domicilio() {
		return id_Domicilio;
	}

	public void setId_Domicilio(Long id_Domicilio) {
		this.id_Domicilio = id_Domicilio;
	}
	
	

}
