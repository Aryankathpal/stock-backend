package com.system.banking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.banking.models.Sales;


@Repository
public interface SalesRepository extends JpaRepository<Sales,Long>{
}
