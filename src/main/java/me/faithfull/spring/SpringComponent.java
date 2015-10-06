package me.faithfull.spring;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.faithfull.spring.interfaces.DomainRepository;
import me.faithfull.spring.pojo.Project;

@Component
public class SpringComponent {

    Log log = LogFactory.getLog(SpringComponent.class);
	
	@Autowired
	DomainRepository<Project> projectRepo;
	
	@PostConstruct
	public void init() {
		log.info("Hello!");
		log.info(projectRepo);
	}
}
