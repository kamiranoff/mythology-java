package com.nemeantalestudios.mythology.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author kevin.amiranoff on 23/06/2018
 */

@Getter
@Setter
@Document(collection = "figures")
public class Figure {

    public enum Gender {
        MALE("male"),
        FEMALE("female");

        private final String text;

        Gender(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    @Id
    public String id;
    public String name;
    public String greekName;
    public String romanName;
    public String description;
    public String category;
    public String immortal;
    public Gender gender;
    public Map<ImageSize, String> images = new EnumMap<>(ImageSize.class);
}
