package com.nemeantalestudios.mythology.controllers;

import com.nemeantalestudios.mythology.models.Figure;
import com.nemeantalestudios.mythology.repositories.FigureRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author kevin.amiranoff on 24/06/2018
 */

@RestController
public class FigureController {

    public FigureController(FigureRepository figureRepository) {
        this.figureRepository = figureRepository;
    }

    private FigureRepository figureRepository;

    @RequestMapping("/figures/{id}")
    public Figure getOne(@PathVariable String id) {//REST Endpoint.

        Optional<Figure> figure = figureRepository.findById(id);

        return figure.orElse(null);
    }

    @RequestMapping("/figures")
    public List<Figure> getAll() {//REST Endpoint.
        List<Figure> figures = figureRepository.findAll();
        return figures;
    }
}
