package search;

import article.Article;

public class SearchEngine {
    private Searchable[] searchables;

    public SearchEngine(int search){
        searchables = new Searchable[search];
    }

    public Searchable[] search(String search){
        Searchable[] result = new Searchable[5];
        int count = 0;
        for (int i = 0; i < searchables.length; i++) {
            if (searchables[i] != null){
                String term = searchables[i].searchTerm();
                if (term.contains(search)){
                    result[count] = searchables[i];
                    count++;

                    if (count == 5){
                        break;
                    }
                }
            }
        }
        return result;
    }

    public void add(Searchable searchable){
        for (int i = 0; i < searchables.length; i++) {
            if (searchables[i] == null){
                searchables[i] = searchable;
                return;
            }
        }
        System.out.println("Поисковый движок переполнен!");
    }

}
