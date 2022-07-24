package com.polls.repository;

import com.polls.entity.VoteOptionEntity;
import org.springframework.data.repository.CrudRepository;

public interface VoteOptionRepository extends CrudRepository<VoteOptionEntity, Integer> {
}
