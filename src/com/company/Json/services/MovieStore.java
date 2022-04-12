package com.company.Json.services;

import com.company.Json.interfaces.SortAble;
import com.company.Json.models.Director;
import com.company.Json.models.Movies;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStore implements SortAble {

    @Override
    public void printAllMovies(List<Movies> movies) {
        movies.stream().forEach(System.out::println);
    }


    @Override
    public void findMovie(List<Movies> movies, String input) {
        Movies movie = movies.stream()
                .filter(m -> m.getName().equalsIgnoreCase(input))
                .findFirst().orElseThrow(() -> new RuntimeException(
                        "movie with name = " + input + " does not exists"
                ));
        System.out.println(movie);
    }

    @Override
    public void sortByYear(List<Movies> movies) {
        movies.stream().sorted(Comparator.comparing(Movies::getYear)).forEach(System.out::println);
    }

    @Override
    public void sortByName(List<Movies> movies) {
        movies.stream().sorted(Comparator.comparing(Movies::getName)).forEach(System.out::println);
    }

    @Override
    public void sortByDirector(List<Movies> movies) {
        Map<Director, List<Movies>> classificationListMap = movies.stream().collect(Collectors.groupingBy(Movies::getDirector));
        List <Director> directors = new ArrayList<>();
        directors.addAll(classificationListMap.keySet());
        directors.stream().sorted(Comparator.comparing(Director::getFullName)).forEach(System.out::println);
    }
}
