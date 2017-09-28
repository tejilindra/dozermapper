package com.demo.dozermapper;

import com.demo.dozermapper.vo.AncillaryMerchandize;
import com.demo.dozermapper.vo.Location;
import com.demo.dozermapper.vo.PointOfSale;
import com.demo.dozermapper.vo.SeatAvailability;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DozerIntegrationTest {

    DozerBeanMapper mapper;
    BeanMappingBuilder builder = new BeanMappingBuilder() {
        @Override
        protected void configure() {
            mapping(SeatAvailability.class, AncillaryMerchandize.class).
                    fields("primaryLangID", "languageCode").
                    fields("pos.id", "clientID").
                    fields("pos.location.cityCode", "pointOfSaleLocation");
        }
    };

    @Before
    public void before() throws Exception {
        mapper = new DozerBeanMapper();
    }

    @Test
    public void givenApiMapper_whenMaps_thenCorrect() {
        mapper.addMapping(builder);
        Location loc = new Location();
        loc.setCityCode("DUB");
        loc.setCountryCode("IRL");
        PointOfSale pos = new PointOfSale();
        pos.setId(777);
        pos.setLocation(loc);
        SeatAvailability seatAvailability = new SeatAvailability();
        seatAvailability.setVersion(123);
        seatAvailability.setPrimaryLangID(007);
        seatAvailability.setPos(pos);
        AncillaryMerchandize _ancillaryMerchandize = mapper.map(seatAvailability, AncillaryMerchandize.class);

        assertEquals(seatAvailability.getPrimaryLangID(), _ancillaryMerchandize.getLanguageCode());
        assertEquals(seatAvailability.getPos().getId(), _ancillaryMerchandize.getClientID());
        assertEquals(seatAvailability.getPos().getLocation().getCityCode(), _ancillaryMerchandize.getPointOfSaleLocation());
    }

}


