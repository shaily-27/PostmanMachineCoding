package com.shaily.postman.controllers;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Log4j2
public class LongUrl {

    @GetMapping("/longURL/{shortUrl}")
    public String getLongUrl(@PathVariable("shortUrl") final String shortUrl) {
        // fetch long url for the given short url
    }

}
