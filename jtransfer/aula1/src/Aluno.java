/* encapsulamento */
//public *é pra todos*
//private
//protected *só algumas pessoas*
//package
public class Aluno { //classe

//variáveis = atributos
//características
private String nome;//atributo do tipo Texto
private int idade;//atributo do tipo Número
private boolean temFaculdade;//atributo do tipo Booleano (0 e 1 ou true or false)

public Aluno(){

}
public Aluno(String nome,int idade,boolean temFaculdade){
    this.nome = nome;
    this.idade = idade;
    this.temFaculdade = temFaculdade;
}
public String getNome(){//metodo para pegar o nome
    return nome;
}
public int getIdade(){//método para pegar idade
    return idade;
}
public boolean getTemFaculdade(){//metodo para pegar temFaculdade
    return temFaculdade;
}
//classes Wrappers
/* 
* Considerando a explicação do professor:
* tipo primtivo x classes wrappers
*
* Você tem que descobrir quantos alunos 
* tem faculdade (sim ou não)
* sim/não - 0 ou 1
* Como declarar um atributo booleano?*/

}
