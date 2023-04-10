package com.system.banking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.banking.models.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Long>{

}
