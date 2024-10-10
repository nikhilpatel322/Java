import java.util.Random;

class RandomNumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(100);
            System.out.println("Generated Number: " + randomNumber);

            if (randomNumber % 2 == 0) {
                new SquareThread(randomNumber).start();
            } else {
                new CubeThread(randomNumber).start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class SquareThread extends Thread {
    private int number;

    SquareThread(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

class CubeThread extends Thread {
    private int number;

    CubeThread(int number) {
        this.number = number;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is: " + cube);
    }
}

public class MultithreadedProgram {
    public static void main(String[] args) {
        RandomNumberGenerator randomGenerator = new RandomNumberGenerator();
        randomGenerator.start();
    }
}
