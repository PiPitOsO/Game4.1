package main;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        File main = new File("src//main");
        if (main.mkdir()) {
            sb.append("Каталог main создан в scr\n");
        } else {
            sb.append("ФКаталог main не создан\n");
        }

        File test = new File("scr//test");
        if (test.mkdir()) {
            sb.append("Каталог test создан в scr\n");
    } else {
            sb.append("Каталог test не создан\n");
    }

        File res = new File("res");
        if (res.mkdir()) {
            sb.append("Каталог res создан\n");
        } else {
            sb.append("Каталог res не создан\n");
        }

        File drawables = new File("res//drawables");
        if (drawables.mkdir()) {
            sb.append("Каталог drawables создан в res\n");
        } else {
            sb.append("Каталог drawables в res не создан\n");
        }

        File vectors = new File("res//vectors");
        if (vectors.mkdir()) {
            sb.append("Каталог vectors создан в res\n");
        } else {
            sb.append("Каталог vectors в res не создан\n");
        }

        File icons = new File("res//icons");
        if (icons.mkdir()) {
            sb.append("Каталог icons создан в res\n");
        } else {
            sb.append("Каталог icons в res не создан\n");
        }

        File savegames = new File("savegames");
        if (savegames.mkdir()) {
            sb.append("Каталог savegames создан\n");
        } else {
            sb.append("Каталог savegames не создан\n");
        }

        File temp = new File("temp");
        if (temp.mkdir()) {
            sb.append("Каталог temp создан\n");
        } else {
            sb.append("Каталог temp не создан\n");
        }

        File utils = new File("src//main//Utils.java");
        try {
            if (utils.createNewFile())
                sb.append("Файл Utils.java создан\n");
        } catch (IOException ex) {
            sb.append("Файл Utils.java не создан\n");
            System.out.println(ex.getMessage());
        }

        File myFile = new File("temp//temp.txt");
        try {
            if (myFile.createNewFile())
                sb.append("Файл temp.txt создан\n");
        } catch (IOException ex) {
            sb.append("Файл temp.txt не создан\n");
            System.out.println(ex.getMessage());
        }

        String data = sb.toString();
        FileWriter nFile = new FileWriter("temp//temp.txt");
        nFile.write(data);
        nFile.close();
    }
}