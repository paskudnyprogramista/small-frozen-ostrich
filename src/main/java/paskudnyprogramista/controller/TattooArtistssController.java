package paskudnyprogramista.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Collections;
import java.util.List;

@Controller("/tattoo_artists")
public class TattooArtistssController {

    @Get("/")
    public List<Object> index() {
        return Collections.emptyList();
    }
}
