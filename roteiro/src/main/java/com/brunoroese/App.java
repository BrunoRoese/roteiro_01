package com.brunoroese;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do professor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite os anos de experiência do professor: ");
        int anosExp = scanner.nextInt();

        Professor professor = new Professor(nome, anosExp);

        System.out.println(professor);
    }
}
