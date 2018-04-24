package boletin.pkg27;

import static GUI.Ventana.calc;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Funciones {

   
    public static String suma2(String suma) {
        String sum="";
       
        String[] parts = suma.split("\\+");
        String part1 = parts[0]; 
        String part2 = parts[1];
        Float num1=Float.parseFloat(part1);
        Float num2=Float.parseFloat(part2);
        Float total=num1+num2;
        sum=total.toString();
        return sum;

    }
    
    public static String resta(String resta){
        
        String re="";
        String[] parts = resta.split("\\-");
        String part1 = parts[0]; 
        String part2 = parts[1];
        Float num1=Float.parseFloat(part1);
        Float num2=Float.parseFloat(part2);
        Float total=num1-num2;
        re=total.toString();
        return re;
    }
    public static String multi(String multi){
        String mu="";
        String[] parts = multi.split("\\*");
        String part1 = parts[0]; 
        String part2 = parts[1];
        Float num1=Float.parseFloat(part1);
        Float num2=Float.parseFloat(part2);
        Float total=num1*num2;
        mu=total.toString();
        return mu;
        
    }
    public static String div(String divi){
        String di="";
        String[] parts = divi.split("\\/");
        String part1 = parts[0]; 
        String part2 = parts[1];
        Float num1=Float.parseFloat(part1);
        Float num2=Float.parseFloat(part2);
        Float total=num1/num2;
        di=total.toString();
        return di;
    }

}
