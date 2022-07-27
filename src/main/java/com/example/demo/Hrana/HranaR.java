package com.example.demo.Hrana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository



public interface HranaR extends JpaRepository<Hrana, Long> {
}
