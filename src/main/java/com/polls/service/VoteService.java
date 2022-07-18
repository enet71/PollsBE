package com.polls.service;

import com.polls.models.Vote;

import java.util.List;

public interface VoteService {
    void create(Vote vote);

    Vote read(int id);

    List<Vote> readAll();
}
