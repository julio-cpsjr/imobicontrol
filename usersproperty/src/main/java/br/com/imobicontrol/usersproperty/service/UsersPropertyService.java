package br.com.imobicontrol.usersproperty.service;


import br.com.imobicontrol.usersproperty.model.UsersProperty;
import br.com.imobicontrol.usersproperty.repository.UsersPropertyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersPropertyService {

    private UsersPropertyRepository usersPropertyRepository;

    public UsersPropertyService(UsersPropertyRepository usersPropertyRepository) {
        this.usersPropertyRepository = usersPropertyRepository;
    }

    public UsersProperty save(UsersProperty usersProperty) {
        return usersPropertyRepository.save(usersProperty);
    }

    public UsersProperty findById(Long id){
        return usersPropertyRepository.findById(id).orElseThrow();
    }

    public List<UsersProperty> findAll(){
        return usersPropertyRepository.findAll();
    }

    public void deleteById(Long id){
        usersPropertyRepository.deleteById(id);
    }

    public UsersProperty update(Long id, UsersProperty usersProperty){
        usersProperty.setName(usersProperty.getName());
        usersProperty.setEmail(usersProperty.getEmail());
        usersProperty.setAddress(usersProperty.getAddress());
        usersProperty.setPhone(usersProperty.getPhone());

        usersProperty.setNameGuarantor(usersProperty.getNameGuarantor());
        usersProperty.setEmailGuarantor(usersProperty.getEmailGuarantor());
        usersProperty.setPhoneGuarantor(usersProperty.getPhoneGuarantor());

        return usersPropertyRepository.save(usersProperty);

    }
}
