package com.mohamed.emission;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.mohamed.emission.repos.EmissionRepository;
import com.mohamed.emission.entities.Emission;

@SpringBootTest
class EmissionApplicationTests {

	@Autowired
	private  EmissionRepository EmissionRepository;
	@Test
	public void testCreateProduit() {
	Emission Emi = new Emission("Jeudi tout","Jeudi");
	EmissionRepository.save(Emi);
}
	@Test
	public void testFindProduit()
	{
	Emission e = EmissionRepository.findById(1L).get();

	System.out.println(e);
	}
	@Test
	public void testUpdateProduit()
	{
	Emission e = EmissionRepository.findById(2L).get();
	e.setJourEmission("Vendredi");
	EmissionRepository.save(e);
	}
	@Test
	public void testDeleteProduit()
	{
	EmissionRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousProduits()
	{
	List<Emission> emis = EmissionRepository.findAll();
	for (Emission e : emis)
	{
	System.out.println(e);
	}

	}
}
