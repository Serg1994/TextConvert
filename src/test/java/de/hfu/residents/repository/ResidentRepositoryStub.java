package de.hfu.residents.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.hfu.residents.domain.Resident;

public class ResidentRepositoryStub implements ResidentRepository {
	private Resident res1 = new Resident("Helga", "Etwas", "Street1", "City1", new Date(99, 5, 7));
	private Resident res2 = new Resident("Hugo", "Schmied", "Street2", "City2", new Date(99, 5, 7));
	private Resident res3 = new Resident("Mo", "Etwas", "Street1", "City1", new Date(99, 5, 7));
	private Resident res4 = new Resident("Markus", "Kaum", "Street3", "City3", new Date(99, 5, 7));
	private List<Resident> Residents = new ArrayList<Resident>();
	
	@Override
	public List<Resident> getResidents() {
		Residents.add(res1);
		Residents.add(res2);
		Residents.add(res3);
		Residents.add(res4);
		return Residents;
	}
}
