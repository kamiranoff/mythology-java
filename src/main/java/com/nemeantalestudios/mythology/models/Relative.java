package com.nemeantalestudios.mythology.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author kevin.amiranoff on 23/06/2018
 */


@Getter
@Setter
public class Relative {

    public String father;
    public String mother;
    public List<String> spouses;
    public List<String> lovers;
    public List<String> children;
}
