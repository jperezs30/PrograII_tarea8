public class Test {
    public Test() {
        Alumno alumno1 = new Alumno("0001","Luis Pérez",22);
        Alumno alumno2 = new Alumno("0002","María García", 18);

        System.out.println("Alumno 1 es igual a alumno 2: " + alumno1.igualQue(alumno2));
        System.out.println("Alumno 1 es menor a alumno 2: " + alumno1.menorQue(alumno2));
        System.out.println("Alumno 1 es menor o igual a alumno 2: " + alumno1.menorIgualQue(alumno2));
        System.out.println("Alumno 1 es mayor a alumno 2: " + alumno1.mayorQue(alumno2));
        System.out.println("Alumno 1 es mayor o igual a alumno 2: " + alumno1.mayorIgualQue(alumno2));

        Producto producto1 = new Producto(1, "Producto 1",50.50);
        Producto producto2 = new Producto(2, "Producto 2",100.25);

        System.out.println("Producto 1 es igual a producto 2: " + producto1.igualQue(producto2));
        System.out.println("Producto 1 es menor a producto 2: " + producto1.menorQue(producto2));
        System.out.println("Producto 1 es menor o igual a producto 2: " + producto1.menorIgualQue(producto2));
        System.out.println("Producto 1 es mayor a producto 2: " + producto1.mayorQue(producto2));
        System.out.println("Producto 1 es mayor o igual a producto 2: " + producto1.mayorIgualQue(producto2));
    }

}