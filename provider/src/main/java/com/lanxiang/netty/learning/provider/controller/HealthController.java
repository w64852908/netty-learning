package com.lanxiang.netty.learning.provider.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyebing created on 16/5/29.
 * @version $Id$
 */
@RestController
@RequestMapping("/service/")
public class HealthController {

    @RequestMapping(value = "alive", method = {RequestMethod.HEAD, RequestMethod.GET})
    @ResponseBody
    public String healthCheck() throws IOException {
        return "ok";
    }

}
