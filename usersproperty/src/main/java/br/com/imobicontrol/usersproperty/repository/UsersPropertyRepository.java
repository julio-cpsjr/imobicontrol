package br.com.imobicontrol.usersproperty.repository;

import br.com.imobicontrol.usersproperty.model.UsersProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersPropertyRepository extends JpaRepository <UsersProperty, Long> {
}
