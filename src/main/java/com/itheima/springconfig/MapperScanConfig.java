package com.itheima.springconfig;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(MybatisConfig.class)
public class MapperScanConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {

        //Mapper 接口扫描
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.itheima.mapper");
        return mapperScannerConfigurer;
    }

}
