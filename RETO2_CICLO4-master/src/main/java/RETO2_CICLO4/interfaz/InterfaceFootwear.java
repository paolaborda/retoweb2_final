/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RETO2_CICLO4.interfaz;

import RETO2_CICLO4.modelo.Footwear;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author ander
 */
public interface InterfaceFootwear extends MongoRepository<Footwear, String>{
    
}
