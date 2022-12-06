import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("89990000001", "Светлана Петрова");
        phonebook.put("89990000002", "Анна Крутова");
        phonebook.put("89990000003", "Петр Чернышов");
        phonebook.put("89990000004", "Мария Федорова");
        phonebook.put("89990000005", "Анна Владимирова");
        phonebook.put("89990000006", "Петр Петин");
        phonebook.put("89990000007", "Мария Федорова");
        phonebook.put("89990000008", "Мария Рыкова");
        phonebook.put("89990000009", "Анна Владимирова");
        phonebook.put("89990000010", "Светлана Петрова");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фамилию и имя для поиска номера:");
        String nameSurname = scan.nextLine();
        for (Map.Entry<String, String> entry: phonebook.entrySet()){
            if (entry.getValue().equals(nameSurname)){
                System.out.println(entry.getKey());
            }
        }

    }
}
