package DIC2.archi.webService.domain;
<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Article")
@Getter
@Setter
@NoArgsConstructor
public class Article {
    @Id
    @SequenceGenerator(
            name = "article_seq",
            sequenceName = "article_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "article_seq"
    )
=======

public class Article {

>>>>>>> origin/main
    private Integer id;

    private String title;

    private String description;

    private String content;
<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
=======

    public Article() {
    }

    public Article(String title, String description, String content) {
        this.title = title;
        this.description = description;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
>>>>>>> origin/main
