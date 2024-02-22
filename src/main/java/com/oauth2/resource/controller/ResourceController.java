package com.oauth2.resource.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    private final Logger logger = LogManager.getLogger(ResourceController.class);

    @GetMapping("/oauth")
    public String oauthEndpoint(Authentication authentication){
        logger.info(authentication.getName()+" invoked /oauth having roles : "+authentication.getAuthorities());
        return "If you can see this, the OAuth validation was successful";
    }

}
