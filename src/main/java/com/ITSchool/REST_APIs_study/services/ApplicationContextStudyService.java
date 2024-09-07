package com.ITSchool.REST_APIs_study.services;

public class ApplicationContextStudyService {
    public ApplicationContextStudyService(String message) {
        this.message = message;
    }

    private final String message;

    public String greet(){
        return ("Mesaj hardcodat " +message);
    }
}
