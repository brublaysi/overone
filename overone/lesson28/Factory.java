package by.overone.lesson28;

import java.util.Random;

public class Factory {
    public enum RobotDetails {
        HEAD("Head"),
        BODY("Body"),
        LEFT_HAND("Left hand"),
        RIGHT_HAND("Right hand"),
        LEFT_lEG("Left leg"),
        RIGHT_LEG("Right leg"),
        CPU("CPU"),
        RAM("Ram"),
        HDD("Hdd");

        private String parts;

        RobotDetails(String parts) {
            this.parts = parts;
        }

        @Override
        public String toString() {
            return "Robot Details = " + parts;
        }

        public static RobotDetails[] PartsOfRobot(int n) {
            RobotDetails[] details = RobotDetails.values();
            Random random = new Random();
            RobotDetails[] robotDetails = new RobotDetails[n];
            for (int i = 0; i < n; i++) {
                int index = random.nextInt(details.length);
                robotDetails[i] = details[index];
            }
            for (RobotDetails enums : robotDetails) {
                System.out.println(enums);
            }
            return robotDetails;
        }
    }
}
