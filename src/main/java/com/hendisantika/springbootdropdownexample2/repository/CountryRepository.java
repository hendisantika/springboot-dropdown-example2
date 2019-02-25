package com.hendisantika.springbootdropdownexample2.repository;

import com.hendisantika.springbootdropdownexample2.model.Country;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-dropdown-example2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-26
 * Time: 06:47
 */

@Repository
public class CountryRepository {

    private static Logger logger = LogManager.getLogger(CountryRepository.class);
    private static List<Country> COUNTRIES = new ArrayList<Country>();

    static {
        initData();
    }

    private static void initData() {
        Country vn = new Country(1L, "VN", "Vietnam");
        Country en = new Country(2L, "EN", "England");
        Country ru = new Country(3L, "VN", "Russia");
        Country id = new Country(4L, "ID", "Indonesia");
        Country my = new Country(5L, "MY", "Malaysia");
        Country sg = new Country(6L, "SG", "Singapore");
        Country uk = new Country(7L, "UK", "United Kingdom");
        Country jp = new Country(8L, "JP", "Japan");
        Country cn = new Country(9L, "CN", "China");
        Country hk = new Country(10L, "HK", "Hong Kong");
        Country in = new Country(11L, "IN", "India");

        Stream<Country> stream = Stream.of(vn, en, ru, id, my, sg, uk, jp, cn, hk, id);

        COUNTRIES = stream.collect(Collectors.toList());

        logger.info("List of Countries ....");
        logger.info(COUNTRIES);
    }

    public List<Country> getCountries() {
        return COUNTRIES;
    }

    public Map<Long, String> getMapCountries() {
        Map<Long, String> map = new HashMap<Long, String>();
        for (Country c : COUNTRIES) {
            map.put(c.getCountryId(), c.getCountryName());
        }
        return map;
    }
}
