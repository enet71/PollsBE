package com.polls.entity;

import javax.persistence.*;

@Entity
@Table(name = "vote_option")
public class VoteOptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "vote_id")
    private VoteEntity vote;

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

    public VoteEntity getVote() {
        return vote;
    }

    public void setVote(VoteEntity vote) {
        this.vote = vote;
    }
}
