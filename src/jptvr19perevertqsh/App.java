/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19perevertqsh;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    public void run() {
        System.out.println("---Перевертыш---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку символов");
        String str = scanner.nextLine();
        System.out.println("В этой строке символов: " + str.length());

    }
}
