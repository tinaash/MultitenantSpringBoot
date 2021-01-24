package com.kgisl.tech.tenantconfig.routing;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class CustomRoutingDataSource extends AbstractRoutingDataSource {

	private static final String DEFAULT_TENANT_ID = "tenantId1";

	@Override
	protected Object determineCurrentLookupKey() {

		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

		if (attr != null) {
			System.out.println("Incoming Request is: " + attr.getRequest().getRequestURI().toString());
			String tenantId = attr.getRequest().getParameter("tenantId"); // find tenantId from request param
			// String tenantId = attr.getRequest().getParameter("tenantId").toLowerCase(); // for case insensitive tenant searc
			return tenantId;
		} else {
			return DEFAULT_TENANT_ID;
		}

	}
}