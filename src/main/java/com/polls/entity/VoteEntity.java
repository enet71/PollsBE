package com.polls.entity;

import com.polls.enums.VoteType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vote")
public class VoteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private VoteType type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vote")
    private List<VoteOptionEntity> voteOptions;

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

    public VoteType getType() {
        return type;
    }

    public void setType(VoteType type) {
        this.type = type;
    }

    public List<VoteOptionEntity> getVoteOptions() {
        return voteOptions;
    }

    public void setVoteOptions(List<VoteOptionEntity> voteOptions) {
        this.voteOptions = voteOptions;
    }
}
