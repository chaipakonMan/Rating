package com.example.rating.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SDRecord {
    @Id
    private String id;
    private String user_id;
    private String score_differential;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getScore_differential() {
        return score_differential;
    }

    public void setScore_differential(String score_differential) {
        this.score_differential = score_differential;
    }
}
