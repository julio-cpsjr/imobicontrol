package br.com.imobicontrol.usersproperty.controller;


import br.com.imobicontrol.usersproperty.model.UsersProperty;
import br.com.imobicontrol.usersproperty.service.UsersPropertyService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="Users Property", description="Users who live in the residence ")
@RequestMapping("/users")
public class UsersPropertyController {

    private final UsersPropertyService usersPropertyService;
    public UsersPropertyController(UsersPropertyService usersPropertyService) {
        this.usersPropertyService = usersPropertyService;
    }

    @PostMapping
    public UsersProperty create(@RequestBody UsersProperty usersProperty){
        return usersPropertyService.save(usersProperty);
    }

    @GetMapping
    public List<UsersProperty> findAll(){
        return usersPropertyService.findAll();
    }

    @GetMapping("/{id}")
    public UsersProperty findById(@PathVariable Long id){
        return usersPropertyService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        usersPropertyService.deleteById(id);
    }
    @PutMapping("/{id}")
    public UsersProperty update(@PathVariable Long id, @RequestBody UsersProperty usersProperty){
        return usersPropertyService.update(id, usersProperty);
    }
}
