import static java.lang.Math.sqrt;

public class Pythagorean {
    public double calculteHypotenuse(int legA, int legB){
        int squareLegA = legA * legA;
        int squareLegB = legB * legB;
        int squareLegC = squareLegA + squareLegB;
        double legC = Math.sqrt(squareLegC);
        System.out.println(legC);
        return legC;
    }
}