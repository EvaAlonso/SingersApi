package com.example.singers.rest;

import com.example.singers.entity.Singer;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
