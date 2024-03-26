package com.java.zenyoga.controller;

import com.java.zenyoga.model.Institute;
import com.java.zenyoga.service.InstituteService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/institutes")
@Tag(name="INSTITUTE")
public class InstituteController {

    private final InstituteService instituteService;

    

    @PostMapping("/create")
    // Create operation
    public ResponseEntity<Institute> createInstitute(@RequestBody Institute institute) {
        Institute newInstitute = instituteService.createInstitute(institute);
        return ResponseEntity.status(HttpStatus.CREATED).body(newInstitute);
    }

    // Read operation
    @GetMapping("/{instituteId}")
    public ResponseEntity<Institute> getInstituteById(@PathVariable String instituteId) {
        Optional<Institute> instituteOptional = instituteService.getInstituteById(instituteId);
        return instituteOptional.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update operation
    @PutMapping("/{instituteId}")
    public ResponseEntity<Institute> updateInstitute(@PathVariable String instituteId, @RequestBody Institute institute) {
        Optional<Institute> updatedInstitute = instituteService.updateInstitute(instituteId, institute);
        return updatedInstitute.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Delete operation
    @DeleteMapping("/{instituteId}")
    public ResponseEntity<String> deleteInstitute(@PathVariable String instituteId) {
        boolean deleted = instituteService.deleteInstitute(instituteId);
        if (deleted) {
            return ResponseEntity.ok("Institute deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // List all institutes
    @GetMapping("/all")
    public ResponseEntity<List<Institute>> getAllInstitutes() {
        List<Institute> institutes = instituteService.getAllInstitutes();
        return ResponseEntity.ok(institutes);
    }
}
