package bg.softuni.pathfinder.model;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.springframework.aop.scope.ScopedObject;

import javax.persistence.*;

@Entity
@Table(name = "pictures")
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String url;

    @ManyToOne
    private User author;

    @OneToOne(mappedBy = "header")
    private Route route;

    public Picture() {}

    public long getId() {
        return id;
    }

    public Picture setId(long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Picture setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Picture setUrl(String url) {
        this.url = url;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Picture setAuthor(User author) {
        this.author = author;
        return this;
    }

    public Route getRoute() {
        return route;
    }

    public Picture setRoute(Route route) {
        this.route = route;
        return this;
    }
}
