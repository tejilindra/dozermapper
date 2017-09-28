package com.demo.dozermapper;

import com.demo.dozermapper.vo.AncillaryMerchandize;
import com.demo.dozermapper.vo.SeatAvailability;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerConfig {

    @Bean(name = "org.dozer.Mapper")
    public DozerBeanMapper dozerBean() {

        DozerBeanMapper mapper = new DozerBeanMapper();

        BeanMappingBuilder builder = new BeanMappingBuilder() {
            @Override
            protected void configure() {
                mapping(SeatAvailability.class, AncillaryMerchandize.class).
                        fields("primaryLangID", "languageCode").
                        fields("pos.id", "clientID").
                        fields("pos.location.cityCode", "pointOfSaleLocation");
            }
        };
        mapper.addMapping(builder);
        return mapper;

    }


}
