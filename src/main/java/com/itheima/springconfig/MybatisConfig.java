package com.itheima.springconfig;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class MybatisConfig {

    @Value("#{dataSource}")
    private DataSource dataSource;

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws IOException {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        //设置数据源
        //注入数据库链接池
        sqlSessionFactoryBean.setDataSource(dataSource);

        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        //关联mybatis.xml配置文件
        Resource resource = pathMatchingResourcePatternResolver.getResource("classpath:mybatis/mybatis-config.xml");
        sqlSessionFactoryBean.setConfigLocation(resource);
        //设置别名包
        sqlSessionFactoryBean.setTypeAliasesPackage("com.itheima.pojo");
        //扫描mapper目录中中的mapper.xml文件
        Resource[] resources = pathMatchingResourcePatternResolver.getResources("classpath:mybatis/mapper/**/*Mapper.xml");
        sqlSessionFactoryBean.setMapperLocations(resources);

        return sqlSessionFactoryBean;
    }
}
