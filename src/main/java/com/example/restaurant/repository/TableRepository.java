package com.example.restaurant.repository;

import com.example.restaurant.entity.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface TableRepository extends CrudRepository<Table,Long> {




}
