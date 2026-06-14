import java.util.Scanner;


public class SphereCalculator
{
    public static void main(String[] args) 
    {
        try (Scanner kbd = new Scanner(System.in)) {
            
            /* Input processing */
            System.out.print("Enter the sphere's radius: ");
            double sphereRadius = kbd.nextDouble();

            double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3.0);
            System.out.printf("Volume: %.4f\n", + sphereVolume);
            
            double sphereSurfaceArea = 4.0 * Math.PI * Math.pow(sphereRadius, 2.0);
            System.out.printf("Surface area: %.4f\n", + sphereSurfaceArea);

            kbd.close();
        }
    }
}