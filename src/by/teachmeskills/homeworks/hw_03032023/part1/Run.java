package by.teachmeskills.homeworks.hw_03032023.part1;

import by.teachmeskills.homeworks.hw_03032023.part1.hands.SamsungHand;
import by.teachmeskills.homeworks.hw_03032023.part1.hands.SonyHand;
import by.teachmeskills.homeworks.hw_03032023.part1.hands.ToshibaHand;
import by.teachmeskills.homeworks.hw_03032023.part1.heads.SamsungHead;
import by.teachmeskills.homeworks.hw_03032023.part1.heads.SonyHead;
import by.teachmeskills.homeworks.hw_03032023.part1.heads.ToshibaHead;
import by.teachmeskills.homeworks.hw_03032023.part1.legs.SamsungLeg;
import by.teachmeskills.homeworks.hw_03032023.part1.legs.SonyLeg;
import by.teachmeskills.homeworks.hw_03032023.part1.legs.ToshibaLeg;
import by.teachmeskills.homeworks.hw_03032023.part1.robot.Robot;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SamsungHead(80), new SonyHand(200), new ToshibaLeg(99));
        Robot robot2 = new Robot(new SonyHead(101), new ToshibaHand(122), new SamsungLeg(103));
        Robot robot3 = new Robot(new ToshibaHead(523), new SamsungHand(304), new SonyLeg(44));

        robot1.action();
        robot2.action();
        robot3.action();

        Robot[] robots = {robot1, robot2, robot3};
        int maxPrice = 0;
        int ordinalNum = 0;
        for (int i = 0; i < robots.length; i++) {
            if (maxPrice < robots[i].getPrice()) {
                maxPrice = robots[i].getPrice();
                ordinalNum = i + 1;
            }
        }
        System.out.printf("Самый дорогой робот : robot%d.", ordinalNum);
    }
}
