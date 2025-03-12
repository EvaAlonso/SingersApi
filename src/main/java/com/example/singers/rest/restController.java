package com.example.singers.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class restController {






    @DeleteMapping("/{singerId}")
    public String deleteSinger(@PathVariable int singerId){
        this.SingerList.removeIf(s -> s.getId() == singerId);
        return "Acabo la funcion: "+ singerId;
    }
}
