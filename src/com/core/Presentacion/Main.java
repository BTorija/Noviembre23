public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Diga su edad: ");
        edad = sc.nextInt();
        if (edad > 17) {
        System.out.println("Puede conducir es mayor de edad");
        } else {
        System.out.println("No puede conducir es menor de edad");
        }

        System.out.println("Ingresos");
        float ingreso = sc.nextFloat();
        System.out.println("Hijos");
        int hijos = sc.nextInt();
        if (ingreso < 19.000 && hijos >= 2) {
        System.out.println("Has sido ayudado");
        } else {
        System.out.println("NOP");

        }


