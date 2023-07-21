import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
        public static int[] removeDuplicates(int[] arr) {
            return Arrays.stream(arr).distinct().toArray();
        }

        public static void main(String[] args) {
            int[] arr = {2, 4, 1, 2, 1, 2, 4, 5};

            int[] distinct = removeDuplicates(arr);
            System.out.println(Arrays.toString(distinct));

        //-//-//


    List<String> names = Arrays.asList("John", "Mary", "Peter", "Alice");

    List<String> mNames = names.stream()
            .map(name -> name.substring(1)) // удаление первой буквы из каждого имени

            .sorted() // сортировка списка

            .collect(Collectors.toList());


    System.out.println(mNames); // [Alice, ohn, ary, eter]
}
}


