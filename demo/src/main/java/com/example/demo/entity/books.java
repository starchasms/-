package com.example.demo.entity;

public class books {
    Integer bookId;
    String bookName;
    String author;
    String category;
    String press;
    Integer sum;
    Integer sumInw;
    String isbn;
    double price;
    double preferential;
    String bookUrl;



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

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getSumInw() {
        return sumInw;
    }

    public void setSumInw(Integer sumInw) {
        this.sumInw = sumInw;
    }

    public String getBookUrl() {
        return bookUrl;
    }

    public void setBookUrl(String bookUrl) {
        this.bookUrl = bookUrl;
    }

    @Override
    public String toString() {
        return "books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", press='" + press + '\'' +
                ", sum=" + sum +
                ", sumInw=" + sumInw +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", preferential=" + preferential +
                ", bookUrl='" + bookUrl + '\'' +
                '}';
    }
}
