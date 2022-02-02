package org.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SingleAuthor implements Author {

    private String name;

    public SingleAuthor() {
        super();
    }

    public SingleAuthor(String name) {
        super();
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
