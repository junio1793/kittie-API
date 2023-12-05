package com.kittyProject.restTemplate.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.kittyCore.model.DTO.KittyDTO;
import com.kittyProject.restTemplate.service.KittyRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping
public class CatsApi {
    private final String URL_CAT_API_RACE = "https://api.thecatapi.com/v1/images/search?breed_ids=";
    private RestTemplate restTemplate = new RestTemplate();
    @Autowired
    private KittyRestService service;

    @GetMapping("/kittieRace/{race}")
    public List<KittyDTO> getKittieRace(@PathVariable String race) throws IOException  {

            ResponseEntity<List<KittyDTO>> response = restTemplate.exchange(
                    URL_CAT_API_RACE + race,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<KittyDTO>>() {
                    });
            List<KittyDTO> listaKitties = response.getBody();

            for (int i = 0; i < Objects.requireNonNull(listaKitties).size(); i++) {
                service.save(listaKitties.get(i));
            }

        return listaKitties;
    }
}
