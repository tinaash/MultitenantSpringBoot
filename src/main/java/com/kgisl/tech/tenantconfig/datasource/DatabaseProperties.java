package com.kgisl.tech.tenantconfig.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tina
 * Class to read each tenant's DB properties from application.properties
 */

@Component
@ConfigurationProperties("tenant") // prefix tenant, find tenant.* values
public class DatabaseProperties {

	// private int numberOfTenants;
	private List<Database> database = new ArrayList<>();

	public static class Database {

		private String tenantId;
		private String url;
		private String username;
		private String password;
		private String driverclassname;

		// Getters and Setters

		public String getTenantId() {
			return tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getDriverclassname() {
			return driverclassname;
		}

		public void setDriverclassname(String driverclassname) {
			this.driverclassname = driverclassname;
		}

		@Override
		public String toString() {
			return "\n" + "Database [tenantId=" + tenantId + ", url=" + url + ", username=" + username + ", password="
					+ password + ", driverclassname=" + driverclassname + "]";
		}

	}

	public List<Database> getDatabase() {
		return database;
	}

	public void setDatabase(List<Database> database) {
		this.database = database;
	}

	@Override
	public String toString() {
		return "DatabaseProperties [Tenant DB List =" + database + "]";
	}

}