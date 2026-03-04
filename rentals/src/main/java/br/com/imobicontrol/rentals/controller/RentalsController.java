package br.com.imobicontrol.rentals.controller;


import br.com.imobicontrol.rentals.models.Rentals;
import br.com.imobicontrol.rentals.service.RentalsService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="Rentals", description = "Control Rentals")
@RequestMapping("/rentals")
public class RentalsController {

    public final RentalsService rentalsService;
    public RentalsController(RentalsService rentalsService) {
        this.rentalsService = rentalsService;
    }

    @PostMapping
    public Rentals save(@RequestBody Rentals rentals){
        return rentalsService.save(rentals);
    }

    @GetMapping
    public List<Rentals> findAll(){
        return rentalsService.findAll();
    }

    @GetMapping("/{id}")
    public Rentals findById(@PathVariable long id){
        return rentalsService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        rentalsService.delete(id);
    }

    @PutMapping("/{id}")
    public Rentals update(@PathVariable Long id, @RequestBody Rentals rentals){
        return rentalsService.update(id,rentals);
    }
}
