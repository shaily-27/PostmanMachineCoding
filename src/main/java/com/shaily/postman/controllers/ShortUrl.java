package com.shaily.postman.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Log4j2
public class ShortUrl {

    @PostMapping("/shortURL")
    public String createShortUrl(final String longUrl) {
        // create short url, store in db and return the short url
    }
}
