package com.raman.multipledb.repository.sales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raman.multipledb.entity.sales.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
