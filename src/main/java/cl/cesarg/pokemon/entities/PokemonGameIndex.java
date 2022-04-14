package cl.cesarg.pokemon.entities;

public class PokemonGameIndex {
    private int game_index;
    private PokemonSimple version;

    public int getGame_index() {
        return game_index;
    }

    public void setGame_index(int game_index) {
        this.game_index = game_index;
    }

    public PokemonSimple getVersion() {
        return version;
    }

    public void setVersion(PokemonSimple version) {
        this.version = version;
    }
}
