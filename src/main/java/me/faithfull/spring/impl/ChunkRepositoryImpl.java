package me.faithfull.spring.impl;

import org.springframework.stereotype.Repository;

import me.faithfull.spring.pojo.Chunk;

@Repository
public class ChunkRepositoryImpl extends AbstractRepositoryImpl<Chunk> {

	@Override
	public String whatToSay() {	
		return "I am a chunk repository.";
	}

}
