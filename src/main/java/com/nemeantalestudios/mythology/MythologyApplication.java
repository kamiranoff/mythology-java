package com.nemeantalestudios.mythology;

import com.nemeantalestudios.mythology.models.Figure;
import com.nemeantalestudios.mythology.repositories.FigureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class MythologyApplication implements CommandLineRunner {

    @Autowired
    private FigureRepository figureRepository;

    public static void main(String[] args) {
        SpringApplication.run(MythologyApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Optional<Figure> chronos = figureRepository.findById("5893a17a88dcfdf6dfa73436");

        chronos.ifPresent(figure -> {
            System.out.println(figure.name);
            System.out.println(figure.category);
            System.out.println(figure.description);
            System.out.println(figure.immortal);
            System.out.println(figure.romanName);
            System.out.println(figure.greekName);
            System.out.println(figure.gender.toString());
        });
    }
}
