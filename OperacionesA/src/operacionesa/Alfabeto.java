package operacionesa;

import java.util.*;

public class Alfabeto {
    ArrayList<String> caracteres = new ArrayList<String>();
    
    public void LeerAlfabeto(){
        Boolean fin=true;
        Scanner sc=new Scanner(System.in);
        String elemento;
        int i=0, j=0;
        System.out.println("Teclea los elementos del alfabeto de la siguiente forma:");
        System.out.println("1.- Uno por uno");
        System.out.println("2.- Por rango (A-Z)");
        System.out.println("Cuando termines presiona la tecla +");
            while(fin){
                elemento=sc.nextLine();
                if(elemento.equals("+")){
                    if(caracteres.size()<3){
                        System.out.println("Teclea hasta que existan tres caracteres en el alfabeto");
                    }
                    else{
                        fin=false;
                    }
                }
                 else{
                    //aqui va que no se repiten
                    caracteres.add(elemento);
                    i++;
                }
            }
        
        
        System.out.println("elementos tiene:");
        for(i=0; i<caracteres.size(); i++){
            System.out.println(caracteres.get(i));
        }
    }
}
