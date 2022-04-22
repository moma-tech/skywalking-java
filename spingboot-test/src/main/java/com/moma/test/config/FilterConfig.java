package com.moma.test.config;




import com.moma.test.filter.RequestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean myFilterBean(){
        FilterRegistrationBean filterRegistration = new FilterRegistrationBean(new RequestFilter());
        filterRegistration.addUrlPatterns("/*");
        return filterRegistration;
    }
}
