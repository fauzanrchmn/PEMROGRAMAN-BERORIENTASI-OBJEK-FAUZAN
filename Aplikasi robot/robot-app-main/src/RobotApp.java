import java.util.Scanner;

import Model.Layout;
import Model.Position;
import Model.Robot;

public class RobotApp {
    public static void main(String[] args){new RobotApp();}
    
    private Layout layout;
    private Robot robot;
    private Scanner scanner;
    public RobotApp() {
        this.layout = new Layout(10, 10, '*');
        this.robot = new Robot('0', new Position(0,0));
        this.scanner = new Scanner(System.in);
        String instruction = "";
        System.out.println("-------- Permainan Dimulai --------");
        do{
            draw();
            instruction = waitInstruction();
            executeInstruction(instruction);
        }while(!instruction.equals("x"));
        System.out.println("-------- Permainan Selesai --------");
    }
    
    private void executeInstruction(String instruction) {
        if (instruction.length() < 2) {
            System.out.println("Input tidak valid. Masukkan banyaknya langkah!");
            return;
        }

        char arah = instruction.charAt(0);
        int langkah;
        try {
            langkah = Integer.parseInt(instruction.substring(1));
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Masukkan nomor step yang benar!");
            return;
        }

        Position newPosition = new Position(robot.getPosition().getX(), robot.getPosition().getY());
        switch(arah) {
            case 'w':
                newPosition.setX(newPosition.getX() - langkah);
                break;
            case 's':
                newPosition.setX(newPosition.getX() + langkah);
                break;
            case 'a':
                newPosition.setY(newPosition.getY() - langkah);
                break;
            case 'd':
                newPosition.setY(newPosition.getY() + langkah);
                break;
            default:
                System.out.println("Arah tidak valid. Gunakan 'w', 's', 'a', or 'd'.");
                return;
        }

        if(isValidPosition(newPosition)) {
            robot.setPosition(newPosition);
        } else {
            System.out.println("Robot tidak bisa keluar dari area permainan!");
        }
    }

    private boolean isValidPosition(Position pos) {
        return pos.getX() >= 0 && pos.getX() < layout.getMaxX() && pos.getY() >= 0 && pos.getY() < layout.getMaxY();
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("""
                d = kanan
                a = kiri
                w = atas
                s = bawah
                jumlah langkah
                Contoh: w3 berarti 'keatas 3 langkah'
                """);
        System.out.print("Masukan instruksi: ");
        return scanner.nextLine();
    }

    private void draw() {
        System.out.println("------ Posisi Terbaru ------");
        for(int x = 0; x < layout.getMaxX(); x++) {
            for(int y = 0; y < layout.getMaxY(); y++) {
                if(x == robot.getPosition().getX() && y == robot.getPosition().getY()) {
                    System.out.print(robot.getIcon());
                } else {
                    System.out.print(layout.getArea()[x][y]);
                }
            }
            System.out.println();
        }
    }
}