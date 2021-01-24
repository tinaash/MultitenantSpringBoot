package com.kgisl.tech.mainapp;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.kgisl.tech.tenantconfig.datasource.DataSourceMap;
import com.kgisl.tech.tenantconfig.datasource.DatabaseProperties;
import com.kgisl.tech.tenantconfig.datasource.DynamicDataSourceProvider;
import com.kgisl.tech.tenantconfig.routing.CustomRoutingDataSource;

@EnableTransactionManagement
@ComponentScan(basePackages = "com.kgisl.tech")
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MultitenantSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(MultitenantSpringApplication.class, args);

	/*	// Below lines of code for unit testing purpose
		ApplicationContext ctx = SpringApplication.run(MultitenantSpringApplication.class, args);
		DatabaseProperties dbproperties = (DatabaseProperties) ctx.getBean("databaseProperties");
		System.out.println("DBProperties from application.properties file: " + dbproperties.toString());
		
	   */
	}

	@Autowired
	DynamicDataSourceProvider dsprovider;

	@Bean
	public DataSource dataSource() {

		// Below two lines of code for unit testing purpose
		Map datasources = dsprovider.getDataSourceFromProperties();
		System.out.println("datasources: " + datasources.toString());

		CustomRoutingDataSource customDataSource = new CustomRoutingDataSource();
		// customDataSource.setTargetDataSources(DataSourceMap.getTenantDataSources());
		customDataSource.setTargetDataSources(dsprovider.getDataSourceFromProperties());
		return customDataSource;
	}

}