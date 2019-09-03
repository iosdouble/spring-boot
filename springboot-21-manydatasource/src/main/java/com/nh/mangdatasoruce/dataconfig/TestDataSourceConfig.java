package com.nh.mangdatasoruce.dataconfig;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Classname GsIotDataSourceConfig
 * @Description TODO
 * @Date 2019/9/3 10:51 AM
 * @Created by nihui
 */
@Configuration
@MapperScan(basePackages = "com.nh.mangdatasoruce.dao.mapper.test",sqlSessionFactoryRef = "testSqlSessionFactory")
public class TestDataSourceConfig {
    @Primary
    @Bean(name = "gsiotDataSource")
    @ConfigurationProperties("spring.datasource.gsiot")
    public DataSource masterDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "testSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("gsiotDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:mapping/test/*.xml"));
        return sessionFactoryBean.getObject();
    }
}
