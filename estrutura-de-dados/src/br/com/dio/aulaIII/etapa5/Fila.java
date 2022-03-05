package br.com.dio.aulaIII.etapa5;

    public class Fila<T> {

        private No<T> refNoEntradaFila5;

        public Fila() {
            this.refNoEntradaFila5 = null;
        }

        public void enqueue(T object){
            No novoNo = new No(object);
            novoNo.setRefNo(refNoEntradaFila5);
            refNoEntradaFila5 = novoNo;
        }

        public T first(){
            if(!this.isEmpty()){
                No primeiroNo = refNoEntradaFila5;
                while (true){
                    if(primeiroNo.getRefNo() != null){
                        primeiroNo = primeiroNo.getRefNo();
                    }else{
                        break;
                    }
                }
                return (T) primeiroNo.getObject();
            }
            return null;
        }

        public T dequeue(){
            if(!this.isEmpty()){
                No primeiroNo = refNoEntradaFila5;
                No noAuxiliar = refNoEntradaFila5;
                while (true){
                    if(primeiroNo.getRefNo() != null){
                        noAuxiliar = primeiroNo;
                        primeiroNo = primeiroNo.getRefNo();
                    }else{
                        noAuxiliar.setRefNo(null);
                        break;
                    }
                }
                return (T) primeiroNo.getObject();
            }
            return null;
        }

        public boolean isEmpty(){
            return refNoEntradaFila5 == null? true : false;
        }

        @Override
        public String toString() {
            String stringRetorno = "";
            No noAuxiliar = refNoEntradaFila5;

            if(refNoEntradaFila5 != null){
                while (true){
                    stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
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
