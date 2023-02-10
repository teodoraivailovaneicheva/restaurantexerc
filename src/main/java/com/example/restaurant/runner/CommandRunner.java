package com.example.restaurant.runner;

import com.example.restaurant.entity.Table;
import com.example.restaurant.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CommandRunner implements CommandLineRunner {
    @Autowired
    TableRepository tableRepository;

    @Override
    public void run(String... args) throws Exception {

        createTable();
        getTable();
    }

    public void createTable(){
        Table table = new Table();
        table.setChairs(4);
        table.setType("VIP");
        table.setZone("Terrace");

        tableRepository.save(table);
    }

    public void getTable(){
        Optional<Table> table = tableRepository.findById(1L);
        table.ifPresent(System.out::println);
    }
}
