package com.polls.models;

import com.polls.entity.VoteEntity;

import java.util.List;
import java.util.stream.Collectors;

public class Vote {
    private Integer id;
    private String title;
    private List<VoteOption> voteOptions;

    public static Vote toModel(VoteEntity entity) {
        Vote model = new Vote();
        model.setId(entity.getId());
        model.setTitle(entity.getTitle());
        model.setVoteOptions(entity.getVoteOptions().stream().map(VoteOption::toModel).toList());

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

    public List<VoteOption> getVoteOptions() {
        return voteOptions;
    }

    public void setVoteOptions(List<VoteOption> voteOptions) {
        this.voteOptions = voteOptions;
    }
}
