package com.kgisl.tech.tenantconfig.datasource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tina
 */
public class DataSourceMap {
   
	// comments added by: tina
	// No need to use this method any more
	// as it is not flexible and involves hardcoding
	
	public static Map<Object, Object> getTenantDataSources() {

		System.out.println("Retrieving map of tenant datasources..");

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/tenantdb1?serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		DriverManagerDataSource dataSource1 = new DriverManagerDataSource();
		dataSource1.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource1.setUrl("jdbc:mysql://localhost:3306/tenantdb2?serverTimezone=UTC");
		dataSource1.setUsername("root");
		dataSource1.setPassword("root");
		
		HashMap hashMap = new HashMap();
		hashMap.put("tenantId1", dataSource);
		hashMap.put("tenantId2", dataSource1);
		return hashMap;
	}

}