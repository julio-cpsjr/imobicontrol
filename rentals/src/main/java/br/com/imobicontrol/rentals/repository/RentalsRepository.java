package br.com.imobicontrol.rentals.repository;

import br.com.imobicontrol.rentals.models.Rentals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalsRepository extends JpaRepository<Rentals, Long> {
}
