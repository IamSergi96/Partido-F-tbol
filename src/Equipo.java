import java.util.Random;

public class Equipo{
    private String nombre;
    private int nivelAtaque, nivelDefensa, nivelMedio;

    //getters i setters:
    public String getNombre() {
        return nombre;
    }

    //constructor
    public Equipo(String nombre, int nivelAtaque, int nivelDefensa, int nivelMedio){
        this.nombre=nombre;
        this.nivelAtaque=nivelMedio;
        this.nivelDefensa=nivelDefensa;
        this.nivelMedio=nivelMedio;
    }

    //funcion atacar
    public boolean atacar(){
        Random random = new Random();
        if ((this.nivelAtaque *(int) (Math.random()*2)) + ((this.nivelMedio * (int) (Math.random()*2))/2) > 70){
            return true;
        }
        return false;
        //sera exitoso (true) si el resultado chance es mayor de 70
    }
}
