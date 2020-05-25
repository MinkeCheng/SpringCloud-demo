package com.czm.accountservice.action;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping(value = "order")
public class OrderHandelAction {

    @RequestMapping(value = "findOrderByOrderNo",method = RequestMethod.POST)
    public String findOrderByOrderNo(@RequestBody String orderNo){
        return orderNo;
    }

}
