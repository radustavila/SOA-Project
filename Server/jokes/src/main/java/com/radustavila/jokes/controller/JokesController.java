package com.radustavila.jokes.controller;

import com.radustavila.jokes.model.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/jokes")
public class JokesController {

    private static final String JOKE_URL = "https://official-joke-api.appspot.com/random_joke";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/random")
    public Joke getCar() {
        return restTemplate.getForObject(JOKE_URL, Joke.class);
    }

}
