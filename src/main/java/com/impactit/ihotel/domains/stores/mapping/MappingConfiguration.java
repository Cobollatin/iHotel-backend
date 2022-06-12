package com.impactit.ihotel.domains.stores.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("StoreMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public ProductMapper productMapper(){ return new ProductMapper(); }

}
