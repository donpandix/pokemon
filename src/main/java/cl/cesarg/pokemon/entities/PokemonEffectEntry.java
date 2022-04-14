package cl.cesarg.pokemon.entities;

import java.util.List;

public class PokemonEffectEntry {

    private List<PokemonEntry> effect_entries;

    private PokemonSimple version_group;


    public List<PokemonEntry> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<PokemonEntry> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public PokemonSimple getVersion_group() {
        return version_group;
    }

    public void setVersion_group(PokemonSimple version_group) {
        this.version_group = version_group;
    }
}
