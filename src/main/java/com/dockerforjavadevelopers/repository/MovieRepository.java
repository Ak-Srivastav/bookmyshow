package com.dockerforjavadevelopers.repository;

import com.dockerforjavadevelopers.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByCityId(Long cityId);
}
