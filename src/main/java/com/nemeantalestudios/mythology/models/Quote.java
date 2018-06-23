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
@Document(collection = "quotes")
public class Quote {

    @Id
    public String id;
    public String quote;
    public String note;
    public String author;
    public Integer likes;


}
