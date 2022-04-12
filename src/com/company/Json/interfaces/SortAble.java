package com.company.Json.interfaces;

import com.company.Json.enums.SortType;
import com.company.Json.models.Movies;

import java.util.List;

public interface SortAble {

    void printAllMovies(List<Movies> movies);

    void findMovie(List<Movies> movies, String input);

    void sortByYear(List<Movies> movies);

    void sortByName(List<Movies> movies);

    void sortByDirector(List<Movies> movies);
}
