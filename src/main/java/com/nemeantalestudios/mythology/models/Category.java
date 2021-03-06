package com.nemeantalestudios.mythology.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author kevin.amiranoff on 23/06/2018
 */

@Getter
@Setter
@Document(collection = "categories")
public class Category {
    @Id
    public String id;
    public String name;
    public String description;
}
