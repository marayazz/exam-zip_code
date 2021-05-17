package com.exam.zip.code.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ZIPCODE")
public class ZipCodeBO implements Serializable{
	
	private static final long serialVersionUID = 3211973115289237021L;

	@Id
	@Column(name = "d_codigo")
	private String dCodigo;
	
	@Column(name = "d_asenta")
	private String dAsenta;
	
	@Column(name = "d_tipo_asenta")
	private String dTipoAsenta;
	
	@Column(name = "D_mnpio")
	private String dmnpio;
	
	@Column(name = "d_estado")
	private String dEstado;
	
	@Column(name = "d_ciudad")
	private String dCiudad;
	
	@Column(name = "d_CP")
	private String dCp;
	
	@Column(name = "c_estado")
	private String cEstado;
	
	@Column(name = "c_oficina")
	private String cOficina;
	
	@Column(name = "c_CP")
	private String cCP;
	
	@Column(name = "c_tipo_asenta")
	private String cTipoAsenta;
	
	@Column(name = "c_mnpio")
	private String cMnpio;
	
	@Column(name = "id_asenta_cpcons")
	private String idAsentaCpcons;
	
	@Column(name = "d_zona")
	private String dZona;

	public ZipCodeBO() {}

	
	public ZipCodeBO(String dCodigo, String dAsenta, String dTipoAsenta, String dmnpio, String dEstado, String dCiudad,
			String dCp, String cEstado, String cOficina, String cCP, String cTipoAsenta, String cMnpio,
			String idAsentaCpcons, String dZona) {
		super();
		this.dCodigo = dCodigo;
		this.dAsenta = dAsenta;
		this.dTipoAsenta = dTipoAsenta;
		this.dmnpio = dmnpio;
		this.dEstado = dEstado;
		this.dCiudad = dCiudad;
		this.dCp = dCp;
		this.cEstado = cEstado;
		this.cOficina = cOficina;
		this.cCP = cCP;
		this.cTipoAsenta = cTipoAsenta;
		this.cMnpio = cMnpio;
		this.idAsentaCpcons = idAsentaCpcons;
		this.dZona = dZona;
	}


	public String getdCodigo() {
		return dCodigo;
	}


	public void setdCodigo(String dCodigo) {
		this.dCodigo = dCodigo;
	}


	public String getdAsenta() {
		return dAsenta;
	}


	public void setdAsenta(String dAsenta) {
		this.dAsenta = dAsenta;
	}


	public String getdTipoAsenta() {
		return dTipoAsenta;
	}


	public void setdTipoAsenta(String dTipoAsenta) {
		this.dTipoAsenta = dTipoAsenta;
	}


	public String getDmnpio() {
		return dmnpio;
	}


	public void setDmnpio(String dmnpio) {
		this.dmnpio = dmnpio;
	}


	public String getdEstado() {
		return dEstado;
	}


	public void setdEstado(String dEstado) {
		this.dEstado = dEstado;
	}


	public String getdCiudad() {
		return dCiudad;
	}


	public void setdCiudad(String dCiudad) {
		this.dCiudad = dCiudad;
	}


	public String getdCp() {
		return dCp;
	}


	public void setdCp(String dCp) {
		this.dCp = dCp;
	}


	public String getcEstado() {
		return cEstado;
	}


	public void setcEstado(String cEstado) {
		this.cEstado = cEstado;
	}


	public String getcOficina() {
		return cOficina;
	}


	public void setcOficina(String cOficina) {
		this.cOficina = cOficina;
	}


	public String getcCP() {
		return cCP;
	}


	public void setcCP(String cCP) {
		this.cCP = cCP;
	}


	public String getcTipoAsenta() {
		return cTipoAsenta;
	}


	public void setcTipoAsenta(String cTipoAsenta) {
		this.cTipoAsenta = cTipoAsenta;
	}


	public String getcMnpio() {
		return cMnpio;
	}


	public void setcMnpio(String cMnpio) {
		this.cMnpio = cMnpio;
	}


	public String getIdAsentaCpcons() {
		return idAsentaCpcons;
	}


	public void setIdAsentaCpcons(String idAsentaCpcons) {
		this.idAsentaCpcons = idAsentaCpcons;
	}


	public String getdZona() {
		return dZona;
	}


	public void setdZona(String dZona) {
		this.dZona = dZona;
	}


}
