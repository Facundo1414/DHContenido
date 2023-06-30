public class Main {
    public static void main(String[] args) {
        // Un vagón con un rectángulo de 5 x 4 y 3 circulos de 1 y calcular la superficie total.
        Rectangulo rectangulo1 = new Rectangulo(5,4);Circulo circulo1 =new Circulo(1);
        Vagon vagon = new Vagon();
        vagon.createVagon(rectangulo1);vagon.createVagon(circulo1);vagon.createVagon(circulo1);vagon.createVagon(circulo1);vagon.createVagon(circulo1);
        System.out.println("Superficie Total del Vagon es: " + vagon.calculoDeSuperficie());

        //Una locomotora con un rectángulo de 6 x 4 x 3, dos círculos de 1, un triángulo de 2 x 2 y calcular la superficie total de la locomotora.
        Rectangulo rectangulo2 = new Rectangulo(6,6);Rectangulo rectangulo3 = new Rectangulo(6,4);Rectangulo rectangulo4 = new Rectangulo(6,3);Circulo circulo2 =new Circulo(1);Triangulo triangulo1 = new Triangulo(2,2);
        Locomotora locomotora = new Locomotora();
        locomotora.createlocomotora(rectangulo2);locomotora.createlocomotora(rectangulo3);locomotora.createlocomotora(rectangulo4);locomotora.createlocomotora(circulo2);locomotora.createlocomotora(circulo2);locomotora.createlocomotora(triangulo1);
        System.out.println("Superficie Total de la Locomotora es: " + locomotora.calculoDeSuperficie());

        // Tren de una locomotora y 3 Vagones
        Tren tren = new Tren();
        tren.addItem(locomotora);tren.addItem(vagon);tren.addItem(vagon);tren.addItem(vagon);
        System.out.println("Superficie Total del Tren es: " + tren.calculoDeSuperficie());
    }
}