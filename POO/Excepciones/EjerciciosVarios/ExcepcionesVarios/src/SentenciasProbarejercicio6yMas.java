/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**

 */
public class SentenciasProbarejercicio6yMas {


    public static void main(String[] args) {
        
        /*
        
        Dado el método metodoA de la clase A, indique:
            a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
        sentencia_a1 , sentencia_a2, sentencia_a3, sentencia_a6, sentencia_a5
        sentencia_a1 , sentencia_a2, sentencia_a6, sentencia_a5
        
            b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
        sentencia_a1 , sentencia_a2, sentencia_a3, sentencia_a4, sentencia_a5 
        
        class A {
            public void metodoA() {
                sentencia_a1
                sentencia_a2
                try {
                    sentencia_a3
                    sentencia_a4
                } catch (MioException e){
                    sentencia_a6
                }
                sentencia_a5
            }
        }
        
        */
        
        /*
        
        Dado el método metodoB de la clase B, indique:
            a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
        sentencia_b1, sentencia_b3, sentencia_b4
        
            b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
        sentencia_b1, sentencia_b2, sentencia_b4
        
        class B {
            public void metodoB() {
                sentencia_b1
                try {
                    sentencia_b2
                } catch (MioException e){
                    sentencia_b3
                }
                finally
                    sentencia_b4
            }
        }
        
        */
        
        
        /*
        Ejercicio 8)
        
        class Uno{
            private static int metodo() {
        
                int valor=0;
                try {
                    valor = valor+1;
                    valor = valor + Integer.parseInt (”42”);
                    valor = valor +1;
                    System.out.println(”Valor final del try:” + valor) ;
                } catch (NumberFormatException e) {
                    Valor = valor + Integer.parseInt(”42”);
                    System.out.println(“Valor final del catch:” + valor);
                } finally {
                    valor = valor + 1;
                    System.out.println(”Valor final del finally: ” + valor) ;
                }
                valor = valor +1;
                System.out.println(”Valor antes del return: ” + valor) ;
                return valor;
            }
        
            public static void main (String[] args) {
                try {
                    System.out.println (metodo()) ;
                }catch(Exception e) {
                    System.err.println(”Excepcion en metodo() ”) ;
                    e.printStackTrace();
                }
            }
        }
        
        >> Valor final del try:44
        >> Valor final del finally: 45
        >> Valor antes del return: 46
        >> 46
        
        --------------------------------------------------------------------
        
        class Dos{
        
            private static int metodo() {
                int valor=0;
                try{
                    valor = valor + 1;
                    valor = valor + Integer.parseInt (”W”);
                    valor = valor + 1;
                    System.out.println(”Valor final del try: ” + valor) ;
                } catch ( NumberFormatException e ) {
                    valor = valor + Integer.parseInt (”42”);
                    System.out.println(”Valor final del catch: ” + valor) ;
                } finally {
                    valor = valor + 1;
                    System.out.println(”Valor final del finally: ” + valor) ;
                }
                valor = valor + 1;
                System.out.println(”Valor antes del return: ” + valor) ;
                return valor;
            }
        
            public static void main (String[] args) {
                try{
                    System.out.println ( metodo ( ) ) ;
                } catch(Exception e) {
                    System.err.println ( ” Excepcion en metodo ( ) ” ) ;
                    e.printStackTrace();
                }
            }
        }
        
        >> Valor final del catch: 43
        >> Valor final del finally: 44
        >> Valor antes del return: 45
        >> 45 
        
        ---------------------------------------------------------------------
        
        class Tres{
        
            private static int metodo( ) {
                int valor=0;
                try{
                    valor = valor + 1;
                    valor = valor + Integer.parseInt (”W”);
                    valor = valor + 1;
                    System.out.println(”Valor final del try: ” + valor);
                } catch(NumberFormatException e) {
                    valor = valor + Integer.parseInt (”W”);
                    System.out.println(”Valor final del catch: ” + valor);
                } finally{
                    valor = valor + 1;
                    System.out.println(”Valor final del finally:” + valor);
                }
                valor = valor + 1;
                System.out.println(”Valor antes del return: ” + valor) ;
                return valor;
            }
        
            public static void main (String[] args) {
                try{
                    System.out.println( metodo ( ) ) ;
                } catch(Exception e) {
                    System.err.println(”Excepcion en metodo ( ) ” ) ;
                    e.printStackTrace();
                }
            }
        }
        
        >> Valor final del finally:2
        >> Valor antes del return: 3
        >> Excepcion en metodo ( ) 
        >> java.lang.NumberFormatException: For input string: "W"
        
        */
        
        /*
        Ejercicio 9)
        Dado el método metodoC de la clase C, indique:
            a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
        sentencia_c1, sentencia_c4, sentencia_c6
        sentencia_c1, sentencia_c2, sentencia_c4, sentencia_c6
        
            b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
        sentencia_c1, sentencia_c2, sentencia_c3, sentencia_c6
        
            c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
        sentencia_c1, sentencia_c5, sentencia_c6
        sentencia_c1, sentencia_c2, sentencia_c5, sentencia_c6
        
        -> se ejecutará sentencia_c5 y luego se lanzará nuevamente la misma 
        excepción TuException usando throw (e). Esto significa que la excepción 
        se "relanza" y se propagará hacia arriba en la pila de llamadas, 
        buscando un bloque catch adecuado para manejarla en algún lugar superior.
        
        class C {
            void metodoC() throws TuException{
                sentencia_c1
                try {
                    sentencia_c2
                    sentencia_c3
                } catch (MioException e){
                    sentencia_c4
                } catch (TuException e){
                    sentencia_c5
                    throw (e)
                }
                finally
                    sentencia_c6
            }
        }
        
        
        */
        
    }
    
}
