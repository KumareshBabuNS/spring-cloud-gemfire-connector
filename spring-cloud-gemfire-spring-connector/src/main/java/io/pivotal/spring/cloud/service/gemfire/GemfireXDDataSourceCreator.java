package io.pivotal.spring.cloud.service.gemfire;

import org.springframework.cloud.service.relational.DataSourceCreator;
import io.pivotal.spring.cloud.service.common.GemfireXDServiceInfo;

/**
 * 
 * @author Ramnivas Laddad
 *
 */
public class GemfireXDDataSourceCreator extends DataSourceCreator<GemfireXDServiceInfo> {
	
	private static final String[] DRIVERS = new String[]{"com.pivotal.gemfirexd.internal.jdbc.ClientConnectionPoolDataSource"};
	private static final String VALIDATION_QUERY = null;
	
	public GemfireXDDataSourceCreator() {
		super("spring-cloud.gemfirexd.driver", DRIVERS, VALIDATION_QUERY);
	}
}
