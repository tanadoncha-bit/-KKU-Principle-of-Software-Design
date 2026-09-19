package com.example.coffee.Service;

import com.example.coffee.Model.Coffee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {

    private List<Coffee> coffees = new ArrayList<>();

    public CoffeeService() {

        coffees.add(new Coffee(1L, "Espresso", 45));
        coffees.add(new Coffee(2L, "Latte", 55));

    }

    public List<Coffee> getAllCoffee() {
        return coffees;
    }

    public Coffee getCoffeeById(Long id) {

        for (Coffee coffee : coffees) {

            if (coffee.getId().equals(id)) {
                return coffee;
            }

        }

        return null;
    }

    public Coffee addCoffee(Coffee coffee) {

        Long newId = (long) (coffees.size() + 1);

        coffee.setId(newId);

        coffees.add(coffee);

        return coffee;
    }

    public Coffee updateCoffee(Long id, Coffee newCoffee) {

        for (Coffee coffee : coffees) {

            if (coffee.getId().equals(id)) {

                coffee.setName(newCoffee.getName());
                coffee.setPrice(newCoffee.getPrice());

                return coffee;
            }

        }

        return null;
    }

    public boolean deleteCoffee(Long id) {

        for (Coffee coffee : coffees) {

            if (coffee.getId().equals(id)) {

                coffees.remove(coffee);
                return true;

            }

        }

        return false;
    }

    // Ex Bonus
    public List<Coffee> searchByName(String name) {

        List<Coffee> result = new ArrayList<>();

        for (Coffee coffee : coffees) {

            if (coffee.getName().toLowerCase()
                    .contains(name.toLowerCase())) {

                result.add(coffee);

            }

        }

        return result;
    }

}