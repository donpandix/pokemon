package cl.cesarg.pokemon.entities;

public class PokemonEffect {

    private String effect;

    private PokemonSimple language;

    private String short_effect;

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public PokemonSimple getLanguage() {
        return language;
    }

    public void setLanguage(PokemonSimple language) {
        this.language = language;
    }

    public String getShort_effect() {
        return short_effect;
    }

    public void setShort_effect(String short_effect) {
        this.short_effect = short_effect;
    }
}
