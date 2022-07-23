package com.polls.models;

import com.polls.entity.VoteEntity;

public class Vote {
    private Integer id;
    private String title;

    public static Vote toModel(VoteEntity entity) {
        Vote model = new Vote();
        model.setId(entity.getId());
        model.setTitle(entity.getTitle());

        return model;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
