package com.Anslem;

public class Book
{

    public Book(String title, String author, String publisher, String copyright_date)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyright_date = copyright_date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "\ntitle='" + title + '\'' +
                ", \nauthor='" + author + '\'' +
                ", \npublisher='" + publisher + '\'' +
                ", \ncopyright_date='" + copyright_date + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCopyright_date() {
        return copyright_date;
    }

    public void setCopyright_date(String copyright_date) {
        this.copyright_date = copyright_date;
    }

    String
    title,
    author,
    publisher,
    copyright_date;

}
