package paskudnyprogramista.controller;

import io.micronaut.core.version.annotation.Version;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/tattoo_artists")
public class TattooArtistsController {

    @Get
    @Version("1")
    List<Object> indexV1() {
        return List.of(1, 2, 3);
    }

    @Get
    @Version("2")
    List<Object> indexV2() {
        return List.of(3, 2, 1);
    }
}
