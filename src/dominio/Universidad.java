
package dominio;

import java.util.ArrayList;

public class Universidad {
 private String propierario; 
 private ArrayList<Facultad> facultad;  

    public Universidad(String propierario) {
        facultad = new ArrayList<>();
        this.propierario = propierario;
    }
 
}

