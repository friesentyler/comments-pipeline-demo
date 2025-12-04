
package edu.shadsluiter.comments.model;

import java.time.LocalDateTime;

public class AppComment {
    private int id;
    private String author;
    private String content;
    private LocalDateTime createdAt;   // NEW FIELD

    // Full constructor
    public AppComment(int id, String author, String content, LocalDateTime createdAt) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.createdAt = createdAt;
    }

    // Backwards-compatible constructor used in your DAO:
    // AppComment(int, String, String)
    public AppComment(int id, String author, String content) {
        this(id, author, content, LocalDateTime.now());
    }

    // Convenience constructor used when id will be set later in DAO
    public AppComment(String author, String content) {
        this(0, author, content, LocalDateTime.now());
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
