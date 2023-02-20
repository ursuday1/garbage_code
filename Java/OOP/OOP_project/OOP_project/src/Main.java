import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Jim", 25,
                new Eye("Right eye", "Normal", "Blue", true),
                new Eye("Left eye", "Short sighted", "Blue", true),
                new Heart("Heart", "Normal", 65),
                new Stomach("Stomach", "PUD", true),
                new Skin("Skin", "burned", "White", 5));
        System.out.println("Patient name : " + patient.getName());
        System.out.println("Age : " + patient.getAge());

        Scanner scan = new Scanner(System.in);
        boolean shouldFinish = false;

        while (!shouldFinish) {
            System.out.println("Choose an Organ: \n" +
                    "1. Left eye \n" +
                    "2. Right eye \n" +
                    "3. Heart \n" +
                    "4. Stomach \n" +
                    "5. Skin \n" +
                    "6. Quit \n");
            int user = scan.nextInt();
            switch (user) {
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpened()) {
                        System.out.println("1. Close the Eye");
                        if (scan.nextInt() == 1) {
                            patient.getLeftEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("1. Close the eye");
                        if (scan.nextInt() == 1) {
                            patient.getLeftEye().close();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened()) {
                        System.out.println("1. Close the Eye");
                        if (scan.nextInt() == 1) {
                            patient.getRightEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("1. Close the eye");
                        if (scan.nextInt() == 1) {
                            patient.getRightEye().close();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("1. Change the heart rate");
                    if (scan.nextInt() == 1) {
                        patient.getHeart().setRate(scan.nextInt());
                        System.out.println("Heart rate set to " + patient.getHeart().getRate());
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("1. Digest");
                    if (scan.nextInt() == 1) {
                        patient.getStomach().digest();
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;
            }
        }
    }
}
