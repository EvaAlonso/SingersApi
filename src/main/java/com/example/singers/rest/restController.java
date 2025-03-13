package com.example.singers.rest;

import com.example.singers.entity.Singer;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")


public class restController {

    List<Singer> singerList;

    @PostConstruct
    public void loadData(){
        singerList = new ArrayList<>();

        singerList.add(new Singer(1, "Metallica", "", "Heavy"));
        singerList.add(new Singer(2, "Chayanne", "", "Pop"));
        singerList.add(new Singer(3, "Snoop Dogg", "", "Hip Hop"));
        singerList.add(new Singer(4, "Jerry ", "Rivera", "Salsa"));
    }
    @PostMapping("/singers")
    public Singer addSinger(@RequestBody Singer theSinger){
        singerList.add(theSinger);

        return theSinger;
    }
    @PutMapping("/singers")
    public Singer updateSinger(@RequestBody Singer theSinger){

        for (Singer singer : singerList) {
            if(singer.getId() == theSinger.getId()){
                singer.setName(theSinger.getName());
                singer.setSurname(theSinger.getSurname());
                singer.setGenre(theSinger.getGenre());
            }
        }

        return theSinger;
    }






    @DeleteMapping("/{singerId}")
    public String deleteSinger(@PathVariable int singerId){
        this.singerList.removeIf(s -> s.getId() == singerId);
        return "Acabo la funcion: "+ singerId;
    }

    @GetMapping("/singer/{singerId}")
    public Singer getId(@PathVariable int id){
        for(Singer singer: this.singerList){
            if(singer.getId() == id){
                return singer;
            }
        }
        return null;
    }

    @GetMapping("/singer/{singerId}")
    public String getHello(@PathVariable String name) {
        return "¡Hello, " + name + "! Welcome to Hit Parader.";
    }

}
