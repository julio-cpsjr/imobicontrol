package br.com.imobicontrol.rentals.service;

import br.com.imobicontrol.rentals.models.Rentals;
import br.com.imobicontrol.rentals.repository.RentalsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalsService {


    private RentalsRepository rentalsRepository;
    public RentalsService(RentalsRepository rentalsRepository) {
        this.rentalsRepository = rentalsRepository;
    }

    public Rentals save(Rentals rentals) {
        return rentalsRepository.save(rentals);
    }

    public List<Rentals> findAll() {
        return rentalsRepository.findAll();
    }
    public Rentals findById(long id) {
        return rentalsRepository.findById(id).orElseThrow();
    }

    public void delete(long id) {
        rentalsRepository.deleteById(id);
    }

    public Rentals update(long id, Rentals rentals) {
        rentals.setId(id);
        rentals.setNameUsers(rentals.getNameUsers());
        rentals.setNameProperty(rentals.getNameProperty());

        rentals.setDateStart(rentals.getDateStart());
        rentals.setDateEnd(rentals.getDateEnd());

        rentals.setCleaningSupplies(rentals.getCleaningSupplies());
        rentals.setPestControl(rentals.getPestControl());

        rentals.setPrice(rentals.getPrice());
        rentals.setIgpm(rentals.getIgpm());
        rentals.setFees(rentals.getFees());
        rentals.setDiscount(rentals.getDiscount());
        rentals.setFreeNegotiation(rentals.getFreeNegotiation());

        rentals.setIptu(rentals.getIptu());
        rentals.setGarbageFee(rentals.getGarbageFee());

        rentals.setTotal(rentals.getTotal());


        return rentalsRepository.save(rentals);
    }
}
