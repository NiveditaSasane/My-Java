package com.voting.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.voting.entity.Voting;
import com.voting.model.VotingDTO;

@Component
public class Converter {
	//convert StudentDTO to Entity(Student)
    public Voting convertToEntity(VotingDTO studentDTO)
    {
    	Voting student = new Voting();
    	 if(studentDTO!=null)
    	 {
    		 BeanUtils.copyProperties(studentDTO, student);
    	 }
    	 return student;
    }
    
    //convert Entity(Student) to StudentDTO
   public VotingDTO convertToStudentDTO(Voting student)
   {
	   VotingDTO studentDTO = new VotingDTO();
	   if(student!=null)
	   {
		   BeanUtils.copyProperties(student, studentDTO);
	   }
	   return studentDTO;
   }
}
