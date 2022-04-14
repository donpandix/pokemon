package cl.cesarg.pokemon.entities;

public class PokemonSimple {

    private String name;

    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(  "PokemonSimple [name = '"+this.name+"',");
        sb.append("url='"+this.url+"']");
        return sb.toString();
    }

}
