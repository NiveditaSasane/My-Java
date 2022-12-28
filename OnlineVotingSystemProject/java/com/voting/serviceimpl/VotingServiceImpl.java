package com.voting.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voting.entity.Voting;
import com.voting.model.VotingDTO;
import com.voting.repository.VotingRepository;
import com.voting.service.VotingService;
import com.voting.util.Converter;

@Service
public abstract class VotingServiceImpl implements VotingService{
	@Autowired
	private VotingRepository VotingRepository;
	 @Autowired
	 private Converter converter;
	@Override
	public String createvoting(voting voter) {
	String message=null;
	VotingRepository.save(voter);
	if(voter!=null)
	{
		message ="Voting details saved successfuly";
	}
		return message;
	}
	@Override
	public VotingDTO updatevoting(int id, Voting voter) {
		Voting existingvoting= VotingRepository.findById(id).get();
		existingvoting.setvotertName(Voting.getvoterName());
		existingvoting.setPhone(voter.getPhone());
		existingvoting.setEmail(voter.getEmail());
		
		VotngRepository.save(existingvoting);
		return converter.convertToVotingDTO(existingvoting);
	}
@Override
  public VotingDTO getVoting(int id)
  {
	  Voting getVoting= VotingRepository.findById(id).get();
	  
	  //studentRepository.save(getStudent);
	  return converter.convertToStudentDTO(getVoting);
  }
@Override
 public List<VotingDTO> getAllvoting()
 {
	 List<Voting> voting=VotingRepository.findAll();
	 List<VotingDTO> sDTO = new ArrayList<>();
	 for(Voting v:Voters)
	 {
		 sDTO.add(converter.convertTOVotingDTO(v));
	 }
	 return sDTO;
 }
  @Override
     public  String deleteVotingById(int id)
     {
    	 String message= null;
    	 Optional<Voting> voting=VotingRepository.findById(id);
    	 if(voting.isPresent())
    	 {
    		 VotingRepository.deleteById(id);
    		 message="Voting details delete successfully";
    	 }
    	 else
    	 {
    		 message="Voting details not found";
    	 }
    	 return message;
     }
  
      @Override
     public void deleteAllvoting()
     {
    	 VotingRepository.deleteAll();
     }
}
