package com.mackenzie.demo.repository;

import com.mackenzie.demo.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin, Long> {

}
