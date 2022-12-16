import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.

        List<Book>books=new ArrayList<>();
        BigDecimal decimal=new BigDecimal(5000);
        BigDecimal decimal2=new BigDecimal(4000);
        BigDecimal decimal3=new BigDecimal(7000);
        BigDecimal decimal4=new BigDecimal(2000);
        BigDecimal decimal5=new BigDecimal(1000);

        Book book=new Book(Long.decode("1"),"Белый пароход", Genre.HISTORICAL,decimal,"Чингиза Айтматова",Language.KYRGYZ,LocalDate.of(1970,11,3));
        Book book2=new Book(Long.decode("2"),"Гарри Поттер", Genre.FANTASY, decimal2,"Джоа́н Ро́улинг",Language.KYRGYZ,LocalDate.of(1950,12,2));
        Book book3=new Book(Long.decode("3"),"Кровавые годы", Genre.HISTORICAL,decimal3,"Аалы Токомбаева",Language.KYRGYZ,LocalDate.of(1960,11,2));
        Book book4=new Book(Long.decode("4"),"Среди гор", Genre.DETECTIVE,decimal4,"Тугельбая Сыдыкбекова",Language.KYRGYZ,LocalDate.of(1999,11,2));
        Book book5=new Book(Long.decode("5"),"Первый учитель", Genre.HISTORICAL,decimal5,"Чингиза Айтматова",Language.KYRGYZ,LocalDate.of(1955,11,2));

        books.add(book);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        for (Book a:books) {
            System.out.println(a+"\n");

        }


        BigDecimal money=new BigDecimal(10000);
        BigDecimal money2=new BigDecimal(10000);
        BigDecimal money3=new BigDecimal(10000);
        BigDecimal money4=new BigDecimal(10000);
        BigDecimal money5=new BigDecimal(10000);

        List<User>users=new ArrayList<>();
        User user1=new User(Long.decode("1"),"Davran","Joldoshbaev","davran@gmail.com","+996554162005",Gender.MALE,money,books);
        User user2=new User(Long.decode("2"),"Khafiz","Turusbek uulu","khafiz@gmail.com","+996500233450",Gender.MALE,money2,books);
        User user3=new User(Long.decode("3"),"Erjan","Talaibekov","erjan@gmail.com","+996704235647",Gender.MALE,money3,books);
        User user4=new User(Long.decode("4"),"Adilet","Kurmanov","adilet@gmail.com","+996999124332",Gender.MALE,money4,books);
        User user5=new User(Long.decode("5"),"Nuriza","Erkinbekova","nuriza@gmail.com","+996773342334",Gender.FEMALE,money5,books);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        for (User a:users) {
            System.out.println(a+"\n");

        }

    }
}