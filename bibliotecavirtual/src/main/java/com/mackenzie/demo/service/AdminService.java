package com.mackenzie.demo.service;

import com.mackenzie.demo.domain.Admin;
import com.mackenzie.demo.domain.dto.AdminDTO;
import com.mackenzie.demo.repository.AdminRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin registerAdmin (AdminDTO adminDTO){
        log.info("Try to register admin for name {}", adminDTO.getNome());
        return adminRepository.save(adminDTO.mapToEntity());

    }

    public Optional<Admin> getAdmin(long id){
        log.info("Try to get admin for id{}", id);
        return adminRepository.findById(id);

    }

    public void deleteAdmin (Long id){
        log.info("Try to delete admin for id {}", id);
        adminRepository.deleteById(id);
    }

    public Admin updateAdmin (AdminDTO adminDTO){
        log.info("Try to update admin for name {}", adminDTO.getNome());
        return adminRepository.save(adminDTO.mapToEntity());
    }
}
