package softuni.springcardemo.data.service.services;

import softuni.springcardemo.data.service.models.CarsServiceModels;

import java.util.List;

public interface CarService {

    CarsServiceModels save(CarsServiceModels model);
    List<CarsServiceModels> getCars();

}
