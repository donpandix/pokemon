package cl.cesarg.pokemon.entities;

import java.util.List;

public class PokemonAbilityDetails {

    private List<PokemonEffectEntry> effect_changes;

    private List<PokemonEffect> effect_entries;

    private PokemonSimple generation;

    public List<PokemonEffectEntry> getEffect_changes() {
        return effect_changes;
    }

    public void setEffect_changes(List<PokemonEffectEntry> effect_changes) {
        this.effect_changes = effect_changes;
    }

    public List<PokemonEffect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<PokemonEffect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public PokemonSimple getGeneration() {
        return generation;
    }

    public void setGeneration(PokemonSimple generation) {
        this.generation = generation;
    }
}
