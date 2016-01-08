
/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    
    private String nombre;
    private float proteinas;
    private float carbohidratos;
    private float grasas;
    private float calorias;
    private String comMayo;

    /**
     * 
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
    
    public void mestraDatos()
    {
        System.out.println("Nombre:                            "+ nombre);
        System.out.println("Proteinas por cada 100 gramos:     "+ proteinas);
        System.out.println("Carbohidratos por cada 100 gramos: "+ carbohidratos);
        System.out.println("Grasas por cada 100 gramos:        "+ grasas);
        System.out.println("Calorias:                          "+ calorias);
        System.out.println("Componente/s mayoritario/s:        "+ comMayo);
    }
}
