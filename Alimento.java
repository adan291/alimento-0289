
/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    //Nombre del alimento
    private String nombre;
    //Almacena la cantidad de proteinas del alimento
    private float proteinas;
    //Almacena la cantidad de carbohidratos del alimento
    private float carbohidratos;
    //Almacena la cantidad de grasas del alimento
    private float grasas;
    //Almacena la cantidad de calorias del alimento
    private float calorias;
    //Almacena el componente mayoritario del aliemnto 
    private String comMayo;

    /**
     * Pide los datos del alimento y calcula los porcentajes del alimento y el total de las calorias
     */
    public Alimento(String nombre,float proteinas, float carbohidratos, float grasas)
    {
        this.nombre = nombre;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
        calorias = (proteinas*4) + (carbohidratos*4) + (grasas*9);
        if (proteinas < grasas && carbohidratos < grasas && proteinas != carbohidratos)
        {
            comMayo = "Grasas";
        }
        else if (grasas < proteinas && carbohidratos < proteinas && grasas != carbohidratos)
        {
            comMayo = "Proteinas";
        }
        else if (grasas < carbohidratos && proteinas < carbohidratos && grasas != proteinas)
        {
            comMayo = "Carbohidratos";
        }
        else if ( grasas == carbohidratos && proteinas == carbohidratos)
        {
            comMayo = "Grasas, proteinas y carbohidratos";
        }
        else if ( grasas == carbohidratos)
        {
            comMayo = "Grasas y carbohidratos";
        }
        else if (grasas == proteinas)
        {
            comMayo = "Grasas y proteinas";
        }
        else if (proteinas == carbohidratos)
        {
            comMayo = "Proteinas y carbohidratos";
        }
        
    }
    /**
     *  Muestra todos los datos del alimento
     */
    public void muestraDatos()
    {
        System.out.println("Nombre:                            "+ nombre);
        System.out.println("Proteinas por cada 100 gramos:     "+ proteinas);
        System.out.println("Carbohidratos por cada 100 gramos: "+ carbohidratos);
        System.out.println("Grasas por cada 100 gramos:        "+ grasas);
        System.out.println("Calorias:                          "+ calorias);
        System.out.println("Componente/s mayoritario/s:        "+ comMayo);
    }
    /**
     *  Devuelve las proteinas del alimento
     */
    public float getProteinas()
   {
       return proteinas;
   }
   /**
     *  Devuelve los carbohidratos del alimento
     */
     public float getCarbohidratos()
   {
       return carbohidratos;
   }
   /**
     *  Devuelve las grasas del alimento
     */
     public float getGrasas()
   {
       return grasas;
   }
   /**
     *  Devuelve las calorias del alimento
     */
     public float getCalorias()
   {
       return calorias;
   }
}

