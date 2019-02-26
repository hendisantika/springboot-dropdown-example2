package com.hendisantika.springbootdropdownexample2.controller;

import com.hendisantika.springbootdropdownexample2.model.Country;
import com.hendisantika.springbootdropdownexample2.model.PersonForm;
import com.hendisantika.springbootdropdownexample2.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-dropdown-example2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-26
 * Time: 06:58
 */

@Controller
public class DropdownController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    @ResponseBody
    public String index() {
        return "Spring boot Dropdown Example2! " + new Date();
    }

    @GetMapping("/selectOptionExample1")
    public String selectOptionExample1Page(Model model) {

        PersonForm form = new PersonForm();
        model.addAttribute("personForm", form);

        List<Country> list = countryRepository.getCountries();
        model.addAttribute("countries", list);

        return "selectOptionExample1";
    }
}
