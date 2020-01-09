package de.hfu.residents.service;

import java.util.Date;

import org.junit.Test;

import de.hfu.residents.domain.Resident;
import de.hfu.residents.repository.ResidentRepository;

public class BaseResidentServiceTest {
	@Test
	public void testgetUniqueResident() {
		ResidentRepository res = null;
		de.hfu.residents.service.BaseResidentService.setResidentRepository(res);
	}
}
