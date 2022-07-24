package com.polls.service;

import com.polls.entity.VoteEntity;
import com.polls.models.Vote;
import com.polls.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {

    private final VoteRepository voteRepository;

    @Autowired
    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public VoteEntity create(VoteEntity vote) {
        return voteRepository.save(vote);
    }

    public void deleteById(Integer id) {
        voteRepository.deleteById(id);
    }

    public List<Vote> getAll() {
        return voteRepository.findAll().stream().map(Vote::toModel).toList();
    }

    public Vote getById(Integer id) {
        return Vote.toModel(voteRepository.findById(id).get());
    }
}
