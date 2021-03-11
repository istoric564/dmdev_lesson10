package Lesson10;
/*
3. Написать функцию, принимающую в качестве параметров имя, фамилию и
отчество и возвращающую инициалы в формате "Ф.И.О".
Учесть, что входные параметры могут быть в любомрегистре,
а результирующая строка должна быть в верхнем.

 */
public class Task3 {
    public static void main(String[] args) {
        String result = format("Vladimir", "Zolotavin", "Sergeevich");
        System.out.println(result);
    }
    private static String format(String firstName, String lastName, String patronymicName){
        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));

        return String.format("%s.%s.%s.",lastNameChar,firstNameChar,patronymicNameChar);

    }
}
