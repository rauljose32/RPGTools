package com.example.tablerpg.util;

import java.util.Random;

public class UtilDados {

    public static int lancarDado(int op) {
        int dado = 0;
        switch (op) {

            case 1: /** Rolar dado de 4 lados **/
                dado = new Random().nextInt(4);
                return (dado + 1);
            case 2: /** Rolar dado de 6 lados **/
                dado = new Random().nextInt(6);
                return (dado + 1);
            case 3: /** Rolar dado de 8 lados **/
                dado = new Random().nextInt(8);
                return (dado + 1);
            case 4:/** Rolar dado de 12 lados **/
                dado = new Random().nextInt(12);
                return (dado + 1);
            case 5:/** Rolar dado de 20 lados **/
                dado = new Random().nextInt(20);
                return (dado + 1);
        }

        return 0;
    }

}
