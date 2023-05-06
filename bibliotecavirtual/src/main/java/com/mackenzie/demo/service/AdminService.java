package com.mackenzie.demo.service;

import com.mackenzie.demo.domain.Admin;
import com.mackenzie.demo.domain.dto.AdminDTO;
import com.mackenzie.demo.repository.AdminRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin registerAdmin (AdminDTO adminDTO){
        return adminRepository.save(adminDTO);
    }

    public Admin getAdmin(long id){
        return adminRepository.findAll(id);
    }

    public ResponseEntity deleteAdmin (long id){
        return adminRepository.delete(id);
    }

    public Admin updateAdmin (AdminDTO adminDTO){
        return adminRepository.save(adminDTO);
    }
}
