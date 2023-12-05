package com.dg.tbs.ts.controller;

import com.dg.tbs.ts.models.TheatreInfo;
import com.dg.tbs.ts.service.TheatreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/theatres")
public class TheatreResource {

    private final TheatreService theatreService;

    public TheatreResource(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping("/city/{cityId}")
    public List<TheatreInfo> getTheatresByCity(@PathVariable String cityId){
        return theatreService.getAllTheatresByCity(cityId);
    }
    @GetMapping("/state/{stateId}")
    public List<TheatreInfo> getTheatresByState(@PathVariable String stateId){
        return theatreService.getAllTheatresByCity(stateId);
    }

    @GetMapping("/area/{areaId}")
    public List<TheatreInfo> getTheatresByArea(@PathVariable String areaId){
        return theatreService.getAllTheatresByCity(areaId);
    }

    @GetMapping("/{theaterId}")
    public TheatreInfo getTheatreDetails(@PathVariable long theaterId){
        return theatreService.getTheatreDetailsById(theaterId);
    }
}
