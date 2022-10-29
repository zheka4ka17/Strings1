import java.io.OptionalDataException;

public class String68 {
    /*Дана строка, содержащая цифры и строчные латинские буквы. Если
буквы в строке упорядочены по алфавиту, то вывести 0; в противном
случае вывести номер первого символа строки, нарушающего алфавитный
порядок.*/
    public static void main(String[] args) {
        String str = "Дана строка, содержащая цифры и строчные латинские буквы";
        String str1 = str.toLowerCase();
        int x = 'а';
        int y = ' ';
        String str2 = "";
        char [] c = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            c[i]= str1.charAt(i);
            if ((int)c[i]>=(int)'а'&& (int)c[i]<=(int)'я')
                 str2+=c[i];
        }
        System.out.println(str2);
        System.out.println(Exam(str2));
        }
        static int Exam(String s) {
        int size = s.length();
        int index = 0;
        char[] chars = new char[size];
        for (int i = 0; i < size; i++)
            chars[i] = s.charAt(i);
        for (int j = 0; j < size-1; j++){
            if ((int) (chars[j]) > (int) (chars[j + 1]) && (index==0)){
                index = j + 1;
                return index;}}
        return index;


    }}






