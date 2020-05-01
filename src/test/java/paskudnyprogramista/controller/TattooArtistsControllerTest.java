package paskudnyprogramista.controller;

import io.micronaut.core.type.Argument;
import io.micronaut.http.*;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class TattooArtistsControllerTest {

    @Inject
    @Client("/tattoo_artists")
    HttpClient client;

    @Test
    public void testIndexWithDefaultVersionResponseStatus() {
        HttpRequest<String> request = HttpRequest.GET("/");

        HttpResponse<List<Integer>> response = client.toBlocking().exchange(request, Argument.listOf(Integer.class));

        HttpStatus status = response.status();
        List<Integer> body = response.body();

        assertEquals(HttpStatus.OK, status);
        assertEquals(List.of(1, 2, 3), body);
    }

    @Test
    public void testIndexWithSecondVersionResponseStatus() {
        HttpRequest<Object> request = HttpRequest.GET("/").header("X-API-VERSION", "2");

        HttpResponse<List<Integer>> response = client.toBlocking().exchange(request, Argument.listOf(Integer.class));

        HttpStatus status = response.status();
        List<Integer> body = response.body();

        assertEquals(HttpStatus.OK, status);
        assertEquals(List.of(3, 2, 1), body);
    }
}

