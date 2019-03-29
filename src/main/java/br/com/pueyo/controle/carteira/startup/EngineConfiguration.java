package br.com.pueyo.controle.carteira.startup;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
public class EngineConfiguration {
    
//    @Bean
//    @Primary
//    @ConfigurationProperties("spring.datasource")
//    public DataSourceProperties firstDataSourceProperties() {
//        return new DataSourceProperties();
//    }

    @Bean
    @Primary
//    @ConfigurationProperties("spring.datasource.configuration")
    public DataSource firstDataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(org.postgresql.Driver.class);
        dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/camunda");
        dataSource.setUsername("postgres");
        dataSource.setPassword("serpro123");
        return dataSource;
//        return firstDataSourceProperties().initializeDataSourceBuilder()
//                .type(SimpleDriverDataSource.class).build();
    }
}
