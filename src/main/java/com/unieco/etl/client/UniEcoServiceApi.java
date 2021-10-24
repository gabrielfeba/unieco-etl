package com.unieco.etl.client;

import com.unieco.etl.client.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@FeignClient(url = "${unieco-url}", name = "UniEco Service")
public interface UniEcoServiceApi {

    @PutMapping("/user")
    User putUser(@RequestBody UserInput userInput);

    @PostMapping("/user")
    User postUser(@RequestBody User user);

    @GetMapping("/user/data/{username}")
    Optional<User> getUserDataForUserName(@PathVariable("username") String username);

    @PutMapping("/enterprise")
    Enterprise putEnterprise(@RequestBody EnterpriseInput enterpriseInput);

    @PostMapping("/enterprise")
    Enterprise postEnterprise(@RequestBody Enterprise enterprise);

    @PutMapping("/address")
    Address putAddress(@RequestBody AddressInput addressInput);

    @PostMapping("/address")
    Address postAddress(@RequestBody Address address);
}
