package com.exam.zip.code.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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


}
