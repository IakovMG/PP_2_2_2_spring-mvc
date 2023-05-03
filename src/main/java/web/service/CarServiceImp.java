package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars;
    private static int count;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++count, "Aston Martin", 1962));
        cars.add(new Car(++count, "Ford", 1863));
        cars.add(new Car(++count, "Alfa Romeo", 1910));
        cars.add(new Car(++count, "Ferrari", 1898));
        cars.add(new Car(++count, "Citroen", 2012));


    }


    @Override
    public List<Car> getListCars() {
        return cars;
    }

    @Override
    public List<Car> getListCarsByCount(List<Car> cars, int count) {
        return (count >= 5) ? cars : cars.stream().limit(count).toList();
    }
}
