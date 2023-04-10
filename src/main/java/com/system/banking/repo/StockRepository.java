package com.system.banking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.banking.models.Stocks;

@Repository
public interface StockRepository extends JpaRepository<Stocks,Long> {

}
