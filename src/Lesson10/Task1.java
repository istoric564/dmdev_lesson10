package Lesson10;
/*
1.Заменить все грустные смайлы :( в строке на весёлые :)

 */
public class Task1 {
    public static void main(String[] args) {
        String value = " asdasda :) fas :( ;)) sadsa :) :(";
        String result = replace(value);
        System.out.println(result);
    }
    public static String replace(String value){
        return value.replace(":(", ":)");
    }
}
