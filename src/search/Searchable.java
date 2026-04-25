package search;

public interface Searchable {
    String searchTerm();
    String searchContent();
    default String getStringRepresentation(){
        return "Имя: " + getName() + searchContent();
    }
    String getName();
}
