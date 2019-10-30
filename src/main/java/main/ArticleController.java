package main;

import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/articles")
    public List<Article> getArticleList()
    {
       return articleService.getArticleList();
    }
    @RequestMapping("/articles/{id}")
    public Article getArticles (@PathVariable String id)
    {
        return articleService.getArticles(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/articles")
    public void addArticles (@RequestBody Article article)
    {
        articleService.addArticles(article);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/articles{id}")
    public void updateArticle(@RequestBody Article article, @PathVariable String id)
    {
        articleService.updateArticle(article, id);
    }
}
