package vocals;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Vocals {
     public boolean esVocal(String lletra) { 	// rep una lletra
        if (lletra.length() != 1) { 	// si lletra no t� longitud 1
            return false; 	// no �s una lletra
        }
        String vocals = "aeiouAEIOU"; 	// cadenes amb les vocals
        for (int i = 0; i < vocals.length(); i++) { 	// recorre les vocals
            if(vocals.substring(i, i+1).equals(lletra)){ 	// si la subcadena de 1 car�cter �s la lletra
                return true; 	// �s una vocal
            }
        }
        return false;
    }
}

