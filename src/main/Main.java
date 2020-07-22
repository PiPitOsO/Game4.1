package main;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder log = new StringBuilder();

        File main = new File("src//main");
        if (main.mkdir()) {
            log.append("Каталог main создан в scr\n");
        } else {
            log.append("ФКаталог main не создан\n");
        }

        File test = new File("scr//test");
        if (test.mkdir()) {
            log.append("Каталог test создан в scr\n");
        } else {
            log.append("Каталог test не создан\n");
        }

        File res = new File("res");
        if (res.mkdir()) {
            log.append("Каталог res создан\n");
        } else {
            log.append("Каталог res не создан\n");
        }

        File drawables = new File("res//drawables");
        if (drawables.mkdir()) {
            log.append("Каталог drawables создан в res\n");
        } else {
            log.append("Каталог drawables в res не создан\n");
        }

        File vectors = new File("res//vectors");
        if (vectors.mkdir()) {
            log.append("Каталог vectors создан в res\n");
        } else {
            log.append("Каталог vectors в res не создан\n");
        }

        File icons = new File("res//icons");
        if (icons.mkdir()) {
            log.append("Каталог icons создан в res\n");
        } else {
            log.append("Каталог icons в res не создан\n");
        }

        File savegames = new File("savegames");
        if (savegames.mkdir()) {
            log.append("Каталог savegames создан\n");
        } else {
            log.append("Каталог savegames не создан\n");
        }

        File temp = new File("temp");
        if (temp.mkdir()) {
            log.append("Каталог temp создан\n");
        } else {
            log.append("Каталог temp не создан\n");
        }

        File utils = new File("src//main//Utils.java");
        try {
            if (utils.createNewFile())
                log.append("Файл Utils.java создан\n");
        } catch (IOException ex) {
            log.append("Файл Utils.java не создан\n");
            System.out.println(ex.getMessage());
        }

        File myFile = new File("temp//temp.txt");
        try {
            if (myFile.createNewFile())
                log.append("Файл temp.txt создан\n");
        } catch (IOException ex) {
            log.append("Файл temp.txt не создан\n");
            System.out.println(ex.getMessage());
        }

        String data = log.toString();
        FileWriter nFile = new FileWriter("temp//temp.txt");
        nFile.write(data);
        nFile.close();
    }
}