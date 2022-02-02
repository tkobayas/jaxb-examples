package org.example;

import java.util.List;

public class MultipleAuthor implements Author {

    private List<String> nameList;

    public MultipleAuthor() {
        super();
    }

    @Override
    public String getName() {
        return nameList.toString();
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

}
