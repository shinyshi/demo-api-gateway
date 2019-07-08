package demo.spring.cloud.apigateway;

import demo.spring.cloud.fillters.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayApplication {


    @Bean
    public AccessFilter accessFilter()
    {
        return new AccessFilter();
    }

    public static void main(String[] args) {

        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}
