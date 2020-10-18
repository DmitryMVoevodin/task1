public class Main {

    public static void spisokKnigZadannogoAvtora(Book[] books, String author){
        for(Book book : books){
            for(String auth : book.getAuthors()){
                if(auth.equals(author)) {
                    System.out.println(book);
                    break;
                }
            }
        }
    }

    public static void spisokKnigZadannogoIzdatelstva(Book[] books, String publishingHouse){
        for(Book book : books){
            if(book.getPublishingHouse().equals(publishingHouse)) {
                System.out.println(book);
            }
        }
    }

    public static void spisokKnigPosleZadannogoGoda(Book[] books, int year){
        for(Book book : books){
            if(book.getYear()>=year) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0]=new Book(0, "Vojna i mir", new String[]{"Tolstoj"}, "Repka", 2014, 1000, 300, "magkiy");
        books[1]=new Book(1, "12 stulev", new String[]{"Ilf", "Petrov"}, "Apple", 2015, 300, 100, "zeskiy");
        books[2]=new Book(2, "Idiot", new String[]{"Dostoevskiy"}, "Repka", 2013, 500, 200, "magkiy");
        books[3]=new Book(3, "Prestuplenie i nakazanie", new String[]{"Dostoevskiy"}, "Apple", 2014, 250, 100, "magkiy");
        System.out.println("spisok knig zadannogo avtora:");
        spisokKnigZadannogoAvtora(books,"Dostoevskiy");
        System.out.println("spisok knig zadannogo izdatelstva:");
        spisokKnigZadannogoIzdatelstva(books,"Apple");
        System.out.println("spisok knig posle zadannogo goda:");
        spisokKnigPosleZadannogoGoda(books,2015);
    }
}
