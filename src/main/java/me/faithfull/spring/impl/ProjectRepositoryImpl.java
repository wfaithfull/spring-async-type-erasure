package me.faithfull.spring.impl;

import org.springframework.stereotype.Repository;

import me.faithfull.spring.pojo.Project;

@Repository
public class ProjectRepositoryImpl extends AbstractRepositoryImpl<Project> {

	@Override
	public String whatToSay() {	
		return "I am a project repository.";
	}
	
}
