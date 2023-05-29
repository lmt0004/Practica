/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadocentornos;

/**
 * La clase Alumno presenta un nombre, dni,telefono, edad, repetido y notas.
 * 
 * @author Lucia Martinez
 * @version 2.0
 * 
 */
public class Alumno {
    /**
    * Indica el nombre del alumno y el dni del alumno.
    */
     private String nombre, dni;
     /**
      * Indica el telefono y la edad del alumno.
      indicamos los cambios
      */
    private int telefono,edad;
    /**
     * Indica con un metodo booleano si el alumno ha repetido o no.
     */
    private boolean repetidor;
    /**
     * Indica las notas del alumno.
     */
    private double [] notas=new double[5];
       
    /**
     * Crea un nuevo objeto con el  nombre, dni,telefono, edad y repetidor
     * 
     * @param nombre el nombre del alumno.
     * @param dni el dni del alumno.
     * @param telefono el telefono del alumno.
     * @param edad la edad del alumno.
     * @param repetidor  si el alumno ha repetido curso o no.
     */
    public Alumno(String nombre, String dni, int telefono, int edad, boolean repetidor) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.edad = edad;
        this.repetidor = repetidor;
    }
    /**
     * Devuelve la cadena que le indicamos en el return, y tambien le añadimos condiciones para que te indique si el alumno es repetidor o no ,se te imprima por pantalla
     * 
     * @return Una cadena que representa el nombre,dni,telefono,edad y si es repetidor actual.
     */

    @Override
    public String toString() {
        String re;
        if(repetidor){
            re="es repetidor";
        }
        else{
            re="no es repetidor";
        }
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", edad=" + edad +" "+ re;
    }
    /**
     * Este metodo inicializa el array de notas con valores aleatorios en el rango de 1 a 5.
     * 
     * @return true si todas las notas se inicializan correctamente, de lo contrario, devuelve false
     */
    public boolean inicializarNotas(){
        int i;
        for(i=0;i<notas.length;i++){
            notas[i]=Math.random()*5+1;
        }
        return true;
    }
    /**
     * calificaciones te reccorre el array de notas y cuando este indica que el numero es mayor o igual que 2.5 se considera aprobado 
     * si este es menor que 2.5 se ejecuuta el else y se consideraria suspenso y con los contadores se cuentan cuantas hay de cada tipo.
     * 
     * @return te devuelve la cadena actual de las aprobadas o suspensas que tiene el alumno en ese momento
     */
    
    public String calificaciones(){
        int aprobadas=0, suspensas=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>=2.5){
                aprobadas++;
            }
            else{
                suspensas++;
            }
        }
        return "El alumno "+this.nombre+" ha aprobado "+aprobadas+" asignaturas y ha suspendido "+suspensas+".\n";
    }
    /**
     * Este método compara la nota media del alumno actual con la nota media de otro alumno.
     * 
     * @param a1  el otro objeto Alumno cuya nota media se va a comparar con la del alumno actual
     */
    
    public void masNotaQue(Alumno a1){
        double nota1=0,nota2=0;
        int i;
        for(i=0;i<this.notas.length;i++){
            nota1+=notas[i];
        }
        for(i=0;i<a1.notas.length;i++){
            nota2+=a1.notas[i];
        }
        nota1=nota1/notas.length;
        nota2=nota2/a1.notas.length;
        
        if(nota1>nota2){
            System.out.printf("%s tiene mayor nota media que %s. La media de %s es %f y la de %s es %f\n", this.nombre,a1.nombre,this.nombre,nota1,a1.nombre,nota2);
        }
        else if(nota1<nota2){
            System.out.printf("%s tiene mayor nota media que %s. La media de %s es %f y la de %s es %f\n", a1.nombre,this.nombre,a1.nombre,nota2,this.nombre,nota1);
        }
        else{
            System.out.printf("%s tiene la misma nota media que %s. La media de %s es %f y la de %s es %f\n", this.nombre,a1.nombre,this.nombre,nota1,a1.nombre,nota2);
        }
    }
    /**
     * Este metodo te hace la division entre dos numeros.
     * 
     * @param a numero 1
     * @param b numero 2
     * @return te devuelve la division entre el numero 1 y el numero 2 actuales
     * @throws ArithmeticException 
     */
    
    public static double dividir(double a, double b) throws ArithmeticException{
        return a/b;
    }
}
