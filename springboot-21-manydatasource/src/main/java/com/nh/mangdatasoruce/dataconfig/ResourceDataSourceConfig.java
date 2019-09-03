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
 * @Classname OrgDataSourceConfig
 * @Description TODO
 * @Date 2019/9/3 10:53 AM
 * @Created by nihui
 */
@Configuration
@MapperScan(basePackages = "com.nh.mangdatasoruce.dao.mapper.resource",sqlSessionFactoryRef = "resourceSqlSessionFactory")
public class ResourceDataSourceConfig {

    @Primary
    @Bean(name = "orgDataSource")
    @ConfigurationProperties("spring.datasource.org")
    public DataSource masterDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "resourceSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("orgDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:mapping/resource/*.xml"));
        return sessionFactoryBean.getObject();
    }
}
