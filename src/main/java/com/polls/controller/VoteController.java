package com.polls.controller;

import com.polls.entity.VoteEntity;
import com.polls.models.Vote;
import com.polls.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/votes")
public class VoteController {
    private final VoteService voteService;

    @Autowired
    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<?> create(@RequestBody VoteEntity vote) {
        voteService.save(vote);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        voteService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping
    public ResponseEntity<?> getAll(@RequestParam Optional<Integer> id) {
        if (id.isPresent()) {
            final Vote vote = voteService.getById(id.get());
            return new ResponseEntity<>(vote, HttpStatus.OK);
        } else {
            final List<Vote> votes = voteService.getAll();
            return new ResponseEntity<>(votes, HttpStatus.OK);
        }
    }
}
