package com.mc.vendasonline.repository.mongoRepo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mc.vendasonline.domain.ClienteM;

public interface IClienteRepositoryM extends MongoRepository<ClienteM, String>{

}
