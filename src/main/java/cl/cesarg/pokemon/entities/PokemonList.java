package cl.cesarg.pokemon.entities;

import java.util.List;

public class PokemonList {

    private int count;

    private String next;

    private String previous;

    private List<PokemonSimple> results;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<PokemonSimple> getResults() {
        return results;
    }

    public void setResults(List<PokemonSimple> results) {
        this.results = results;
    }

}
