public class Main {
    public static void main(String[] args) {
       Persona persona = new Persona();
       persona.setEdad (24);
       System.out.println("Edad:" +" "+ persona.getEdad());

       persona.setNombre("Oriana");
       System.out.println("Nombre:"+" "+ persona.getNombre());

       persona.setTelefono("343060321");
       System.out.println("Telefono:"+" "+persona.getTelefono());
    }
}

class Persona {
    private int edad;
    public void setEdad (int edad) {
        this.edad = edad;
    }
    public int getEdad (){
        return this.edad;
    }
    private String nombre;
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public String getNombre () {
        return this.nombre;
    }
    private String telefono;
        public void setTelefono (String telefono){
            this.telefono = telefono;
        }
        public String getTelefono (){
            return this.telefono;
        }


}