package com.example.remoreapis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/remote")
public class RemoteApiController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get")
    public Object getMovieDetails() {
        String url = "";
        Object responseObject = restTemplate.getForObject(url, Object.class);
        return responseObject;
    }
}
