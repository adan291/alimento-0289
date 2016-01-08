
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
    //Almacena el porcentaje de proteinas
    private float porcentProteinasUser;
    //Almacena el porcentaje de proteinas
    private float porcentCarbohidratosUser;
    //Almacena el porcentaje de proteinas
    private float porcentGrasasUser;
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
        porcentProteinasUser = 0;
        porcentCarbohidratosUser = 0;
        porcentGrasasUser = 0;
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
      float totalGramos = proteinasUser + carbohidratosUser + grasasUser;
      porcentProteinasUser = (totalGramos*proteinasUser)/100;
      porcentCarbohidratosUser = (totalGramos*carbohidratosUser)/100;
      porcentGrasasUser = (totalGramos*grasasUser)/100;
      
    }
    
    /**
     * Metodo mostrar los datos de la persona con los alimentos ingeridos
     */
    public void MostrarDatos()
    {
       System.out.println("Nombre:                            "         + nombre);
       System.out.println("Gramos totales de proteinas ingeridos: "    + proteinasUser + " ( " + porcentProteinasUser + " %) ");
       System.out.println("Gramos totales de carbohidratos ingeridos: "+ carbohidratosUser + "(" + porcentCarbohidratosUser + "%)");
       System.out.println("Gramos totales de grasas ingeridos:        "+ grasasUser + "(" + porcentGrasasUser + "%)");
       System.out.println("Calorias totales ingeridas:                "+ caloriasUser);
    }
}
