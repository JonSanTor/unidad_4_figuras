public class Rectangulo {
    private double lado1, lado2;
    public Rectangulo(double l1, double l2){
        lado1 = l1;
        lado2 = l2;
    }
    public double obtenerArea(){
        return lado1 * lado2;
    }
    public double obtenerPerimetro(){
        return (lado1*2) + (lado2*2);
    }
    public void mostrarRectangulo(){
        //Este método enseñara el Rectángulo
    }
}