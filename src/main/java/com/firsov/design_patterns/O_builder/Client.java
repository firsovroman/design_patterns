package com.firsov.design_patterns.O_builder;

public class Client {
    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new EnterpriseWebsiteBuilder());

        Website website = director.buildWebsite();

        System.out.println(website);


    }
}
