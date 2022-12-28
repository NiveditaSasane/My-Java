package com.voting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voting.entity.Voting;

public interface VotingRepository extends JpaRepository<Voting,Integer> {

}
