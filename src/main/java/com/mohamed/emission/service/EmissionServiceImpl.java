package com.mohamed.emission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohamed.emission.entities.Emission;
import com.mohamed.emission.repos.EmissionRepository;


@Service
public class EmissionServiceImpl  implements EmissionService {
	@Autowired
	EmissionRepository EmissionRepository;
	
	@Override
	public Emission saveEmission(Emission p) {
	return EmissionRepository.save(p);
	}
	@Override
    public Emission updateEmission(Emission p) {
    return EmissionRepository.save(p);
}
	
@Override
public void deleteEmission(Emission p) {
EmissionRepository.delete(p);
}
@Override
public void deleteEmissionById(Long id) {
EmissionRepository.deleteById(id);
}
@Override
public Emission getEmission(Long id) {
return EmissionRepository.findById(id).get();
}
@Override
public List<Emission> getAllEmissions() {
return EmissionRepository.findAll();
}




}

