package com.nemeantalestudios.mythology.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author kevin.amiranoff on 23/06/2018
 */

@Getter
@Setter
public class Author {

    public String name;
    public String description;
    public List<Book> books;
}
