package com.example.coffee.Controller;

import com.example.coffee.Model.Coffee;
import com.example.coffee.Service.CoffeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    private final CoffeeService service;

    public CoffeeController(CoffeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Coffee> getAllCoffee() {

        return service.getAllCoffee();

    }

    @GetMapping("/{id}")
    public Coffee getCoffee(@PathVariable Long id) {

        return service.getCoffeeById(id);

    }

    // Ex Bonus
    @GetMapping("/search")
    public List<Coffee> searchCoffee(@RequestParam String name) {
        return service.searchByName(name);

    }

    @PostMapping
    public Coffee addCoffee(@RequestBody Coffee coffee) {

        return service.addCoffee(coffee);

    }

    @PutMapping("/{id}")
    public Coffee updateCoffee(@PathVariable Long id, @RequestBody Coffee coffee) {

        return service.updateCoffee(id, coffee);

    }

    @DeleteMapping("/{id}")
    public String deleteCoffee(@PathVariable Long id) {

        if (service.deleteCoffee(id)) {
            return "Delete Success";
        }

        return "Coffee Not Found";
    }

}
