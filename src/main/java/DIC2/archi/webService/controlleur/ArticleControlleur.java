package DIC2.archi.webService.controlleur;

import DIC2.archi.webService.domain.Article;
import DIC2.archi.webService.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/articles")
public class ArticleControlleur {
    private final ArticleService articleService;
    @GetMapping("/read")
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }
    @PostMapping("/create")
    public Article  createArticle(@RequestBody Article article) {
        return articleService.create(article);
    }

    @PutMapping("update/{id}")
    public Article updateArticle(@PathVariable Long id, @RequestBody Article article) {
        return articleService.update(id, article);
    }

    @DeleteMapping("delete/{id}")
    public String deleteArticle(@PathVariable long id) {
        return articleService.delete(id);
    }
}