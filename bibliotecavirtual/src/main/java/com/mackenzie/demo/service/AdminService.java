package com.mackenzie.demo.service;

import com.mackenzie.demo.PraticaprofissionalApplication;
import com.mackenzie.demo.domain.Admin;
import com.mackenzie.demo.domain.dto.AdminDTO;
import com.mackenzie.demo.exception.PraticaprofissionalException;
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

    public Admin updateAdmin (Long id, AdminDTO adminDTO) {
        log.info("Try to update admin for name {}", adminDTO.getNome());
        Optional<Admin> admin = adminRepository.findById(id);
        Admin admintoSave = admin.get();

        return adminRepository.save(updateParams(admintoSave, adminDTO));
    }

    private Admin updateParams(Admin admin, AdminDTO adminDTO){
        admin.setEmail(adminDTO.getEmail());
        admin.setNome(adminDTO.getNome());
        admin.setSenha(adminDTO.getSenha());
        admin.setTelefone(adminDTO.getTelefone());

        return admin;

    }


}
