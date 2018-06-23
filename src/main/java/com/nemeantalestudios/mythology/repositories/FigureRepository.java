package com.nemeantalestudios.mythology.repositories;

import com.nemeantalestudios.mythology.models.Figure;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author kevin.amiranoff on 23/06/2018
 */

public interface FigureRepository extends MongoRepository<Figure, String> {
}
