package ru.netology.javaqa;

public class PosterManager {
    private int findLast = 10;
    private String[] films = new String[0];

    public PosterManager() {
    }

    public PosterManager(int findLast) {
        this.findLast = findLast;
    }

    public void setFilms(String[] films) {
        this.films = films;
    }

    public int getFindLast() {
        return findLast;
    }

    public void addNewFilm(String newFilm) {
        String[] tmp = new String[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = newFilm;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length > findLast) {
            resultLength = findLast;
        } else {
            resultLength = films.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

}
