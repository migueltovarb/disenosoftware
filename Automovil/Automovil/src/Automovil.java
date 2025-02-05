public class Automovil {
    private Motor motor;
    private Chasis chasis;
    private Energia energia;
    private Seguridad seguridad;
    private InterfazUsuario interfazUsuario;
    private Conectividad conectividad;

    public Automovil() {
        this.motor = new Motor();
        this.chasis = new Chasis();
        this.energia = new Energia();
        this.seguridad = new Seguridad();
        this.interfazUsuario = new InterfazUsuario();
        this.conectividad = new Conectividad();
    }

    public void encender() {
        motor.arrancar();
        energia.proveerEnergia();
        seguridad.activarSeguridad();
        System.out.println("El automóvil está encendido.");
    }

    public void conducir() {
        interfazUsuario.mostrarInfo();
        seguridad.controlarFrenos();
        System.out.println("Conduciendo el automóvil.");
    }
}
