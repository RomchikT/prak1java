import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать!");

        Scanner deistvie = new Scanner(System.in);

        System.out.print("Введите фамилию: ");
        String familia = deistvie.nextLine();

        System.out.print("Введите имя: ");
        String imy = deistvie.nextLine();

        System.out.print("Введите отчество: ");
        String otchestvo = deistvie.nextLine();

        System.out.print("Введите дату рождения (P.S- дд.мм.гггг): ");
        String datarog = deistvie.nextLine();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthDate = LocalDate.parse(datarog, dateFormatter);

        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);

        if (age.getYears() < 18) {
            System.out.println("Сорян но, регистрация доступна только старше 18 лет.");
        } else {
            // Регистрация успешна
            System.out.println("Регистрация успешно завершена!");
            System.out.println("ФИО: " + familia + " " + imy + " " + otchestvo);
            System.out.println("Дата рождения: " + birthDate.format(dateFormatter));
        }
    }
}