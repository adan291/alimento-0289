
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    //Nombre del usuario
    private String nombre;
    //Almacena la cantidad de proteinas que va ingeriendo el usuario
    private float proteinasUser;
    //Almacena la cantidad de carbohidratos que va ingeriendo el usuario
    private float carbohidratosUser;
    //Almacena la cantidad de grasas que va ingeriendo el usuario
    private float grasasUser;
    //Almacena la cantidad de calorias que va ingeriendo el usuario
    private float caloriasUser;
    /**
     * Constructor que pide el nombre 
     */
    public Usuario (String  nombre)
    {
        this.nombre = nombre;
        proteinasUser = 0;
        carbohidratosUser = 0;
        grasasUser = 0;
        caloriasUser = 0;
    }
    
    /**
     *  Metodo que permite comer un alimento
     */
    public void comer ( Alimento comida, float cantidad)
    {
      proteinasUser = proteinasUser + ((comida.getProteinas()/100)*cantidad);
      carbohidratosUser = carbohidratosUser + ((comida.getCarbohidratos()/100)*cantidad);
      grasasUser = grasasUser + ((comida.getGrasas()/100)*cantidad);
      caloriasUser = caloriasUser + ((comida.getCalorias()/100)*cantidad);
    }
    
    /**
     * Metodo mostrar los datos de la persona con los alimentos ingeridos
     */
    public void MostrarDatos()
    {
       System.out.println("Nombre:                            "         + nombre);
        System.out.println("Gramos totales de proteinas ingeridos: "    + proteinasUser);
        System.out.println("Gramos totales de carbohidratos ingeridos: "+ carbohidratosUser);
        System.out.println("Gramos totales de grasas ingeridos:        "+ grasasUser);
        System.out.println("Calorias totales ingeridas:                "+ caloriasUser);
    }
}
