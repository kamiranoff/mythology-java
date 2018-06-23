package com.nemeantalestudios.mythology.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kevin.amiranoff on 23/06/2018
 */
@Getter
@Setter
@Document(collection = "books")
public class Book {

    @Id
    public String id;
    public String title;
    public String author;
    public List<String> tranlator;
    public String description;
    public String excerpt;
    public String rating;
    public String link;
    public String fullText;
    public Map<String,String> images = new HashMap<>();
}
