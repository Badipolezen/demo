package softuni.springcardemo.data.service.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.springcardemo.data.models.Car;
import softuni.springcardemo.data.repository.CarRepository;
import softuni.springcardemo.data.service.models.CarsServiceModels;
import softuni.springcardemo.data.service.services.CarService;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CarServiceImpl(CarRepository carRepository, ModelMapper modelMapper) {
        this.carRepository = carRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CarsServiceModels save(CarsServiceModels model) {
        this.carRepository.save(this.modelMapper.map(model, Car.class));
        return model;
    }

    @Override
    public List<CarsServiceModels> getCars() {
        return this.carRepository.findAll()
                .stream()
                .map(c->this.modelMapper.map(c,CarsServiceModels.class))
                .collect(Collectors.toList());
    }
}
