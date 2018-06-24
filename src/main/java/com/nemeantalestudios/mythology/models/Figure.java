package com.nemeantalestudios.mythology.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kevin.amiranoff on 23/06/2018
 */

@Getter
@Setter
@Document(collection = "figures")
public class Figure {

    @Id
    public String id;
    public String name;
    public String greekName;
    public String romanName;
    public String description;
    public String category;
    public String immortal;
    public Gender gender;
    public Relative relatives;

    @DBRef
    public List<Book> books;

}
