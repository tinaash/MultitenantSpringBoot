package com.kgisl.tech.tenantconfig.datasource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.kgisl.tech.tenantconfig.datasource.DatabaseProperties.Database;

/**
 * @author tina
 * Class to create n number of datasources dynamically based on db values in app.properties 
 */
@Component
public class DynamicDataSourceProvider {

	@Autowired
	DatabaseProperties dbproperties;

	public Map getDataSourceFromProperties() {

		System.out.println("Getting dynamic list of tenant datasources");

		HashMap datasourceMap = new HashMap();
		List<Database> tenantDBList = dbproperties.getDatabase();
		
		for (Database tenantDB : tenantDBList) {

			DriverManagerDataSource dataSrc = new DriverManagerDataSource();

			dataSrc.setUrl(tenantDB.getUrl());
			dataSrc.setUsername(tenantDB.getUsername());
			dataSrc.setPassword(tenantDB.getPassword());
			dataSrc.setDriverClassName(tenantDB.getDriverclassname());

			datasourceMap.put(tenantDB.getTenantId(), dataSrc);
			// datasourceMap.put(tenantDB.getTenantId().toLowerCase(), dataSrc); // for case insensitive tenant search 
		}
		return datasourceMap;
	}

}