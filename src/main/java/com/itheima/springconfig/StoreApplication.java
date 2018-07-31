package com.itheima.springconfig;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.beans.PropertyVetoException;

@Configuration
@PropertySource(value = {"classpath:jdbc.properties", "classpath:application.properties"})
@ComponentScan(basePackages = "com.itheima")
public class StoreApplication {

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.driverClassName}")
    private String jdbcDriverClassName;

    @Value("${jdbc.username}")
    private String jdbcUserName;

    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(destroyMethod = "close")
    public ComboPooledDataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(jdbcDriverClassName);
        comboPooledDataSource.setJdbcUrl(jdbcUrl);
        comboPooledDataSource.setUser(jdbcUserName);
        comboPooledDataSource.setPassword(jdbcPassword);

        return comboPooledDataSource;
    }

}
