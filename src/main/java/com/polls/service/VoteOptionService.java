package com.polls.service;

import com.polls.entity.VoteEntity;
import com.polls.entity.VoteOptionEntity;
import com.polls.repository.VoteOptionRepository;
import com.polls.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteOptionService {

    private final VoteOptionRepository voteOptionRepository;
    private final VoteRepository voteRepository;

    @Autowired
    public VoteOptionService(VoteOptionRepository voteOptionRepository, VoteRepository voteRepository) {
        this.voteOptionRepository = voteOptionRepository;
        this.voteRepository = voteRepository;
    }

    public void create(VoteOptionEntity voteOptionEntity, Integer voteId) {
        VoteEntity voteEntity = voteRepository.findById(voteId).get();
        voteOptionEntity.setVote(voteEntity);
        voteOptionRepository.save(voteOptionEntity);
    }
}
