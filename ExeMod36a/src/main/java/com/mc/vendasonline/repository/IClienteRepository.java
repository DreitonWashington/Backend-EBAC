package com.mc.vendasonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mc.vendasonline.domain.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long>{

}
