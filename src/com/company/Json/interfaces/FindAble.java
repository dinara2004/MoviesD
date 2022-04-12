package com.company.Json.interfaces;

import com.company.Json.models.Movies;

import java.util.List;

public interface FindAble {

    void findMoviesByActor(List<Movies> movies, String actorName);

    void findMoviesByDirector(List<Movies> movies, String directorMovie);

    void findMoviesByYear(List<Movies> movies, int name);

    void findMoviesAndRoleByActor(List<Movies> movies, String actorName);

    void showActorRoles(List<Movies> movies);
}
