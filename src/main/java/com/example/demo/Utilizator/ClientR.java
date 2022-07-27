package com.example.demo.Utilizator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientR extends JpaRepository<Client, Long> {

	Client findByUsername(String username);
}

