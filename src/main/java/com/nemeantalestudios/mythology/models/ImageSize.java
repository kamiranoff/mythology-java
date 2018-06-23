package com.nemeantalestudios.mythology.models;

/**
 * @author kevin.amiranoff on 23/06/2018
 */
public enum ImageSize {
    REGULAR("regular"),
    THUMBNAIL("thumbnail");

    private final String text;

    ImageSize(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
