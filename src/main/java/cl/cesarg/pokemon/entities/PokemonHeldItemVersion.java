package cl.cesarg.pokemon.entities;

import java.util.List;

public class PokemonHeldItemVersion {
    private List<PokemonSimple> Version;
    private int rarity;

    public List<PokemonSimple> getVersion() {
        return Version;
    }

    public void setVersion(List<PokemonSimple> version) {
        Version = version;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }
}
