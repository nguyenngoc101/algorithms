import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        Computer[] computers = getComputers(scanner, n);
        int selectedComputer = -999;
        int minPrice = 99999;
        for (int i = 0; i < n; i++) {
            if(isOk(computers[i], computers)) {
                if (minPrice > computers[i].getPrice()) {
                    minPrice = computers[i].getPrice();
                    selectedComputer = computers[i].getId();
                }
            }
        }

        System.out.println(selectedComputer+1);

    }

    private static Computer[] getComputers(Scanner scanner, int n) {
        Computer[] computers = new Computer[n];
        for (int i = 0; i < n; i++) {
            String[] values = scanner.nextLine().split(" ");
            int id = i;
            int speed = Integer.valueOf(values[0]);
            int hdd = Integer.valueOf(values[1]);
            int ram = Integer.valueOf(values[2]);
            int price = Integer.valueOf(values[3]);

            Computer computer = new Computer(id, speed, hdd, ram, price);
            computers[i] = computer;
        }

        scanner.close();
        return computers;
    }

    public static boolean isOk(Computer computer, Computer[] computers) {
        for (int i = 0; i < computers.length; i++) {
            if(computer.getSpeed() < computers[i].getSpeed()
                    && computer.getHdd() < computers[i].getHdd()
                    && computer.getRam() < computers[i].getRam()) {
                return false;
            }
        }
        return true;
    }


    public static class Computer {

        private int id;
        private int speed;
        private int hdd;
        private int ram;
        private int price;

        public Computer(int id, int speed, int hdd, int ram, int price) {
            this.id = id;
            this.speed = speed;
            this.hdd = hdd;
            this.ram = ram;
            this.price = price;
        }

        public int getPrice() {
            return this.price;
        }

        public int getId() {
            return this.id;
        }

        public int getSpeed() {
            return speed;
        }

        public int getHdd() {
            return hdd;
        }

        public int getRam() {
            return ram;
        }
    }
}
