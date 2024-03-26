package com.java.zenyoga.service;

import com.java.zenyoga.model.Institute;
import com.java.zenyoga.repository.InstituteRepository;

import lombok.RequiredArgsConstructor;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@SuppressWarnings("null")
public class InstituteService {

    private final InstituteRepository instituteRepository;

    

    public Institute createInstitute(Institute institute) {
        return instituteRepository.save(institute);
    }

    public Optional<Institute> getInstituteById(String instituteId) {
        return instituteRepository.findById(instituteId);
    }

    public Optional<Institute> updateInstitute(String instituteId, Institute newInstitute) {
        return instituteRepository.findById(instituteId)
                .map(existingInstitute -> {
                    existingInstitute.setInstituteName(newInstitute.getInstituteName());
                    existingInstitute.setInstituteDescription(newInstitute.getInstituteDescription());
                    existingInstitute.setInstituteAddress(newInstitute.getInstituteAddress());
                    existingInstitute.setMobile(newInstitute.getMobile());
                    existingInstitute.setEmail(newInstitute.getEmail());
                    return instituteRepository.save(existingInstitute);
                });
    }

    public boolean deleteInstitute(String instituteId) {
        Optional<Institute> instituteOptional = instituteRepository.findById(instituteId);
        if (instituteOptional.isPresent()) {
            instituteRepository.deleteById(instituteId);
            return true;
        }
        return false;
    }

    public List<Institute> getAllInstitutes() {
        return instituteRepository.findAll();
    }
}
