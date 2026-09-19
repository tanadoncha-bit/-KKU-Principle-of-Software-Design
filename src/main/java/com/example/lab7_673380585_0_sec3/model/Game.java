package com.example.lab7_673380585_0_sec3.model;

import com.example.lab7_673380585_0_sec3.strategy.DiscountContext;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String genre;

    private String platform;

    private Double rating;

    private LocalDate releaseDate;

    private Double price;

    private String discountType;

    public Game() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getDiscountName() {

        switch (discountType) {
            case "STUDENT":
                return "ส่วนลดนักศึกษา 10%";

            case "SEASONAL":
                return "ส่วนลดเทศกาล 20%";

            default:
                return "ราคาปกติ";
        }

    }

    public Double getFinalPrice() {
        DiscountContext context = new DiscountContext();
        return context.calculate(price, discountType);

    }
}