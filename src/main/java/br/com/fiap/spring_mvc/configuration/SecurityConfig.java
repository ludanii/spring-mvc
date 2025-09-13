package br.com.fiap.spring_mvc.configuration;

import org.springframework.context.annotation.Bean;

public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity){
        return httpSecurity.authorizeHttpRequest(
                authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/").permitAll
                                .requestMatchers("/livros/lista").
        );
    }
}
