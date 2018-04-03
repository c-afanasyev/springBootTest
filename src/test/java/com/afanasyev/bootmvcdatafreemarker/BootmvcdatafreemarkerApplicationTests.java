package com.afanasyev.bootmvcdatafreemarker;

import com.afanasyev.bootmvcdatafreemarker.entity.Customer;
import com.afanasyev.bootmvcdatafreemarker.repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.number.BigDecimalCloseTo.closeTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class BootmvcdatafreemarkerApplicationTests {
	@Autowired
	CustomerRepository repository;

	@Test
	public void contextLoads() { }

	@Test
	public void testGetCustomers() throws Exception {
		List<Customer> accounts = repository.findAll();
		assertThat(accounts.size(), is(96));
	}

	@Test
	public void testGetCustomer() throws Exception {
		Customer customer = repository.getOne(1);
		assertThat(customer.getId(), is(1));
	}

	@Test
	public void testGetNumberOfCustomers() throws Exception {
		assertThat(repository.count(), is(96L));
	}

	@Test
	public void testCreateCustomer() throws Exception {
		Customer customer = new Customer(97, "Ivan Taranov", "Novoselskogo 57", "Odessa", "OD", "65023");
		repository.save(customer);
		Integer id = customer.getId();
		assertThat(id, is(notNullValue()));

		Customer again = repository.getOne(id);
		assertThat(again.getId(), is(id));
		assertThat(again.getAddress(), is("Novoselskogo 57"));
	}

	@Test
	public void testUpdateCustomer() throws Exception {
		Customer customer = repository.getOne(1);
		String current = customer.getCity();
		String city = "Kiev";
		customer.setCity(city);
		repository.save(customer);

		Customer again = repository.getOne(1);
		assertThat(again.getCity(), is("Kiev"));
	}

	@Test
	public void testDeleteCustomer() throws Exception {
		repository.deleteAll();
		assertThat(repository.count(), is(0L));
	}

}
