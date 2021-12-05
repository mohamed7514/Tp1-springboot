package com.mohamed.emission.service;

import java.util.List;

import com.mohamed.emission.entities.Emission;

public interface EmissionService {

	Emission saveEmission(Emission e);
	Emission updateEmission(Emission e);
	void deleteEmission(Emission e);
	void deleteEmissionById(Long id);
	Emission getEmission(Long id);
	List<Emission> getAllEmissions();
}
