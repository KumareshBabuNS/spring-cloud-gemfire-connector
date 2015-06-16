package io.pivotal.spring.cloud.config.java;

import io.pivotal.spring.cloud.config.AbstractCloudConfigServiceTest;
import org.springframework.cloud.service.ServiceInfo;
import org.springframework.context.ApplicationContext;

public abstract class AbstractServiceJavaConfigTest<SC> extends AbstractCloudConfigServiceTest<SC> {
	private Class<?> withServiceIdContextClassName;
	private Class<?> withoutServiceIdContextClassName;

	public AbstractServiceJavaConfigTest(Class<?> withServiceIdContextClassName,
										 Class<?> withoutServiceIdContextClassName) {
		this.withServiceIdContextClassName = withServiceIdContextClassName;
		this.withoutServiceIdContextClassName = withoutServiceIdContextClassName;
	}

	protected Class<?> getWithServiceIdContextClassName() {
		return withServiceIdContextClassName;
	}

	protected Class<?> getWithoutServiceIdContextClassName() {
		return withoutServiceIdContextClassName;
	}

	@Override
	protected ApplicationContext getTestApplicationContextWithServiceId(ServiceInfo... serviceInfos) {
		return getTestApplicationContext(getWithServiceIdContextClassName(), serviceInfos);
	}

	@Override
	protected ApplicationContext getTestApplicationContextWithoutServiceId(ServiceInfo... serviceInfos) {
		return getTestApplicationContext(getWithoutServiceIdContextClassName(), serviceInfos);
	}

}