//
//import Entity.AbordajeNutricional;
//import Entity.Adulto;
//import Entity.AdultoMayor;
//import Entity.Familia;
//import Entity.Integrante;
//import Entity.Joven;
//import Entity.Ninio;
//import Entity.ProblemaSalud;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ServicioFamilia {
//
//    Scanner sc = new Scanner(System.in);
//
//    public Familia crearFamilia() {
//        System.out.println("Direccion:");
//        String direccion = sc.next();
//        System.out.println("IDE");
//        int IDE = sc.nextInt();
//        System.out.println("Numero de Lote");
//        int NroLote = sc.nextInt();
//        System.out.println("Barrio");
//        String barrio = sc.next();
//        System.out.println("Localidad:");
//        String localidad = sc.next();
//        System.out.println("Contiene mejoras en su hogar:");
//        String contiene = sc.next();
//        boolean contieneSoN = false;
//        if (contiene.equalsIgnoreCase("si")) {
//            contieneSoN = true;
//        }
//        ArrayList<Integer> factoresRiesgo =FactorRiesgo();
//        ArrayList<Integrante> integrantes= Integrantes();
//        return new Familia(direccion, IDE, NroLote, barrio, localidad, contieneSoN, factoresRiesgo, integrantes);
//    }
//
//    public ArrayList<Integer> FactorRiesgo() {
//        ArrayList<Integer> factores = new ArrayList();
//        System.out.println(" Ingrese cuantos factores de riesgo posee:");
//        int cantFactores = sc.nextInt();
//        int nroFactor = 0;
//
//        for (int i = 1; i <= cantFactores; i++) {
//            System.out.println("Ingrese el factor " + i);
//            nroFactor = sc.nextInt();
//            factores.add(nroFactor);
//        }
//        return factores;
//
//    }
//
//    public ArrayList<Integrante> Integrantes() {
//        ArrayList<Integrante> integrantes = new ArrayList();
//        System.out.println(" Ingrese la cantidad de integrantes que posee la familia:");
//        int cantIntegrantes = sc.nextInt();
//        Integrante inte = null;
//
//        for (int i = 1; i <= cantIntegrantes; i++) {
//            System.out.println("Complete los datos del integrante numero " + i);
//            System.out.println("Ingrese 1 si es Ninio");
//            System.out.println("Ingrese 2 si es Joven");
//            System.out.println("Ingrese 3 si es Adulto");
//            System.out.println("Ingrese 4 si es Adulto Mayor");
//            int opcion = sc.nextInt();
//
//            switch (opcion) {
//                case 1:
//                    inte = crearNinio();
//
//                    break;
//
//                case 2:
//                    inte = crearJoven();
//
//                    break;
//                case 3:
//                    inte = crearAdulto();
//
//                    break;
//                case 4:
//                    inte = crearAdultoMayor();
//
//                    break;
//                default:
//                    System.out.println("La opcion ingresada no es correcta");
//                    break;
//
//            }
//            integrantes.add(inte);
//        }
//        return integrantes;
//    }
////     protected String direccion;
////    protected Integer IDE;
////    protected Integer nroLote;
////    protected String barrio;
////    protected String localidad;
////    protected boolean mejora;
////    protected ArrayList factorRiesgo;
////    protected ArrayList<Integrante> integrantes;
//
//    public Ninio crearNinio() {
//        System.out.println("Complete los siguientes datos:");
//        System.out.println("Nombre:");
//        String nombre = sc.next();
//        System.out.println("Apellido:");
//        String Apellido = sc.next();
//        System.out.println("Sexo:");
//        String sexo = sc.next();
//        System.out.println("Vinculo:");
//        String vinculo = sc.next();
//        System.out.println("DNI");
//        int dni = sc.nextInt();
//        System.out.println("Numero de orden:");
//        int NroOrden = sc.nextInt();
//        System.out.println("Fecha de nacimiento:");
//        int FechaN = sc.nextInt();
//        System.out.println("Problema de salud:");
//        String tieneProblemas = sc.next();
//        ProblemaSalud problemasalud;
//        if (tieneProblemas.equalsIgnoreCase("si")) {
//            problemasalud = crearProblemaSalud(NroOrden);
//        } else {
//            problemasalud = new ProblemaSalud();
//        }
//        System.out.println("Abordaje nutricional:");
//        String abordaje = sc.next();
//        AbordajeNutricional abordajeN;
//        if (abordaje.equalsIgnoreCase("si")) {
//            abordajeN = crearAbordajeNutricional(NroOrden);
//        } else {
//            abordajeN = new AbordajeNutricional();
//        }
//        return new Ninio(nombre, Apellido, sexo, vinculo, dni, NroOrden, sexo, problemasalud, abordajeN);
//    }
//
//    public Adulto crearAdulto() {
//        System.out.println("Complete los siguientes datos:");
//        System.out.println("Nombre:");
//        String nombre = sc.next();
//        System.out.println("Apellido:");
//        String Apellido = sc.next();
//        System.out.println("Sexo:");
//        String sexo = sc.next();
//        System.out.println("Vinculo:");
//        String vinculo = sc.next();
//        System.out.println("DNI");
//        int dni = sc.nextInt();
//        System.out.println("Numero de orden:");
//        int NroOrden = sc.nextInt();
//        System.out.println("Fecha de nacimiento:");
//        int FechaN = sc.nextInt();
//        System.out.println("Problema de salud:");
//        String tieneProblemas = sc.next();
//        ProblemaSalud problemasalud;
//        if (tieneProblemas.equalsIgnoreCase("si")) {
//            problemasalud = crearProblemaSalud(NroOrden);
//        } else {
//            problemasalud = new ProblemaSalud();
//        }
//        System.out.println("Abordaje nutricional:");
//        String abordaje = sc.next();
//        AbordajeNutricional abordajeN;
//        if (abordaje.equalsIgnoreCase("si")) {
//            abordajeN = crearAbordajeNutricional(NroOrden);
//        } else {
//            abordajeN = new AbordajeNutricional();
//        }
//        System.out.println("Estudia:");
//        String estudia = sc.next();
//        boolean estudiante = false;
//        if (estudia.equalsIgnoreCase("si")) {
//            estudiante = true;
//        }
//        System.out.println("Deporte:");
//        String hace = sc.next();
//        boolean deportista = false;
//        if (hace.equalsIgnoreCase("si")) {
//            deportista = true;
//        }
//        System.out.println("Trabaja formalmente:");
//        String trabaja = sc.next();
//        boolean trabajador = false;
//        if (trabaja.equalsIgnoreCase("si")) {
//            trabajador = true;
//        }
//        System.out.println("Obra social:");
//        String tiene = sc.next();
//        boolean sitiene = false;
//        if (tiene.equalsIgnoreCase("si")) {
//            sitiene = true;
//        }
//        return new Adulto(estudiante, trabajador, sitiene, deportista, nombre, Apellido, sexo, vinculo, dni, NroOrden, trabaja, problemasalud, abordajeN);
//    }
//
//    public Joven crearJoven() {
//        System.out.println("Complete los siguientes datos:");
//        System.out.println("Nombre:");
//        String nombre = sc.next();
//        System.out.println("Apellido:");
//        String Apellido = sc.next();
//        System.out.println("Sexo:");
//        String sexo = sc.next();
//        System.out.println("Vinculo:");
//        String vinculo = sc.next();
//        System.out.println("DNI");
//        int dni = sc.nextInt();
//        System.out.println("Numero de orden:");
//        int NroOrden = sc.nextInt();
//        System.out.println("Fecha de nacimiento:");
//        int FechaN = sc.nextInt();
//        System.out.println("Problema de salud:");
//        String tieneProblemas = sc.next();
//        ProblemaSalud problemasalud;
//        if (tieneProblemas.equalsIgnoreCase("si")) {
//            problemasalud = crearProblemaSalud(NroOrden);
//        } else {
//            problemasalud = new ProblemaSalud();
//        }
//        System.out.println("Abordaje nutricional:");
//        String abordaje = sc.next();
//        AbordajeNutricional abordajeN;
//        if (abordaje.equalsIgnoreCase("si")) {
//            abordajeN = crearAbordajeNutricional(NroOrden);
//        } else {
//            abordajeN = new AbordajeNutricional();
//        }
//        System.out.println("Estudia:");
//        String estudia = sc.next();
//        boolean estudiante = false;
//        if (estudia.equalsIgnoreCase("si")) {
//            estudiante = true;
//        }
//        System.out.println("Deporte:");
//        String hace = sc.next();
//        boolean deportista = false;
//        if (hace.equalsIgnoreCase("si")) {
//            deportista = true;
//        }
//        System.out.println("Trabaja formalmente:");
//        String trabaja = sc.next();
//        boolean trabajador = false;
//        if (trabaja.equalsIgnoreCase("si")) {
//            trabajador = true;
//        }
//        return new Joven(nombre, Apellido, sexo, vinculo, dni, NroOrden, trabaja, problemasalud, abordajeN, estudiante, deportista, trabajador);
//    }
//
//    public AdultoMayor crearAdultoMayor() {
//        System.out.println("Complete los siguientes datos:");
//        System.out.println("Nombre:");
//        String nombre = sc.next();
//        System.out.println("Apellido:");
//        String Apellido = sc.next();
//        System.out.println("Sexo:");
//        String sexo = sc.next();
//        System.out.println("Vinculo:");
//        String vinculo = sc.next();
//        System.out.println("DNI");
//        int dni = sc.nextInt();
//        System.out.println("Numero de orden:");
//        int NroOrden = sc.nextInt();
//        System.out.println("Fecha de nacimiento:");
//        int FechaN = sc.nextInt();
//        System.out.println("Problema de salud:");
//        String tieneProblemas = sc.next();
//        ProblemaSalud problemasalud;
//        if (tieneProblemas.equalsIgnoreCase("si")) {
//            problemasalud = crearProblemaSalud(NroOrden);
//        } else {
//            problemasalud = new ProblemaSalud();
//        }
//        System.out.println("Abordaje nutricional:");
//        String abordaje = sc.next();
//        AbordajeNutricional abordajeN;
//        if (abordaje.equalsIgnoreCase("si")) {
//            abordajeN = crearAbordajeNutricional(NroOrden);
//        } else {
//            abordajeN = new AbordajeNutricional();
//        }
//        System.out.println("Jubilado:");
//        String esjubilado = sc.next();
//        boolean jubilado = false;
//        if (esjubilado.equalsIgnoreCase("si")) {
//            jubilado = true;
//        }
//        return new AdultoMayor(jubilado, nombre, Apellido, sexo, vinculo, dni, NroOrden, sexo, problemasalud, abordajeN);
//    }
//
//    public ProblemaSalud crearProblemaSalud(int NroOrden) {
//        System.out.println("IDE");
//        int IDE = sc.nextInt();
//        System.out.println("Tiene hipertension:");
//        String tiene = sc.next();
//        boolean HTA = false;
//        if (tiene.equalsIgnoreCase("si")) {
//            HTA = true;
//        }
//        System.out.println("Tiene diabetes:");
//        String tieneD = sc.next();
//        boolean DBT = false;
//        if (tieneD.equalsIgnoreCase("si")) {
//            DBT = true;
//        }
//        return new ProblemaSalud(NroOrden, IDE, HTA, DBT);
//    }
//
//    public AbordajeNutricional crearAbordajeNutricional(int NroOrden) {
//        System.out.println("Edad");
//        int edad = sc.nextInt();
//        System.out.println("Peso:");
//        int peso = sc.nextInt();
//        System.out.println("Eutrofico");
//        String esEutrofico = sc.next();
//        boolean eutrofico = false;
//        if (esEutrofico.equalsIgnoreCase("si")) {
//            eutrofico = true;
//        }
//        System.out.println("Bajo peso:");
//        String bajo = sc.next();
//        boolean bajopeso = false;
//        if (bajo.equalsIgnoreCase("si")) {
//            bajopeso = true;
//        }
//        System.out.println("Sobre peso:");
//        String sobre = sc.next();
//        boolean sobrepeso = false;
//        if (sobre.equalsIgnoreCase("si")) {
//            sobrepeso = true;
//        }
//        return new AbordajeNutricional(NroOrden, edad, peso, eutrofico, bajopeso, sobrepeso);
//    }
//
//}
