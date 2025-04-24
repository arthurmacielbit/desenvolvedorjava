
/* testando código */
// import java.io.FileWriter; //Classe para escrever no arquivo
// import java.io.IOException; // classe para tratar exceções do arquivo
// import java.util.Scanner;

import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variáveis
        String nome;// referência 
        int opcaoTransporte;// camelCasting
        String meioTransporte = "";

        // classe para teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("==Pesquisa de Transporte Diário");
        System.out.println("Digite seu nome");
        nome = scanner.nextLine();
        System.out.println(nome);
        System.out.println("Como você vai ao trabalho?");
        System.out.println("1-Metrô");
        System.out.println("2-Ônibus");
        System.out.println("3-Caminhada");
        System.out.println("4-Uber");
        System.out.println("5-Táxi");
        System.out.println("6-Carro");
        System.out.println("Escolha uma opção (1-6)");
 
    //exercício
    //faça como eu fiz
    //leia a opcaoTransporte e mostre a opção lida
    // casting (conversão) - texto/número
       opcaoTransporte = scanner.nextInt();

       switch(opcaoTransporte){
           case 1:
           meioTransporte = "Metrô";break;
           case 2:
           meioTransporte = "Ônibus";break;
           case 3:
           meioTransporte = "Caminhada";break;
           case 4:
           meioTransporte = "Uber";break;
           case 5:
           meioTransporte = "Táxi";break;
           case 6:
           meioTransporte = "Carro";break; 

       }
//task de amanhã: salvar os dados no arquivo. 
//Task no GitHub (Git e Github)
       System.out.println("Nome:"+nome+","+"Meio do Transporte: "+meioTransporte);
       try(FileWriter escritor = new FileWriter("dados.txt",true)) {
            escritor.write(nome+","+meioTransporte+"\n");
            System.out.println("gravado com sucesso!");
           
       } catch (Exception e) {
        System.out.println("Erro ao gravar os dados"+e.getMessage());
       }
      /*  try(FileWriter escritor = new FileWriter(fileName:"dados.txt")) {
        
            escritor.write(nome+","+meioTransporte+"\n");
            System.out.println("dados gravados com sucesso");

       }catch(IOException e){ 
            System.out.println("Erro ao gravar os dados"+e.getMessage());
       }*/
    

    }
}
