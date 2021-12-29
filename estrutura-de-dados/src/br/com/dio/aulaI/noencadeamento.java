package br.com.dio.aulaI;

public class noencadeamento {

        private String conteudo;
        private noencadeamento proximoNo;

        public noencadeamento(String conteudo){
            this.proximoNo = null;
            this.conteudo = conteudo;
        }

        public String getConteudo () {
            return conteudo;
        }

        public void setConteudo (String conteudo){

            this.conteudo = conteudo;
        }

        public noencadeamento getProximoNo () {
            return proximoNo;
        }

        public void setProximoNo (noencadeamento proximoNo){

            this.proximoNo = proximoNo;
        }

        @Override
        public String toString () {
            return "noencadeamento{" +
                    "conteudo='" + conteudo + '\'' +
                    //", proximoNo=" + proximoNo +
                    '}';
        }
    }


