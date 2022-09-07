package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosterManagerTest {
    @Test
    public void shouldPosterManager() {
        PosterManager manager = new PosterManager(11);

        int expected = 11;
        int actual = manager.getFindLast();

        assertEquals(expected, actual);
    }

    @Test
    public void addNewFilm() {
        PosterManager manager = new PosterManager();
        manager.setFilms(new String[]{"Film1", "Film2", "Film3", "Film4"});
        manager.addNewFilm("Film5");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void moreFilmsThanFindLast() {
        PosterManager manager = new PosterManager(5);
        manager.setFilms(new String[]{"Film1", "Film2", "Film3", "Film4", "Film5", "Film6", "Film7"});

        String[] expected = {"Film7", "Film6", "Film5", "Film4", "Film3"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefaultQuantity() {
        PosterManager manager = new PosterManager();
        manager.setFilms(new String[]{"Film1", "Film2", "Film3", "Film4", "Film5", "Film6", "Film7"});

        String[] expected = {"Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        PosterManager manager = new PosterManager();
        manager.setFilms(new String[]{"Film1", "Film2", "Film3", "Film4", "Film5", "Film6", "Film7"});

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5", "Film6", "Film7",};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }
}