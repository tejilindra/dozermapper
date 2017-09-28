package com.demo.dozermapper.controller;

import com.demo.dozermapper.vo.AncillaryMerchandize;
import com.demo.dozermapper.vo.Location;
import com.demo.dozermapper.vo.PointOfSale;
import com.demo.dozermapper.vo.SeatAvailability;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @RequestMapping("/test")
    public AncillaryMerchandize test() {
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
        AncillaryMerchandize _ancillaryMerchandize = dozerBeanMapper.map(seatAvailability, AncillaryMerchandize.class);
        return _ancillaryMerchandize;
    }

}
