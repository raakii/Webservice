package DIC2.archi.webService.domain;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Category")
@Getter
@Setter
@NoArgsConstructor
public class Category {
    @Id
    @SequenceGenerator(
            name = "cat_seq",
            sequenceName = "cat_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "cat_seq"
    )
    private Integer id;

    private String libelle;
    @OneToMany(mappedBy = "category")
    private List<Article> articles;

}
=======
public class Category {

    private Integer id;

    private String libelle;

    public Category() {
    }

    public Category(String libelle) {
        this.libelle = libelle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
>>>>>>> origin/main
