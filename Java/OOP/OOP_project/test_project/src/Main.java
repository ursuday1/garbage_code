import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Tom", 25,
                new Eye("Left Eye", "Short sighted", "Blue", true),
                new Eye("Right Eye", "Normal", "Blue", true),
                new Heart("Heart", "Normal", 65),
                new Stomach("Stomach", "PUD", true),
                new Skin("Skin", "Burned"));
        System.out.println("Name : " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        Scanner input = new Scanner(System.in);
        boolean shouldFinish = false;

        while (!shouldFinish) {
            System.out.println("Choose an Organ: \n" +
                    "1. Left Eye\n" +
                    "2. Right Eye\n" +
                    "3. Heart\n" +
                    "4. Stomach\n" +
                    "5. Skin\n" +
                    "6. Quit");
            int user = input.nextInt();
            switch (user) {
                case 1:
                    patient.getLeftEye().getDetails();
                    if(patient.getLeftEye().isOpened()) {
                        System.out.println("1. Close the eye");
                        if(input.nextInt() == 1) {
                            patient.getLeftEye().close();
                        } else {
                            continue;
                        }
                    }else {
                        System.out.println("1. Close the eye");
                        if(input.nextInt() == 1) {
                            patient.getLeftEye().close();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if(patient.getRightEye().isOpened()) {
                        System.out.println("1. Close the eye");
                        if (input.nextInt() == 1) {
                            patient.getLeftEye().close();
                        } else {
                            continue;
                        }
                    }else {
                            System.out.println("1. Close the eye");
                            if(input.nextInt()==1) {
                                patient.getLeftEye().close();
                            } else {
                                continue;
                            }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("1. Change rate");
                    if(input.nextInt() == 1) {
                        patient.getHeart().setRate(input.nextInt());
                        System.out.println("Heart rate set to : " + patient.getHeart().getRate());
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    if(patient.getStomach().isEmpty()) {
                        System.out.println("1. Digest");
                        if(input.nextInt() == 1) {
                            patient.getStomach().digest();
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                    break;

                case 5: patient.getSkin().getDetails();
                break;

                case 6: shouldFinish = true;
            }
        }
    }
}


