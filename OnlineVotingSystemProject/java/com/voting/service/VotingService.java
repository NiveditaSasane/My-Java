package com.voting.service;

import java.util.List;

import com.voting.entity.Voting;
import com.voting.model.VotingDTO;

public interface VotingService {
  String createvoting(Voting voter);
  VotingDTO updatevoting(int id, Voting voter);
   VotingDTO getvoting(int id);
   List<VotingDTO> getAllvoting();
   String deletevotingById(int id);
    void deleteAllvoting();
	String createVoting(Voting voter);
	String deleteVotingById(int id);
   
  
}
