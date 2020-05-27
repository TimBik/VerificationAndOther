package ru.itis.jlab.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableJdbcHttpSession
@EnableWebMvc
public class SessionConfig
        extends AbstractHttpSessionApplicationInitializer {

}