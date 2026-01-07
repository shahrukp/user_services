package com.user.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/rest/")
@RestController
public class OrderController {



    RestTemplate restTemplate =new RestTemplate();



   // http://localhost:2222/rest/get
    @GetMapping("get")
   public List<Object> printabove(){
        System.out.println("order controller ? ");
       List<Object> list =new ArrayList<>();
// http://localhost:8080/rest/v1/ten
       String restEndPoint=restTemplate.getForObject("localhost:8080/rest/v1/ten", String.class);
       list.add(restEndPoint);
       for(int i=5; i<=10; i++){
           list.add(i);
       }
       return list;
   }

}
