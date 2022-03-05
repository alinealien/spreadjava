package br.com.dio.aulaIII;

public class Fila {
    private No refNoEntradaFila = null; //referencia de entrada da fila

    public void enqueue(No novoNo){ //emfilerar
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No dequeue(){ //pega o primeiro item da fila retorna/tira o item da fila. Pega o anterior e retorna.
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila; //Antes do no seguir pro prox, vai guarda-lo no noauxiliar.
            No noAuxiliar = refNoEntradaFila; //recebe ref de entrada. Se estiver correndo em i, mantem-se em i - i.
            while(true){
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public No first(){ //Primeiro da fila
        if(!isEmpty()){ //testar se n esta vazia
            No primeiroNo = refNoEntradaFila;
            while(true){ //loop ate chegar o primeiro da fila
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty(){ //retorna se a fila esta vazia
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() { //Demonstra o funcionamento.
        String stringRetorno = ""; //igual a nada
        No noAuxiliar = refNoEntradaFila; //parece com frist. Entra pelo final da fila e passa por cada no com System.out.prntln

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getObject() +"}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
