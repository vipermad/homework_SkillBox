public class Main {

  public static void main(String[] args) {
    Container container = new Container();
    container.count += 7843;

    int sum = sumDigits(7843);

    System.out.println(sum);
  }

  /* Реализуйте метод sumDigits который возвращает сумму цифр числа, пример:
  передано 12345, метод должен вернуть 15
  если передано null, то должен вернуть -1

  Запустите тесты TestSumDigits для проверки корректности работы метода

  не меняйте название метода, его возвращаемое значение и модификаторы доступа (public).
  В противном случае тестовый метод не сможет проверить ваш код
   */

  public static int sumDigits(Integer number) {
    //@TODO: write code here and delete TODO line
    if (number != null) {
      int sumNumbers = 0;
      for (int i = 0; i < number.toString().length(); i++) {
        char symbol = number.toString().charAt(i);
        //sumNumbers += Integer.parseInt(String.valueOf(symbol));
        sumNumbers += Character.digit(symbol, 10);
      }
      return sumNumbers;
    } else {
      return -1;
    }
  }
}
