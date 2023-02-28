package by.teachmeskills.homeworks.hw_03032023.part3;

import java.util.Scanner;

public class Main {
    static Animal[] animal = new Animal[10];
    static int count = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Animal[] animals = new Animal[6];
        animals[0] = new Lion("Lion.jpg", "meat", 5, new Animal.Boundaries(100, 200), new Animal.Location(10, 20));
        animals[1] = new Cat("Cat.jpg", "meat", 3, new Animal.Boundaries(10, 10), new Animal.Location(2, 3));
        animals[2] = new Tiger("Tiger.jpg", "meat", 7, new Animal.Boundaries(120, 200), new Animal.Location(50, 20));
        animals[3] = new Hippo("Hippo.jpg", "grass", 5, new Animal.Boundaries(200, 200), new Animal.Location(100, 100));
        animals[4] = new Wolf("Wolf.jpg", "meat", 4, new Animal.Boundaries(150, 250), new Animal.Location(101, 222));
        animals[5] = new Dog("Dog.jpg", "meat", 3, new Animal.Boundaries(30, 30), new Animal.Location(15, 15));

        for (Animal animal : animals) {
            animal.eat();
            animal.makeNoise();
            animal.roam();
            animal.sleep();
            System.out.println();
        }

        Feline[] felines = new Feline[3];
        felines[0] = new Cat("Cat.jpg", "meat", 3, new Animal.Boundaries(10, 10), new Animal.Location(2, 3));
        felines[1] = new Tiger("Tiger.jpg", "meat", 7, new Animal.Boundaries(120, 200), new Animal.Location(50, 20));
        felines[2] = new Lion("Lion.jpg", "meat", 5, new Animal.Boundaries(100, 200), new Animal.Location(10, 20));

        for (Feline feline : felines) {
            feline.eat();
            feline.makeNoise();
            feline.roam();
            feline.sleep();
            System.out.println();
        }

        Canine[] canines = new Canine[2];
        canines[0] = new Dog("Dog.jpg", "meat", 3, new Animal.Boundaries(30, 30), new Animal.Location(15, 15));
        canines[1] = new Wolf("Wolf.jpg", "meat", 4, new Animal.Boundaries(150, 250), new Animal.Location(101, 222));

        for (Canine canine : canines) {
            canine.eat();
            canine.makeNoise();
            canine.roam();
            canine.sleep();
            System.out.println();
        }

        printMenu();
        while (true) {
            int i = scanner.nextInt();
            if (i == 5) {
                break;
            } else if (i > 5 || i < 0) {
                System.out.println("Ошибка! Нет такой операции.");
            } else
                switch (i) {
                    case 1: {
                        System.out.println("""
                                Введите номер класса животного :\s
                                1 - Lion.
                                2 - Tiger.
                                3 - Cat.
                                4 - Hippo.
                                5 - Wolf.
                                6 - Dog.""");
                        int j = scanner.nextInt();
                        System.out.println("""
                                Введите параметры создаваемого объекта(через 'Enter'):
                                String picture;
                                String food;
                                int hungerLevel;
                                int width;
                                int height;
                                int x;
                                int y;""");
                        String pic = scanner.next();
                        String food = scanner.next();
                        int hungerLevel = scanner.nextInt();
                        int width = scanner.nextInt();
                        int height = scanner.nextInt();
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        printMenu();
                        switch (j) {
                            case 1 -> {
                                Animal lion = new Lion(pic, food, hungerLevel, new Animal.Boundaries(width, height), new Animal.Location(x, y));
                                animal[count] = lion;
                                count++;
                            }
                            case 2 -> {
                                Animal tiger = new Tiger(pic, food, hungerLevel, new Animal.Boundaries(width, height), new Animal.Location(x, y));
                                animal[count] = tiger;
                                count++;
                            }
                            case 3 -> {
                                Animal cat = new Cat(pic, food, hungerLevel, new Animal.Boundaries(width, height), new Animal.Location(x, y));
                                animal[count] = cat;
                                count++;
                            }
                            case 4 -> {
                                Animal hippo = new Hippo(pic, food, hungerLevel, new Animal.Boundaries(width, height), new Animal.Location(x, y));
                                animal[count] = hippo;
                                count++;
                            }
                            case 5 -> {
                                Animal wolf = new Wolf(pic, food, hungerLevel, new Animal.Boundaries(width, height), new Animal.Location(x, y));
                                animal[count] = wolf;
                                count++;
                            }
                            case 6 -> {
                                Animal dog = new Dog(pic, food, hungerLevel, new Animal.Boundaries(width, height), new Animal.Location(x, y));
                                animal[count] = dog;
                                count++;
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Введите имя picture :");
                        String pictureName = scanner.next();
                        for (Animal value : animal) {
                            if (!(value == null) && (value.picture).equals(pictureName)) {
                                value.getInfo();
                                break;

                            } else System.out.println("Нет такого значения picture!");
                            break;
                        }
                        printMenu();
                    }
                    break;
                    case 3: {
                        System.out.println("Введите имя picture :");
                        String pictureName = scanner.next();
                        editFeature(pictureName);
                        printMenu();
                    }
                    case 4: {
                        System.out.println("Введите имя picture :");
                        String pictureName = scanner.next();
                        deleteAnimal(pictureName);
                        printMenu();
                    }
                }
        }
    }

    private static void editFeature(String str) {
        for (Animal value : animal) {
            if (!(value == null) && (value.picture).equals(str)) {
                System.out.println("""
                        Введите номер изменяемой характеристики :\s
                        1 - String picture;
                        2 - String food;
                        3 - int hungerLevel;
                        4 - int width;
                        5 - int height;
                        6 - int x;
                        7 - int y;""");
                int i = scanner.nextInt();
                switch (i) {
                    case 1 -> {
                        System.out.println("Значение picture :");
                        value.picture = scanner.next();
                    }
                    case 2 -> {
                        System.out.println("Значение food :");
                        value.food = scanner.next();
                    }
                    case 3 -> {
                        System.out.println("Значение hungerLevel :");
                        value.hungerLevel = scanner.nextInt();
                    }
                    case 4 -> {
                        System.out.println("Значение width :");
                        value.boundaries.setWidth(scanner.nextInt());
                    }
                    case 5 -> {
                        System.out.println("Значение height :");
                        value.boundaries.setHeight(scanner.nextInt());
                    }
                    case 6 -> {
                        System.out.println("Значение x :");
                        value.location.setX(scanner.nextInt());
                    }
                    case 7 -> {
                        System.out.println("Значение y :");
                        value.location.setY(scanner.nextInt());
                    }
                }
                break;
            } else System.out.println("Нет такого значения picture!");
            break;
        }
    }

    private static void deleteAnimal(String str) {
        for (int i = 0; i < animal.length; i++) {
            if (!(animal[i] == null) && (animal[i].picture).equals(str)) {
                animal[i] = null;
                break;
            } else System.out.println("Нет такого значения picture!");
            break;
        }
    }

    private static void printMenu() {
        System.out.println("""
                Введите номер операции :\s
                1 - Создать животное.
                2 - Вывод информации о животном по картинке.
                3 - Измение характеристики животного по картинке.
                4 - Удаление животного по его картинке.
                5 - Выход.""");
    }
}
