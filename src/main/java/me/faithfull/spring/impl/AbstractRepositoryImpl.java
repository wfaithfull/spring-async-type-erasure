package me.faithfull.spring.impl;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import me.faithfull.spring.interfaces.DomainRepository;

public abstract class AbstractRepositoryImpl<T> implements DomainRepository<T> {
	
	Log log = LogFactory.getLog(AbstractRepositoryImpl.class);
	
	@Autowired
	private Random r;

	@Override
	public T add(T entity) {
		return entity;
	}
	
	@PostConstruct
	public void sayRandomThing() {
		log.info(whatToSay() + " " + r.nextLong());
	}
	
	public abstract String whatToSay();
}
