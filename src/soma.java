public class soma {
    public double oepracao(int a,int b){
        return a + b;
    }

    public double operacao(double a, double b){
        return  a + b;
    }

    public static void main(String[] args) {
        soma calc = new soma();
        System.out.println("Soma com numeros inteiros: " + calc.oepracao(10,50));
        System.out.println("Soma com numeros decimais: " + calc.operacao(10.51, 9.99));
    }
}