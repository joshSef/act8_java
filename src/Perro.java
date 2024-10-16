public class Perro {
    private String N_perro;
    private String R_perro;
    private int E_perro;

    public Perro(String nombre, String raza, int edad) {
        this.N_perro = nombre;
        this.R_perro = raza;
        this.E_perro = edad;
    }
    public String getN_perro() {
        return N_perro;
    }

    public void setN_perro(String n_perro) {
        this.N_perro = n_perro;
    }

    public String getR_perro() {
        return R_perro;
    }

    public void setR_perro(String r_perro) {
        this.R_perro = r_perro;
    }

    public int getE_perro() {
        return E_perro;
    }

    public void setE_perro(int e_perro) {
        this.E_perro = e_perro;
    }

    public void comer(String comida, double cantidad) {
        System.out.println(N_perro + " está comiendo " + cantidad + " gramos de " + comida);
    }

    public String ladrar() {
        return "guau guau";
    }
}
