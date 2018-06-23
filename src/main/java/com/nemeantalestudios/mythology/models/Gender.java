package com.nemeantalestudios.mythology.models;

/**
 * @author kevin.amiranoff on 23/06/2018
 */

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
