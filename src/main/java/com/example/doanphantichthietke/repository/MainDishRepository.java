package com.example.doanphantichthietke.repository;

import com.example.doanphantichthietke.model.MainDish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MainDishRepository extends JpaRepository<MainDish, Long> {
}
