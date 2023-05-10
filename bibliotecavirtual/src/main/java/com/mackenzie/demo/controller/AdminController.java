package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Admin;
import com.mackenzie.demo.domain.dto.AdminDTO;
import com.mackenzie.demo.exception.PraticaprofissionalException;
import com.mackenzie.demo.service.AdminService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping()
    public Admin registerAdmin(@RequestBody AdminDTO adminDTO){
        return adminService.registerAdmin(adminDTO);
    }

    @GetMapping()
    public Optional<Admin> getAdmin (@RequestParam Long id){
        return adminService.getAdmin(id);
    }

    @PutMapping()
    public Admin updateAdmin(@RequestParam Long id , @RequestBody AdminDTO adminDTO)  {
        return adminService.updateAdmin(id, adminDTO);
    }

    @DeleteMapping()
    public ResponseEntity deleteAdmin (@RequestParam Long id){
        adminService.deleteAdmin(id);
        return ResponseEntity.noContent().build();
    }
}
