package com.Anslem;

public class BookShelf
{
    public static void main(String[] args)
    {
        returnSeveralBooks();
    }

    static void returnSeveralBooks()
    {
        Book mapsOfMeaning = new Book("Maps of Meaning: The Architecture of Belief",
                "Jordan B. Peterson",
                "Routledge; 1st Edition",
                "(March 24, 1999)");

        Book twelveRulesOfLife = new Book("12 Rules of Life",
                "Jordan B. Peterson",
                "Random House Canada",
                "January 23, 2018");

        Book politicalCorrectness = new Book("Political Correctness Gone Mad?",
                "Jordan B. Peterson, Stephen Fry, Michael Eric Dyson, Michelle Goldberg",
                "One World Publications",
                "November 1, 2018");

        Book peaceMaking = new Book("Peacemaking Among High Order Primates",
                "Jordan B. Peterson",
                "Independently Published",
                "October 7, 2018");

        Book[] theBooks = new Book[] {mapsOfMeaning,
                twelveRulesOfLife,
                politicalCorrectness,
                peaceMaking};

        for (Book b: theBooks)
        {
            System.out.println(b);
        }

    }

}
