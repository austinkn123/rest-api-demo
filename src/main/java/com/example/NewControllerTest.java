package com.example;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest
public class NewControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    public void testController() {
        HttpRequest<String> request = HttpRequest.GET("/test");
        String body = client.toBlocking().retrieve(request);

        assertNotNull(body);
        assertEquals("Hey Everybody\nNEW TEST", body);
    }
}