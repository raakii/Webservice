package DIC2.archi.webService.domain;

import jakarta.persistence.*;
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

    private Integer id;

    private String title;

    private String description;

    private String content;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
