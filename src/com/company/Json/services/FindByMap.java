package com.company.Json.services;

import com.company.Json.interfaces.FindAble;
import com.company.Json.models.Cast;
import com.company.Json.models.Movies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindByMap implements FindAble {
    @Override
    public void findMoviesByActor(List<Movies> movies, String actorName) {
        movies.stream().filter(movies1 -> movies1.getCast().stream().anyMatch(cast -> cast.getFullName()
                        .equalsIgnoreCase(actorName)))
                .forEach(System.out::println);
    }

    @Override
    public void findMoviesByDirector(List<Movies> movies, String directorMovie) {
        movies.stream().filter(movies1 -> movies1.getDirector().getFullName().equalsIgnoreCase(directorMovie))
                .forEach(System.out::println);
    }

    @Override
    public void findMoviesByYear(List<Movies> movies, int name) {
        movies.stream().filter(movies1 -> movies1.getYear() == name).forEach(System.out::println);
    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies, String actorName) {
        Movies movies1 = (Movies) movies.stream().filter(m -> m.getCast().stream().anyMatch(cast -> cast.getFullName()
                        .equalsIgnoreCase(actorName))).map(Movies::getCast);
        System.out.println(movies1);
    }

    @Override
    public void showActorRoles(List<Movies> movies) {
        List<Cast> allCasts = new ArrayList<>();
        movies.forEach(movie -> allCasts.addAll(movie.getCast()));

        allCasts.stream()
                .sorted(Comparator.comparing(Cast::getFullName))
                .forEach(System.out::println);
    }
}
