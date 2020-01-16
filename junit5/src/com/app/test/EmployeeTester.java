package com.app.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.pojos.Employee;

public class EmployeeTester {

	private Employee e;

	@Before
	public void setUp() throws Exception {
		e = new Employee("ID00101", null, 5200, null, "manager", "worker", LocalDate.parse("2018-12-12"));
	}

	@After
	public void tearDown() throws Exception {
		e = null;
	}

	@Test
	public final void testGetId() {
		assertEquals(true, e.getId().matches("^ID[0-9][0-9][0-9][0-9][0-9]$"));
	}

	@Test
	public final void testGetName() {
		assertEquals(false, e.getName() != null);
	}

	@Test
	public final void testGetNetSal() {
		double sal = e.getNetSal();

		assertEquals(true, sal >= 0);
	}

	@Test
	public final void testGetDept() {

		assertEquals(false, e.getDept() != null);
	}

}
