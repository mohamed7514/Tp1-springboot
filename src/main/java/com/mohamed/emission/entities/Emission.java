package com.mohamed.emission.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmission ; 
	private String nomEmission ; 
	private String JourEmission;
	public Emission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emission(String nomEmission, String jourEmission) {
		super();
		this.nomEmission = nomEmission;
		JourEmission = jourEmission;
	}
	public Long getIdEmission() {
		return idEmission;
	}
	public void setIdEmission(Long idEmission) {
		this.idEmission = idEmission;
	}
	public String getNomEmission() {
		return nomEmission;
	}
	public void setNomEmission(String nomEmission) {
		this.nomEmission = nomEmission;
	}
	public String getJourEmission() {
		return JourEmission;
	}
	public void setJourEmission(String jourEmission) {
		JourEmission = jourEmission;
	}
	@Override
	public String toString() {
		return "Emission [idEmission=" + idEmission + ", nomEmission=" + nomEmission + ", JourEmission=" + JourEmission
				+ "]";
	}
	
	
	

}
