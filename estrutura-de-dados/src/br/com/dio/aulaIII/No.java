package br.com.dio.aulaIII;

public class No {
    private Object object; //Conteudo do NO. Atributo object.
    private No refNo = null;

    public No() { //construtor
    }

    public No(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + object +
                '}';
    }
}
