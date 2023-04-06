package com.gender.find.service;

import com.gender.find.response.GenderResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class GenderService {
    @Value("${Url}")
    private String genderInfo;

public GenderResponse getResponse(String name){

    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    HttpEntity<String> entity = new HttpEntity<>(headers);

    ResponseEntity<GenderResponse> response = new RestTemplate().exchange(genderInfo +name, HttpMethod.GET, entity, GenderResponse.class);
    GenderResponse genderResponse = response.getBody();
    System.out.println(genderResponse.getName());
    return genderResponse;

}
}
