package cl.cesarg.pokemon.entities;

public class PokemonType {

    private int slot;

    private PokemonSimple type;

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public PokemonSimple getType() {
        return type;
    }

    public void setType(PokemonSimple type) {
        this.type = type;
    }
}
