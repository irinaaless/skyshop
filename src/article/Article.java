package article;


import search.Searchable;

public class Article implements Searchable {
    private String title;
    private String text;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Название статьи: " + title + "\n"
                + "Текст статьи: " + text;
    }

    @Override
    public String searchTerm() {
        return title + " " + text;
    }

    @Override
    public String searchContent() {
        return "ARTICLE";
    }

    @Override
    public String getName() {
        return title;
    }
}
