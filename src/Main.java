import java.util.ArrayList;


public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");
    ArrayList<Integer> number = new ArrayList<>();
    number.add(9);
    number.add(8);
    number.add(7);
    number.add(6);
    number.add(5);
    number.add(4);
    number.add(3);

    System.out.println(searchNumber(number, 9));

    //Напишите метод для поиска числа в заранее отсортированном по убыванию списке различных целых чисел.
    //Метод должен вернуть индекс, если элемент найден, и -1, если элемент не найден.
    //Используйте в качестве образца задачу 2 из классной работы.
  }

  public static int searchNumber(ArrayList<Integer> listNumber, int number) {
    int result = -1;
    if (listNumber.isEmpty()) {
      return result;
    } else {
      int mid = listNumber.size() / 2;

      if (listNumber.get(mid - 1) == number) {
        return mid - 1;
      }
      if (listNumber.get(mid-1) > number) {
        for (int i = mid - 1; i < listNumber.size(); i++) {
          if (listNumber.get(i) == number) {
            return i;
          }
        }
      }
      if (listNumber.get(mid-1) < number) {
        for (int i = 0; i < mid - 1; i++) {
          if (listNumber.get(i) == number) {
            return i;
          }
        }
      }
    }
    return result;
  }

}



