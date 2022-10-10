package com.reservation.repository;

import com.reservation.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
//    @Query("Select d from DOCTOR d where d.email =?1")
//    public Optional<Doctor> getDoctorByEmail(Doctor doc){
//        return findBy(doc);
//    }
}
