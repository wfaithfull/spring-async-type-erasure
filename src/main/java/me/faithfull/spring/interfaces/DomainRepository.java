package me.faithfull.spring.interfaces;

import org.springframework.scheduling.annotation.Async;

public interface DomainRepository<T> {

	// Simply remove this annotation, and the problem disappears.
	@Async
	public T add(T entity);
	
}
