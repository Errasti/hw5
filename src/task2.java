import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        HashMap<Integer, String> uncountedNames = new HashMap<>();
        HashMap<String, Integer> countedNames = new HashMap<>();
        int count = 0;
        String temp = "";
        String[] firstNames = new String[1];
        String[] names = new String[] {"Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
        "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
        "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        for(int i = 0; i < names.length; i++){
            firstNames = names[i].split(" ");
            uncountedNames.put(i, firstNames[0]);
        }
        System.out.println(uncountedNames);
        for (Map.Entry<Integer, String> entry: uncountedNames.entrySet()){
            temp = entry.getValue();
            count = 0;
            for (Map.Entry<Integer, String> entryTwo: uncountedNames.entrySet()){
                if(entryTwo.getValue().equals(temp)){
                    count++;
                }
            }
            countedNames.put(temp,count);
        }
        System.out.println("Неотсортированная карта имен:");
        System.out.println(countedNames);
        Map<String, Integer> sortedCountedNames = countedNames.entrySet().stream().sorted(Comparator.comparingInt(e->
                -e.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (a, b) -> {throw new AssertionError();}, LinkedHashMap::new));
        System.out.println("Сортированная карта имен: ");
        System.out.println(sortedCountedNames);

    }
}
