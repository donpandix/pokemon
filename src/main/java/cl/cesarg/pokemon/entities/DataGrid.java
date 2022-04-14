package cl.cesarg.pokemon.entities;

import java.util.List;

public class DataGrid {

    private List<PokedexItem> data;

    private Integer total;

    private Integer actualPage;

    private Integer totalPages;


    public List<PokedexItem> getData() {
        return data;
    }

    public void setData(List<PokedexItem> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getActualPage() {
        return actualPage;
    }

    public void setActualPage(Integer actualPage) {
        this.actualPage = actualPage;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}
