package br.com.imobicontrol.myproperty.controller;


import br.com.imobicontrol.myproperty.model.MyProperty;
import br.com.imobicontrol.myproperty.service.MyPropertyService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="My Properties", description = "Control of Properties")
@RequestMapping("/myproperties")
public class MyPropertyController {

    public final MyPropertyService myPropertyService;
    public MyPropertyController(MyPropertyService myPropertyService) {
        this.myPropertyService = myPropertyService;
    }

    @PostMapping
    public MyProperty create(@RequestBody MyProperty myProperty){
        return myPropertyService.save(myProperty);
    }

    @GetMapping
    public List<MyProperty> findAll(){
        return myPropertyService.findAll();
    }

    @GetMapping("/{id}")
    public MyProperty findById(@PathVariable long id){
        return  myPropertyService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        myPropertyService.deleteById(id);
    }

    @PutMapping
    public MyProperty update(@PathVariable long id,@RequestBody MyProperty myProperty){
        return myPropertyService.update(id, myProperty);
    }
}
