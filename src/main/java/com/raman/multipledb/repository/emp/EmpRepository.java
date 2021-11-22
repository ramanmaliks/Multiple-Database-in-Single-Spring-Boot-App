package com.raman.multipledb.repository.emp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raman.multipledb.entity.emp.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

}
