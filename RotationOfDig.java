package numberprog;

public class RotationOfDig {
    public static void main(String[] args) {
        int ip = 234;
        int rotations = 5; // You can change the number of rotations as needed

        for (int i = 0; i < rotations; i++) {
            System.out.println("Rotation " + (i + 1) + ": " + rotateDigits(ip));
            ip = rotateDigits(ip); // Set the rotated number as the new input for the next iteration
        }
    }

    static int rotateDigits(int ip) {
        int rem=ip%10;
        int remaining=ip/10;
        int op = rem*(int)Math.pow(10,(int)Math.log10(remaining)+1)+remaining;
		return op;
    }
}
