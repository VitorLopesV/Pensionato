package main;

import entities.Register;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //CRIANDO VETOR DO OBJETO REGISTER E PERGUTANDO QUANTOS QUARTOS SERÃO ALUGADOS
        Register[] rooms = new Register[10];

        System.out.print("How many rooms will be rented? ");
        int rentedRooms = sc.nextInt(); //VARIÁVEL LOCAL QUE VAI RECEBER O NÚMERO DE QUARTOS ALUGADOS
        System.out.print("\n");
        System.out.print("\n");

        //INICANDO O A CONDIÇÃO DE REPETIÇÃO QUE VAI RECEBER OS DADOS DE TODOS OS ALUNOS E VAI ALOCALOS NOS QUARTOS
        for(int i = 1; i <= rentedRooms; i++){
            System.out.println("Rent #" + i + ":");
            System.out.print("Type your name: ");
            sc.nextLine();
            String name = sc.nextLine(); //VARIÁVEL LOCAL QUE VAI ARMAZENAR OS NOMES DOS ALUNOS

            System.out.print("Type your e-mail: ");
            String email = sc.nextLine(); //VARIÁVEL LOCAL QUE VAI ARMAZENAR O EMAIL DOS ALUNOS

            System.out.print("Wich room do you want ? ");
            int roomNumber = sc.nextInt(); //VARIÁVEL LOCAL QUE VAI RECEBER O NÚMERO DO QUARTO DOS ALUNOS
            System.out.print("\n");

            Register register = new Register(name, email);

            rooms[roomNumber] = register;
        }
            //PRINTANDO NA TELA OS QUARTOS QUE ESTÃO PREENCHIDOS E DOS DADOS DOS ALUNOS QUE ESTÃO ALOJADOS
            System.out.println();
            System.out.println("Busy rooms");
            for(int i = 0; i< 10 ; i++){
                if(rooms[i] != null){
                System.out.println( i + ": " + rooms[i]);

                }
            }

    }
}

