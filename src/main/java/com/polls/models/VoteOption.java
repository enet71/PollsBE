package com.polls.models;

import com.polls.entity.VoteOptionEntity;

public class VoteOption {
    private Integer id;
    private String title;

    public static VoteOption toModel(VoteOptionEntity entity) {
        VoteOption model = new VoteOption();
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
