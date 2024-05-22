import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Persona {

    // Declaramos los atributos

    private String dni;
    private String correo;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String direccionPostal;
    private String codigoPostal;
    private String telefono;
    private int edad;


    @Override
    public String toString() {
        return "DNI: " + dni + "\n" +
                "Correo: " + correo + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "Dirección Postal: " + direccionPostal + "\n" +
                "Código Postal: " + codigoPostal + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Edad: " + edad;
    }

    /**
     * Modifica el dni del objeto, comprobando si el DNI tiene 8 dígitos
     * @param dni
     * @return
     */
    public boolean setDni(String dni) {
        if (dni.matches("\\d{8}")) {
            this.dni = dni;
            return true;
        } else {
            System.out.println("DNI no válido. Debe tener 8 dígitos.");
            return false;
        }
    }

    /**
     * Modifica el correo del objeto, comprobando si sigue el patrón establecido
     * @param correo
     * @return
     */
    public boolean setCorreo(String correo) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        if (matcher.matches()) {
            this.correo = correo;
            return true;
        } else {
            System.out.println("Correo electrónico no válido.");
            return false;
        }
    }

    /**
     * Modifica la contraseña del objeto, comprobando si esta supera los 8 carácteres
     * @param contrasena
     * @return
     */
    public boolean setContrasena(String contrasena) {
        if (contrasena.length() > 8) {
            this.contrasena = contrasena;
            return true;
        } else {
            System.out.println("Contraseña no válida. Debe tener más de 8 caracteres.");
            return false;
        }
    }
    
    /**
     * Modifica la edad del objeto, comprobando si es mayor de edad
     * @param edad
     * @return
     */
    public boolean setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
            return true;
        } else {
            System.out.println("Debes ser mayor de 18 años.");
            return false;
        }
    }

    // Resto de setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
