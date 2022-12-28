package com.voting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.voting.entity.Voting;
import com.voting.model.VotingDTO;
import com.voting.service.VotingService;
import com.voting.util.Converter;

@RestController
public class VotingController {
   @Autowired
	private VotingService VotingService;
  @Autowired
   private Converter converter;
  @PostMapping("/createVoting")
   public String createStudent(@RequestBody VotingDTO voterDTO)
   {
	 final Voting voter= converter.convertToEntity(voterDTO);
	 return VotingService.createVoting(voter);
   }
    @PutMapping("/updateStudent/{identity}")
  public VotingDTO updateVoter(@PathVariable("identity") int id, @RequestBody VotingDTO votingDTO)
  {
	  Voting student1= converter.convertToEntity(votingDTO);
	  return VotingService.updateVoter(id, voter1);
  }
    
    @GetMapping("/getStudent/{identity}")
    public VotingDTO getVoting(@PathVariable("identity") int id)
    {
    	//Student student2=converter.convertToEntity(studentDTO);
    return VotingService.getVoting(id);
    	
    }
    @GetMapping("/getAllVotings")
    public List<VotingDTO> getAllVotings()
    {
    	return VotingService.getAllVotings();
    }
    @DeleteMapping("/deleteVotingById/{id}")
    public String deleteVotingById(@PathVariable("id") int id)
    {
    	return VotingService.deleteVotingById(id);
    	
    }
    @DeleteMapping("/deleteAllStudents")
    public void deleteAllStudents()
    {
    	studentService.deleteAllStudents();
    	
    }
}
