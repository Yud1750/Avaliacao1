import java.util.Scanner;
public class Atividade1{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("digite as 8 notas anuais");
        System.out.println("digite a 1 nota");
        double nota1=scanner .nextDouble();
        System.out.println("digite a 2 nota");
        double nota2=scanner.nextDouble();
        System.out.println("digite a 3 nota");
        double nota3=scanner.nextDouble();
        System.out.println("digite a 4 nota");
        double nota4=scanner.nextDouble();
        System.out.println("digite a 5 nota");
        double nota5= scanner.nextDouble();
        System.out.println("digite a 6 nota");
        double nota6= scanner.nextDouble();
        System.out.println("digite a 7 nota");
        double nota7= scanner.nextDouble();
        System.out.println("digite a 8 nota");
        double nota8= scanner.nextDouble();
        double bimestre1=(nota1+nota2)/2;
        double bimestre2=(nota3+nota4)/2;
        double bimestre3=(nota5+nota6)/2;
        double bimestre4=(nota7+nota8)/2;
        double semestre1=(bimestre1+bimestre2)/2;
        double semestre2=(bimestre3+bimestre4)/2;
        double mediafinal = (semestre1+semestre2)/2;
        System.out.println("1Bimestre:"+bimestre1);
        System.out.println("2Bimestre:"+bimestre2);
        System.out.println("1semestre:"+semestre1);
        System.out.println("__________________");
        System.out.println("3Bimestre:"+bimestre3);
        System.out.println("4Bimestre:"+bimestre4);
        System.out.println("2semestre:"+semestre2);
        System.out.println("______________");
        System.out.println("mediafinal:"+mediafinal);
    }
}