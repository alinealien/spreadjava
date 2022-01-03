package br.com.dio.aulaI;

//Classe criada referente a aula Refatoração da Classe NO.
//Aqui com o No<T> ele vai aceitar todos os tipos genericos

//Refatoração da classe NO
public class No<T> { //1ºTornou ela generica
    private T conteudo; //comparado ao noencadeamento, aqui o String saiu. No<T> tipo generico, aceita qualquer tipo n so o String.
    private No<T> proximoNo;

    public No(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo () {
        return conteudo;
    }

    public void setConteudo (T conteudo){

        this.conteudo = conteudo;
    }

    public No<T> getProximoNo () {
        return proximoNo;
    }

    public void setProximoNo (No<T> proximoNo){

        this.proximoNo = proximoNo;
    }

    @Override
    public String toString () {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                //", proximoNo=" + proximoNo +
                '}';
    }
}

