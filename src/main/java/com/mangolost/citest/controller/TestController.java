package com.mangolost.citest.controller;

import com.mangolost.citest.common.dto.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     *
     * @param request
     * @return
     */
    @RequestMapping("test1")
    public CommonResult test1(HttpServletRequest request) {
        CommonResult commonResult = new CommonResult();
        commonResult.setData("Hello World");
        return commonResult;
    }

}
