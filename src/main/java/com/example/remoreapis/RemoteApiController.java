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
        String url = "https://api.themoviedb.org/3/movie/157336?api_key=683ed2606337071f157da7388468a007";
        Object responseObject = restTemplate.getForObject(url, Object.class);
        return responseObject;
    }

    @GetMapping("/get_custom")
    public MovieResponse getCustomMovieDetails() {
        String url = "https://api.themoviedb.org/3/movie/157336?api_key=683ed2606337071f157da7388468a007";
        MovieResponse responseObject = restTemplate.getForObject(url, MovieResponse.class);
        return responseObject;
    }
}
