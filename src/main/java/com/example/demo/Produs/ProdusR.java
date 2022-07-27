package com.example.demo.Produs;

import org.springframework.stereotype.Repository;

@Repository
public interface ProdusR extends JpaRepository<Produs, Long> {

	void get();
	Iterable<Produs> findAll();

	Object findById(Long id);

	void save(Produs produs);

	void deleteById(Long id);

}