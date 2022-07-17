import java.util.Arrays;

public class VetorObjetos {


        private Object[] elementos;
        private int tamanho;
        public VetorObjetos(int capacidade) {
            this.elementos = new Object[capacidade];
            this.tamanho = 0;

        }

        public boolean adiciona (Object elemento) {
            if (this.tamanho < this.elementos.length) {
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
                return true;
            }
            return false;
        }

        public void remove(int posicao){
            if(!(posicao>=0 && posicao<tamanho)){
                throw new IllegalArgumentException("Posição inválida");

            }

            for (int i = posicao; i<this.tamanho-1;i++){
                this.elementos[i] = this.elementos[i+1];
            }
            this.tamanho--;

        }

        public Object busca(int posicao) {
            if (!(posicao >= 0 && posicao < tamanho)) {
                throw new IllegalArgumentException("Posição inválida");
            }
            return this.elementos[posicao];
        }

        public int busca(Object elemento){
            for (int i= 0; i < tamanho; i++ ){
                if (elementos[i].equals(elemento)){
                    return i;
                }
            }
            return -1;
        }


        public int tamanho(){
            return this.tamanho;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append("[");

            for (int i = 0; i < this.tamanho-1; i++) {
                s.append(this.elementos[i]);
                s.append(", ");
            }
            if (this.tamanho > 0) {
                s.append(this.elementos[this.tamanho-1]);

            }
            s.append("]");

            return s.toString();
        }
    }



