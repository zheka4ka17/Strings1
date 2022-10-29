import java.util.Arrays;

public class Strings70 {
    /*Дана строка, содержащая латинские буквы и скобки трех ви-
дов: «()», «[]», «{}». Если скобки расставлены правильно (то есть каждой
открывающей соответствует закрывающая скобка того же вида), то выве-
сти число 0. В противном случае вывести или номер позиции, в которой
расположена первая ошибочная скобка, или, если закрывающих скобок
не хватает, число −1*/
    public static void main(String[] args) {

        String str = "Дана строка, содержащая латинские буквы и скобки трех видов: «()», «[]», «{}».";
        char[] chars = new char[str.length()];
        boolean flag = true;
        int count1 = 0;
        int count2= 0;
        int count3=0;
        for (int i = 0; i < str.length(); i++)
            chars[i] = str.charAt(i);
        System.out.println(Arrays.toString(chars));
        for (int k = 0; k < str.length(); k++) {
            for (int j = 0; j < str.length(); j++) {
                if (chars[k] == '(') {
                    count1++;
                    chars[k] = ' ';
                } else if (chars[j] == ')') {
                    count1--;
                    chars[j] = ' ';
                }
                if (chars[k] == '[') {
                    count2++;
                    chars[k] = ' ';
                } else if (chars[j] == ']') {
                    count2--;
                    chars[j] = ' ';
                }
                if (chars[k] == '{') {
                    count3++;
                    chars[k] = ' ';
                } else if (chars[j] == '}') {
                    count3--;
                    chars[j] = ' ';
                }
            }
        }
        System.out.println(Arrays.toString(chars));
        if (count1 == 0 && count2==0 && count3==0)
            System.out.println("0");
        else System.out.println("-1");
    }
}



