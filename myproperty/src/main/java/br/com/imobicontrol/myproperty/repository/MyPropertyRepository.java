package br.com.imobicontrol.myproperty.repository;

import br.com.imobicontrol.myproperty.model.MyProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyPropertyRepository extends JpaRepository<MyProperty, Long>
{
}
