package org.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = { "classpath:/application.properties"})
@SpringBootApplication(exclude=org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration.class)
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class Application extends SpringBootServletInitializer {

    private static final Log LOG = LogFactory.getLog(Application.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
