package HW6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cats note1 = new Cats("Мейн-кун", "Мальчик", "Белый", 1.6f, 1, "Да");
        Cats note2 = new Cats("Сиамская", "Мальчик", "Черный", 7, 3, "Нет");
        Cats note3 = new Cats("Абисинская", "Мальчик", "Рыжий", 13, 4, "Да");
        Cats note4 = new Cats("Лысая", "Девочка", "Серый", 4.4f, 15, "Да");
        Cats note5 = new Cats("Лысая", "Мальчик", "Белый", 2.8f, 0.5f, "Нет");

        HashSet<Cats> noteSet = new HashSet<>();
        noteSet.add(note1);
        noteSet.add(note2);
        noteSet.add(note3);
        noteSet.add(note4);
        noteSet.add(note5);

        printInfo(noteSet);

        selectNote(noteSet);
    }

    public static void printInfo(HashSet<Cats> set) {
        for (Cats elem : set) {
            System.out.println(elem.getInfo());
            System.out.println();
        }
    }

    public static void selectNote(HashSet<Cats> setNote) {
        Scanner in = new Scanner(System.in);
        System.out.println("Критерии выбора котов:\n" +
                "1 - Порода\n" +
                "2 - Пол\n" +
                "3 - Цвет\n" +
                "4 - Вес\n" +
                "5 - Возраст\n" +
                "6 - Стерилизация");
        int command = in.nextInt();
        if (command == 1) {
            selectBreed(setNote);
        } else if (command == 2) {
            selectGender(setNote);
        } else if (command == 3) {
            selectColor(setNote);
        } else if (command == 4) {
            selectWeight(setNote);
        } else if (command == 5) {
            selectAge(setNote);
        } else if (command == 6) {
            selectSterilized(setNote);
        }
    }

    public static void selectBreed(HashSet<Cats> setNote) {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите нужную компанию:\n" +
                "1 - Мейн-кун\n" +
                "2 - Сиамская\n" +
                "3 - Абисинская\n" +
                "4 - Лысая\n");
        int n = in.nextInt();
        HashMap<Integer, String> bree = new HashMap<Integer, String>();
        bree.put(1, "Мейн-кун");
        bree.put(2, "Сиамская");
        bree.put(3, "Абисинская");
        bree.put(4, "Лысая");
        int i = 1;
        for (Cats elem : setNote) {
            if (elem.getBreed().equals(bree.get(n))) {
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }
    }

    public static void selectGender(HashSet<Cats> setNote) {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите нужный Пол:\n" +
                "1 - Мальчик\n" +
                "2 - Девочка\n");
        int n = in.nextInt();
        HashMap<Integer, String> gend = new HashMap<Integer, String>();
        gend.put(1, "Мальчик");
        gend.put(2, "Девочка");
        int i = 1;
        for (Cats elem : setNote) {
            if (elem.getBreed().equals(gend.get(n))) {
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }
    }

    private static void selectColor(HashSet<Cats> setNote) {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите нужный цвет:\n" +
                "1 - Белый\n" +
                "2 - Черный\n" +
                "3 - Рыжий\n" +
                "4 - Серый\n");
        int n = in.nextInt();
        HashMap<Integer, String> color = new HashMap<Integer, String>();
        color.put(1, "Белый");
        color.put(2, "Черный");
        color.put(3, "Рыжий");
        color.put(4, "Серый");
        int i = 1;
        for (Cats elem : setNote) {
            if (elem.getColor().equals(color.get(n))) {
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }
    }

    public static void selectWeight(HashSet<Cats> setNote) {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите Весовую категорию:\n" +
                "1 - 0 - 3 кг\n" +
                "2 - 3 - 5 кг\n" +
                "3 - 5 - 15 кг\n");
        int n = in.nextInt();
        HashMap<Integer, float[]> weight = new HashMap<Integer, float[]>();
        weight.put(1, new float[] { 0f, 3.0f });
        weight.put(2, new float[] { 3.0001f, 5.0f });
        weight.put(3, new float[] { 5.0001f, 15.0f });
        int i = 1;
        for (Cats elem : setNote) {
            if (weight.get(n)[0] < elem.getWeight() && elem.getWeight() < weight.get(n)[1]) {
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }
    }

    public static void selectAge(HashSet<Cats> setNote) {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите Весовую категорию:\n" +
                "1 - 0 - 3 кг\n" +
                "2 - 3 - 5 кг\n" +
                "3 - 5 - 15 кг\n");
        int n = in.nextInt();
        HashMap<Integer, float[]> age = new HashMap<Integer, float[]>();
        age.put(1, new float[] { 0f, 3.0f });
        age.put(2, new float[] { 3.0001f, 5.0f });
        age.put(3, new float[] { 5.0001f, 15.0f });
        int i = 1;
        for (Cats elem : setNote) {
            if (age.get(n)[0] < elem.getAge() && elem.getAge() < age.get(n)[1]) {
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }
    }

    public static void selectSterilized(HashSet<Cats> setNote) {
        Scanner in = new Scanner(System.in);
        System.out.println("Кот Стерилизован?:\n" +
                "1 - Да\n" +
                "2 - Нет");
        int n = in.nextInt();
        HashMap<Integer, String> ster = new HashMap<Integer, String>();
        ster.put(1, "Да");
        ster.put(2, "Нет");
        int i = 1;
        for (Cats elem : setNote) {
            if (elem.getSterilized() == ster.get(n)) {
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }
    }
}