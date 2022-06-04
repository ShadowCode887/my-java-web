package bg.softuni.pathfinder.model;

import bg.softuni.pathfinder.model.enums.Level;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String gpxCoordinates;

    @Enumerated(EnumType.STRING)
    private Level level;

    private String name;

    @ManyToOne
    private User author;

    private String videoUrl;

    @OneToMany(targetEntity = Comments.class, mappedBy = "route", cascade = CascadeType.ALL)
    private Set<Comments> comments;

    @OneToOne
    private Picture header;

    public Route() {}

    public long getId() {
        return id;
    }

    public Route setId(long id) {
        this.id = id;
        return this;
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public Route setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
        return this;
    }

    public Level getLevel() {
        return level;
    }

    public Route setLevel(Level level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return name;
    }

    public Route setName(String name) {
        this.name = name;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Route setAuthor(User author) {
        this.author = author;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public Route setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public Set<Comments> getComments() {
        return comments;
    }

    public Route setComments(Set<Comments> comments) {
        this.comments = comments;
        return this;
    }

    public Picture getHeader() {
        return header;
    }

    public Route setHeader(Picture header) {
        this.header = header;
        return this;
    }
}
