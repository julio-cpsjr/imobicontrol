package br.com.imobicontrol.myproperty.service;


import br.com.imobicontrol.myproperty.model.MyProperty;
import br.com.imobicontrol.myproperty.repository.MyPropertyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyPropertyService {

    public MyPropertyRepository myPropertyRepository;
    public MyPropertyService(MyPropertyRepository myPropertyRepository) {
        this.myPropertyRepository = myPropertyRepository;
    }

    public MyProperty save(MyProperty myProperty) {
        return myPropertyRepository.save(myProperty);
    }

    public MyProperty findById(long id) {
        return myPropertyRepository.findById(id).orElseThrow();
    }
    public List<MyProperty> findAll() {
        return myPropertyRepository.findAll();
    }
    public void deleteById(long id) {
        myPropertyRepository.deleteById(id);
    }
    public MyProperty update(long id, MyProperty myProperty) {
        myProperty.setId(id);
        myProperty.setName(myProperty.getName());
        myProperty.setAddress(myProperty.getAddress());
        myProperty.setFireDepartmentPermit(myProperty.getFireDepartmentPermit());
        myProperty.setMetric(myProperty.getMetric());
        myProperty.setInstalationLight(myProperty.getInstalationLight());
        myProperty.setInstalationWater(myProperty.getInstalationWater());
        myProperty.setRegistryOfficeRegistration(myProperty.getRegistryOfficeRegistration());

        return myPropertyRepository.save(myProperty);
    }
}
