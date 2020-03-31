package com.showtime.userservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.QueryLogger;

@Configuration
public class QueryLoggerConfig {

	@Bean
	public QueryLogger queryLogger(Cluster cluster) {
		QueryLogger queryLogger = QueryLogger.builder().build();
		cluster.register(queryLogger);
		return queryLogger;
	}

}
