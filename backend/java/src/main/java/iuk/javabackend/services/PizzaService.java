package iuk.javabackend.services;

import iuk.javabackend.entities.Pizza;
import iuk.javabackend.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public Pizza getPizzaByID(long id) {
        return pizzaRepository.findById(id).orElseThrow();
    }

    public List<Pizza> getPizzas() {
        return pizzaRepository.findAll();
    }

    public void putExamplePizza() {
        pizzaRepository.save(new Pizza("Hans Wurst Pizza", 69, 420));

    }

}
