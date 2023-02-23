import java.util.Random;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Mostrar numnero mayor entre dos numeros aleatorios");
        Operaciones oper1 = new Operaciones();
        Random ale =  new Random();

        int num1, num2;
        num1 = ale.nextInt(50);
        num2 = ale.nextInt(50);

        oper1.setNumero1(num1);
        oper1.setNumero2(num2);
        System.out.println(oper1.devolverMayor(num1, num2));
        System.out.println(oper1.devolverMayor(oper1.getNumero1(), oper1.getNumero2()));
    }
}