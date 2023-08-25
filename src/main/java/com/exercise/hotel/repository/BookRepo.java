package com.exercise.hotel.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.exercise.hotel.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
