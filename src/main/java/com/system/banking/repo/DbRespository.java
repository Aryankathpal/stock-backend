package com.system.banking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.banking.models.Purchase;

@Repository
public interface DbRespository extends JpaRepository<Purchase,Long> {
}
