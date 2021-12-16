/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RETO2_CICLO4.repositorio;

import RETO2_CICLO4.interfaz.InterfaceFootwear;
import RETO2_CICLO4.modelo.Footwear;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ander
 */
@Repository
public class FootwearRepositorio {
    @Autowired
    private InterfaceFootwear repository;
    
public List<Footwear> getAll() {
        return repository.findAll();
    }

    public Optional<Footwear> getFootwears(String reference) {
        return repository.findById(reference);
    }
    public Footwear create(Footwear Footwear) {
        return repository.save(Footwear);
    }

    public void update(Footwear Footwear) {
        repository.save(Footwear);
    }
    
    public void delete(Footwear Footwear) {
        repository.delete(Footwear);
    }
}
    
    
    

