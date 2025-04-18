package com.service.userService.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
@Slf4j
public class RoleController {


    @GetMapping("/hello")
    public String getHello(@RequestHeader(value = "x-trace-Id", required = false) String traceId){
        log.info("traceId:: {}",traceId);
        return "Hello";
    }
}
