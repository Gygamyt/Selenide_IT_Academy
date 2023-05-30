package com.it_academy.selenide_rebuild_it_academy.utils;

public enum LinksForTestsEnum {
    ONLINER("https://www.onliner.by/");
    private String link;
    LinksForTestsEnum(String link){
        this.link = link;
    }
    public String getLink(){ return link;}
}
