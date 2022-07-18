package com.polls.service;

import com.polls.models.Vote;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class VoteServiceImpl implements VoteService {
    private static final Map<Integer, Vote> REPOSITORY_MAP = new HashMap<>();
    private static final AtomicInteger ID_HOLDER = new AtomicInteger();

    @Override
    public void create(Vote vote) {
        final int id = ID_HOLDER.incrementAndGet();
        vote.setId(id);
        REPOSITORY_MAP.put(id, vote);
    }

    @Override
    public Vote read(int id) {
        return null;
    }

    @Override
    public List<Vote> readAll() {
        return new ArrayList<>(REPOSITORY_MAP.values());
    }
}
