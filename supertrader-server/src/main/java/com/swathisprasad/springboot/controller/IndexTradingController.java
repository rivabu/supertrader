package com.swathisprasad.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexTradingController {
    @RequestMapping("/version")
    @ResponseBody
    String version() {
        return "2019-01-29";
    }

}
