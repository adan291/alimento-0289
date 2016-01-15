import java.util.ArrayList;

public class Usuario
{
    //nombre del usuario
    private String nombreCompleto;
    //proteinas  ingeridas por el usuario
    private float proteinasIngeridas;
    //carbohidratos   ingeridas por el usuario
    private float carbohidratosIngeridos;
    //grasas ingeridas por el usuario
    private float grasasIngeridas;
    //calorias totales ingeridas por el usuario
    private float caloriasIngeridas;
    //nombre del alimento mas calorico que ha consumido el usuario
    private String nombreDelAlimentoMasCalorico;
    //calorias del alimento mas calorico consumido por el usuario
    private float caloriasAlimentoMasCalorico;
    //Alimentos consumidos por el ususario
    private ArrayList<Alimento>alimentos;

    /**
     *Constructor de la clase usuario
     */
    public Usuario (String nombreCompleto)
    {
        this.nombreCompleto = nombreCompleto;   
        proteinasIngeridas = 0;
        carbohidratosIngeridos = 0;
        grasasIngeridas = 0;
        caloriasIngeridas = 0;
        nombreDelAlimentoMasCalorico=null;
        caloriasAlimentoMasCalorico=0;
        alimentos = new ArrayList<Alimento>();
    }

    /**
     * Metodo utilizado para dar de comer al usuario
     */
    public void comer(Alimento alimentoQueCome, float gramosDelAlimento)
    {
        proteinasIngeridas = proteinasIngeridas + (alimentoQueCome.getProteinas() / 100 * gramosDelAlimento);
        carbohidratosIngeridos = carbohidratosIngeridos + (alimentoQueCome.getCarbohidratos() / 100 * gramosDelAlimento);
        grasasIngeridas = grasasIngeridas + (alimentoQueCome.getGrasas() / 100 * gramosDelAlimento);
        caloriasIngeridas = caloriasIngeridas + (alimentoQueCome.getCalorias() / 100 * gramosDelAlimento);

        if (caloriasAlimentoMasCalorico<=alimentoQueCome.getCalorias()){
            caloriasAlimentoMasCalorico = alimentoQueCome.getCalorias();
            nombreDelAlimentoMasCalorico = alimentoQueCome.getNombre();
        }
        alimentos.add(alimentoQueCome);
    }

    /**
     * Metodo que muestra el nombre del alimento mas calorico
     */
    public void  nombreDelAlimentoMasCalorico()
    {
        if (nombreDelAlimentoMasCalorico == null){
            System.out.println("No se ha realizado aun ninguna consumicion de alimentos");
        }
        else{
            System.out.println("Alimento más calórico ingerido por este usuario hasta el momento: " + nombreDelAlimentoMasCalorico + " ( " + caloriasAlimentoMasCalorico + " ) " );
        }
    }

    /**
     * Metodo que muestra la informacion de lo ingerido por el usuario.
     */
    public void muestraDatos()
    {
        float totalNutrientes = (proteinasIngeridas + grasasIngeridas + carbohidratosIngeridos) / 100;
        String datosProteinas = "Gramos totales de proteinas ingeridos:     " + proteinasIngeridas;
        String datosCarbohidratos = "Gramos totales de carbohidratos ingeridos: " +             carbohidratosIngeridos;
        String datosGrasas = "Gramos totales de grasas ingeridos:        " + grasasIngeridas;
        if (proteinasIngeridas > 0) {
            datosProteinas = datosProteinas + " (" + proteinasIngeridas / totalNutrientes + "%)";
        }
        if (carbohidratosIngeridos > 0) {
            datosCarbohidratos = datosCarbohidratos + " (" + carbohidratosIngeridos / totalNutrientes + "%      )";
        }
        if (grasasIngeridas > 0) {
            datosGrasas = datosGrasas + " (" + grasasIngeridas / totalNutrientes + "%)";
        }
        System.out.println("Nombre:                                    " + nombreCompleto);
        System.out.println(datosProteinas);    
        System.out.println(datosCarbohidratos);
        System.out.println(datosGrasas);
        System.out.println("Calorias totales ingeridas:                " + caloriasIngeridas);  
    }

    /**
     *  Metodo que devuelve las calorias totales que ha consumido el usuario
     */

    public float getCaloriasIngeridas()
    {
        return caloriasIngeridas;

    } 

    /**
     *  Metodo que devuelve el nombre del usuario
     */

    public String getNombreCompleto()
    {
        return nombreCompleto;

    } 

    /**
     * Metodo que compara las estadisticas de un usuario con otro
     */

    public void comparacion(Usuario segundoUsuario)
    {
        if (caloriasIngeridas > segundoUsuario.getCaloriasIngeridas()){
            System.out.println(nombreCompleto + " Ha consumido mas calorias que " + segundoUsuario.getNombreCompleto() + " ( " + caloriasIngeridas + " Frente " + segundoUsuario.getCaloriasIngeridas() + " ) ");
        }
        else if (caloriasIngeridas < segundoUsuario.getCaloriasIngeridas()){
            System.out.println(nombreCompleto + " Ha consumido menos calorias que " + segundoUsuario.getNombreCompleto() + " ( " + caloriasIngeridas + " Frente " + segundoUsuario.getCaloriasIngeridas() + " ) ");
        }
        else {
            System.out.println(nombreCompleto + " Ha consumido las mismas calorias que " + segundoUsuario.getNombreCompleto() + " ( " + caloriasIngeridas + " Iguales a " + segundoUsuario.getCaloriasIngeridas() + " ) ");
        }
    }

    /**
     * Metodo para mostrar los datos de los alimentos consumidos por alimento elejido
     */
    public void muestraDatosAlimentos(int index)
    {
        index = index - 1;
        if(index >= 0 && index < alimentos.size()) {
            System.out.println("El alimento comido esta en la posicion " + (index+1) + " es: ");
            alimentos.get(index).muestraDatos();
        }
        else{
            System.out.println("La posicion " + (index+1) + " que has elejido no corresponde a ningun alimento");
        }
    }

    /**
     * Metodo que muestras las veces ingeridas un alimento
     */
    public void cantidadDeVecesIngeridas(String nombreAlimento)
    {
        int cont = 0;
        for (Alimento alimentosConsumidos : alimentos)
        {
            if (alimentosConsumidos.getNombre().contains(nombreAlimento))
            {
                cont = cont + 1;
            }
        }
        if (cont == 0)
        {
            System.out.println( "El usuario no ha consumido ese alimento");
        }
		else
		{
			 System.out.println( "El usuario ha consumido "  + nombreAlimento + cont + " vez/veces " );
		}
    }
}