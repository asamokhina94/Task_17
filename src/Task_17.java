import java.io.*;

public class Task_17 {
    public static void main (String[] args){
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Наберите текст для записи в файл и нажмите Enter. Для окончания ввода текста наберите на клавиатуре 'стоп' и нажмите Enter ");
        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("стоп") == 0) break;
                str = str + "\r\n"; //символы перевода строки
                fw.write(str);
            } while (str.compareTo("стоп") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
            }
        }
    }
