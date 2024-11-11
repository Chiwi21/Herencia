package udla.achiguano.herencia;

public class PrincipalHerencia  {
    Persona persona = new Persona();
    //Por defecto le crea el constructor
    Alumno alumno = new Alumno;
    Profesor profesor = new Profesor();

    //Forma no tan recomendada: Es cambiar a protected los atributos para cambiar los valores de los atributos en el main, pero SOLO saldrán los atributos de la clase padre.
    // alumno.apellido    (No es bueno por el principio de ocultamiento)
    Persona alumno = new Alumno();   //Esto es posible por el extend, instancia alumno en la clase padre Persona
}
