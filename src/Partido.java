public class Partido {
    private Equipo local;
    private Equipo visitante;
    private int parteActual;
    private boolean terminado;

    //constructor
    public Partido(Equipo local, Equipo visitante){
        this.local=local;
        this.visitante=visitante;
        this.parteActual=1;
        this.terminado=false;
    }

    //getter porque no me deja acceder a terminado
    public boolean isTerminado(){
        return terminado;
    }

    //metodo para jugar el partido completo
    public void jugarPartido(){
        while(!isTerminado()){
            jugarParte();
        }
    }
    public void jugarParte(){
        System.out.println("Parte: "+parteActual);
        int marcadorLocal = 0;
        int marcadorVisitante = 0;
        //3 ataques por equipo por parte
        for(int i=0; i<3;i++){
            boolean golLocal = local.atacar();
            boolean golVisitante = visitante.atacar();
            if(golLocal){
                System.out.println("GOOOOL de " +local.getNombre());
                marcadorLocal++;
            }
            if(golVisitante){
                System.out.println("GOOOOL de "+ visitante.getNombre());
                marcadorVisitante++;
            }
        }
        parteActual++;
        if(parteActual>2){
            terminado=true;
            System.out.println("Resultado final: "+local.getNombre()+" "+marcadorLocal+ " "+visitante.getNombre()+" "+marcadorVisitante);
            if(marcadorLocal>marcadorVisitante){
                System.out.println("Gana "+local.getNombre());
            } else if (marcadorVisitante>marcadorLocal) {
                System.out.println("Gana "+visitante.getNombre());
            }else{
                System.out.println("Empate");
            }
        }
    }
}
