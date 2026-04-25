package search;

import exception.BestResultNotFound;

import java.util.LinkedList;
import java.util.List;

public class SearchEngine {
    private final List<Searchable> searchables;

    public SearchEngine(){
        searchables = new LinkedList<>();
    }

    public List<Searchable> search(String term) {
        List<Searchable> result = new LinkedList<>();
        for(Searchable searchable : searchables){
            if (searchable !=null && searchable.searchTerm().contains(term)){
                result.add(searchable);
            }
        }
        return result;
    }

    public void add(Searchable searchable){
        searchables.add(searchable);
    }

    public Searchable bestFoundMatch(String search) throws BestResultNotFound {
        Searchable searchable = null;
        int maxCount = 0;
        for (Searchable s : searchables) {
            if (s != null) { // Добавлена проверка на null
                int count = 0;
                int index = 0;
                String searchTerm = s.searchTerm();
                if (s != null) {
                    int indexString = s.searchTerm().indexOf(search, index);

                    while (indexString != -1) {
                        count++;
                        index = indexString + search.length();
                        indexString = s.searchTerm().indexOf(search, index);
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    searchable = s;
                }
            }
        }
        if (maxCount == 0) {
            throw new BestResultNotFound
                    ("Не найдено подходящих результатов для запроса: " + search);
        }
        return searchable;
    }


}
