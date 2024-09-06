public class formasGeometricas {
    public double calculo(float lado){
        return lado * lado;
    }

    public double calculo(double base, double altura){
        return base * altura;
    }
    public double calculo(double raio){
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        formasGeometricas fg = new formasGeometricas();
        System.out.println("Área quadrado: " + fg.calculo(10));
        System.out.println("Área retangulo: " + fg.calculo(30, 50));
        System.out.println("Área circulo: " + fg.calculo(5.00));
    }
}