package com.example.wstest;

/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WstestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WstestApplication.class, args);
    }

}*/

        import com.example.wstest.dao.basedao.BaseRepositoryFactoryBean;
        import org.mybatis.spring.annotation.MapperScan;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.annotation.Bean;
        import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
        import org.springframework.web.socket.config.annotation.EnableWebSocket;
        import org.springframework.web.socket.server.standard.ServerEndpointExporter;



/**
 * @author Levin
 */
@EnableJpaRepositories(basePackages = ("com.example"),
        repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)
@EnableWebSocket
@SpringBootApplication
@MapperScan("com.example.wstest.dao")
public class WstestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WstestApplication.class, args);

    }

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}