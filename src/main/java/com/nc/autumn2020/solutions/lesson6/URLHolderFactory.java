package com.nc.autumn2020.solutions.lesson6;

public class URLHolderFactory {
    public URLHolderFactory() {
    }

    public URLHolder createInstance(String url) {
        URLHolder urlHolder = new URLHolder();
        return urlHolder;
    }

    private void parse(String url, URLHolder urlHolder) {

        urlHolder.setDomain("");
    }
}
