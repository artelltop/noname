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

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.annotation.Bean;
        import org.springframework.web.socket.config.annotation.EnableWebSocket;
        import org.springframework.web.socket.server.standard.ServerEndpointExporter;



/**
 * @author Levin
 */
@EnableWebSocket
@SpringBootApplication
public class WstestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WstestApplication.class, args);

    }

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}