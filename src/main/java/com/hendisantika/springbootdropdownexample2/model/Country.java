package com.hendisantika.springbootdropdownexample2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-dropdown-example2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-26
 * Time: 06:44
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    private Long countryId;
    private String countryCode;
    private String countryName;
}
