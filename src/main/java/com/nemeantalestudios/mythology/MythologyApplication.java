package com.nemeantalestudios.mythology;

import com.nemeantalestudios.mythology.models.Figure;
import com.nemeantalestudios.mythology.models.ImageSize;
import com.nemeantalestudios.mythology.repositories.FigureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@SpringBootApplication
public class MythologyApplication implements CommandLineRunner {

    @Autowired
    private FigureRepository figureRepository;

    public static void main(String[] args) {
        SpringApplication.run(MythologyApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Optional<Figure> chronos = figureRepository.findById("5893a17a88dcfdf6dfa73449");

        chronos.ifPresent(figure -> {
            System.out.println(figure.name);
            System.out.println(figure.category);
            System.out.println(figure.description);
            System.out.println(figure.immortal);
            System.out.println(figure.romanName);
            System.out.println(figure.greekName);
            System.out.println(figure.gender);
            System.out.println(figureRepository.findById(figure.relatives.father).get().name);
            System.out.println(figureRepository.findById(figure.relatives.mother).get().name);
        });
    }
}
