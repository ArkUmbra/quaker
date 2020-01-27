package com.arkumbra.geotest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Main {
    private RestTemplate restTemplate = new RestTemplate();

    public static void main(String... args) {
        new Main().run();
    }
    public void run() {
        String url = "http://www.data.jma.go.jp/developer/xml/feed/eqvol.xml";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
//        response.getHeaders().getAcceptCharset()
        System.out.println(response.getHeaders());
        System.out.println(response.getBody());
    }
}
