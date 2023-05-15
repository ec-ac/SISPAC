package com.uam.SISPAC.repository;


import com.uam.SISPAC.model.RequestLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryRequestLoan extends JpaRepository<RequestLoan, String> {

}