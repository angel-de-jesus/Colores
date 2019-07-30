import java.util.Scanner;
public class Color{
    public static int convertir(String color1)
    {
        String digits = "0123456789ABCDEF";
        color1 = color1.toUpperCase();
        int val = 0;
        for (int i = 0; i < color1.length(); i++)
        {
            char c = color1.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
     public static int convertir2(String color2)
    {
        String digits = "0123456789ABCDEF";
        color2 = color2.toUpperCase();
        int val = 0;
        for (int i = 0; i < color2.length(); i++)
        {
            char c = color2.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
     public static int convertir3(String color3)
    {
        String digits = "0123456789ABCDEF";
        color3 = color3.toUpperCase();
        int val = 0;
        for (int i = 0; i < color3.length(); i++)
        {
            char c = color3.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
     public static int convertir4(String color1)
    {
        String digits = "0123456789ABCDEF";
        color1 = color1.toUpperCase();
        int val = 0;
        for (int i = 0; i < color1.length(); i++)
        {
            char c = color1.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
     public static int convertir5(String color2)
    {
        String digits = "0123456789ABCDEF";
        color2 = color2.toUpperCase();
        int val = 0;
        for (int i = 0; i < color2.length(); i++)
        {
            char c = color2.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
     public static int convertir6(String color3)
    {
        String digits = "0123456789ABCDEF";
        color3 = color3.toUpperCase();
        int val = 0;
        for (int i = 0; i < color3.length(); i++)
        {
            char c = color3.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
    public static void main(String args[])
    {
        String color1;
        String color2;
        String array[];
        String array2[];
        array= new String[6];
        array2= new String[6];
        int aux;
        int aux2;
        int aux3;
        int aux4;
        int aux5;
        int aux6;
        Scanner scan = new Scanner(System.in);
        Boolean opcion=true;
		do{
            System.out.println("--------------------------------------");
            System.out.print("color1: ");
            color1 = scan.nextLine();
            System.out.print("color2: ");
            color2 = scan.nextLine();
            System.out.println("--------------------------------------");
            array=color1.split("");
            array2=color2.split("");
            String param1=array[0]+array[1];
            String param2=array2[0]+array2[1];
            String param3=array[2]+array[3];
            String param4=array2[2]+array2[3];
            String param5=array[4]+array[5];
            String param6=array2[4]+array2[5];
            aux = convertir(param1);
            aux2= convertir2(param2);
            aux3=convertir3(param3);
            aux4 = convertir4(param4);
            aux5= convertir5(param5);
            aux6=convertir6(param6);

            int suma = aux+aux2;
            suma=suma/2;
            int suma2=aux3+aux4;
            suma2=suma2/2;
            int suma3 = aux5+aux6;
            suma3=suma3/2;
            // String resultado=sumasuma2suma3;
            String hexadecimal = Integer.toHexString(suma);
            String hexadecimal2 = Integer.toHexString(suma2);
            String hexadecimal3 = Integer.toHexString(suma3);
            System.out.println(" Nuevo Color :"+ hexadecimal+""+hexadecimal2+""+hexadecimal3);
            System.out.println("\n--------------------------------------");
            System.out.println("iniciar de nuevo");
            System.out.println("1.-si       2.-no");
            System.out.println("--------------------------------------");
            System.out.print("opcion: ");
            int op = scan.nextInt();
            scan.nextLine();
            System.out.println("--------------------------------------");
            if(op==1){
                opcion = true;
            }else{
                opcion=false;
            }
        }while(opcion==true);
       

    }
}