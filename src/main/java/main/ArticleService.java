package main;

import model.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ArticleService {

    List<Article> articleList = new ArrayList<Article>(Arrays.asList(
            new Article("1", "Rishabh01", "New Description 1" ),
            new Article("2", "Rishabh02", "New Description 2" ),
            new Article("3", "Rishabh03", "New Description 3" )
    ));

    public List<Article> getArticleList(){
        return articleList;
    }

    public Article getArticles(String id)
    {
        return articleList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addArticles(Article article) {
        articleList.add(article);
    }

    public void updateArticle(Article art, String id) {
        for(int i = 0; i < articleList.size(); i++)
        {
            Article article = articleList.get(i);

            if(article.getId().equals(id))
            {
                articleList.set(i, art);
            }

        }
    }
}
