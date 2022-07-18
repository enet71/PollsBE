package com.polls.controller;

import com.polls.models.Vote;
import com.polls.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VoteController {
    private final VoteService voteService;

    @Autowired
    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @CrossOrigin
    @PostMapping(value = "/votes")
    public ResponseEntity<?> create(@RequestBody Vote vote) {
        voteService.create(vote);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping(value = "/votes")
    public ResponseEntity<List<Vote>> read() {
        final List<Vote> votes = voteService.readAll();
        return new ResponseEntity<>(votes, HttpStatus.OK);
    }
}
