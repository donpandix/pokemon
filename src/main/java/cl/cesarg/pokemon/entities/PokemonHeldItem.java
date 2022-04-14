package cl.cesarg.pokemon.entities;

import java.util.List;

public class PokemonHeldItem {
    private PokemonSimple item;
    private List<PokemonHeldItemVersion> version_details;

    public PokemonSimple getItem() {
        return item;
    }

    public void setItem(PokemonSimple item) {
        this.item = item;
    }

    public List<PokemonHeldItemVersion> getVersion_details() {
        return version_details;
    }

    public void setVersion_details(List<PokemonHeldItemVersion> version_details) {
        this.version_details = version_details;
    }
}
