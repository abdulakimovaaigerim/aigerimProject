import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;
import service.impl.BookServiceImpl;
import service.impl.UserServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Scanner num = new Scanner(System.in);

    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.


        ArrayList<Book> list = new ArrayList<>(Arrays.asList(
        new Book(1L, "Birinchi mugalim", Genre.ROMANCE, new BigDecimal(2500),
                "Chyngyz Aitmatov", Language.ENGLISH, LocalDate.ofYearDay(1996, 12))));
         new Book(2L, "Мен айылга келгенде", Genre.DETECTIVE, new BigDecimal(2650),
                "Barby Alykulov", Language.RUSSIAN, LocalDate.ofYearDay(1995, 23));
         new Book(3L, "Kyzyl jooluk jaljalym", Genre.DETECTIVE, new BigDecimal(2340),
                "Chungyz Aitmatov", Language.ENGLISH, LocalDate.ofYearDay(2003, 12));
         new Book(4L, "Kyzyl alma", Genre.DETECTIVE, new BigDecimal(3450),
                "Chungyz Aitmatov", Language.RUSSIAN, LocalDate.ofYearDay(1997, 13));
         new Book(5L, "Maisalbektin katy", Genre.ROMANCE, new BigDecimal(6700),
                "Chyngyz Aitmatov", Language.ENGLISH, LocalDate.ofYearDay(1995, 14));



         ArrayList<User> list1 = new ArrayList<>(Arrays.asList(
         new User(6L, "Aigerim", "Bektenova", "abdulakimova@email.com",
                "==96700875997",Gender.FEMALE,new BigDecimal(34000),list)));
         new User(7L, "Albina","Jamaldinova", "jamaldinova@email.com",
                 "+996700953426",Gender.FEMALE,new BigDecimal(35000),list);
        new User(8L, "Aidynai", "Ababakirova", "ababakirova@email.com",
                "==9670084768234",Gender.FEMALE,new BigDecimal(38000),list);
        new User(9L, "Jiko","Rajapov", "rajapov@email.com",
                "+996700342766",Gender.MALE,new BigDecimal(23000),list);
                new User(9L, "Ishak","Musurmankulov", "musurmankulov@email.com",
                        "+996700341298",Gender.MALE,new BigDecimal(34000),list);


        BookServiceImpl service = new BookServiceImpl();
        UserServiceImpl service1 = new UserServiceImpl();

        System.out.println("<<<Commands>>>");
        System.out.println("""
                 1-> createBooks,
                                
                 2-> getAllBooks,
                                
                  3-> getBooksByGenre,
                                
                  5-> removeBookById,
                                
                  6-> sortBooksByPriceInDescendingOrder,
                                
                  7-> filterBooksByPublishedYear,
                                
                  8-> getBookByInitialLetter,
                                
                  9-> maxPriceBook,
                                      
                """);


        while (true){
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    System.out.println(service.createBooks(list));
                case 2:
                    System.out.println(service.getAllBooks());
                case 3:

            }
        }


    }
}