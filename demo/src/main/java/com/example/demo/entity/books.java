package com.example.demo.entity;

public class books {
    Integer book_id;
    String book_name;
    String author;
    String category;
    String press;
    Integer sum;
    Integer sum_inw;
    String isbn;
    double price;
    double preferential;
    String book_url;

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getSum_inw() {
        return sum_inw;
    }

    public void setSum_inw(Integer sum_inw) {
        this.sum_inw = sum_inw;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPreferential() {
        return preferential;
    }

    public void setPreferential(double preferential) {
        this.preferential = preferential;
    }

    public String getBook_url() {
        return book_url;
    }

    public void setBook_url(String book_url) {
        this.book_url = book_url;
    }

    @Override
    public String toString() {
        return "books{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", press='" + press + '\'' +
                ", sum=" + sum +
                ", sum_inw=" + sum_inw +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", preferential=" + preferential +
                ", book_url='" + book_url + '\'' +
                '}';
    }
}
