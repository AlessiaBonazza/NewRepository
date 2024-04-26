abstract class Personaggio {
     private int salute;
        private int energia;
        private int livello;
    
        public Personaggio(int salute, int energia, int livello) {
            this.salute = salute;
            this.energia = energia;
            this.livello = livello;
        }
    
        public abstract void attacca();
        public abstract void difendi();
    
        public int getSalute() {
            return salute;
        }
    
        public int getEnergia() {
            return energia;
        }
    
        public int getLivello() {
            return livello;
        }

        
    }
    class Guerriero extends Personaggio {
        public Guerriero(int salute, int energia, int livello) {
            super(salute, energia, livello);
        }

        @Override 
        //i vari metodi devono essere implementati per ogni classe personaggio
        //override automatico da modificare e rendere adatto a ogni personaggio
        public void attacca() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'attacca'");
        }

        @Override
        public void difendi() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'difendi'");
        }}

        class Mago extends Personaggio {
            public Mago(int salute, int energia, int livello) {
                super(salute, energia, livello);
            }

            @Override
            public void attacca() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'attacca'");
            }

            @Override
            public void difendi() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'difendi'");
            }}
            class Ladro extends Personaggio {
                public Ladro(int salute, int energia, int livello) {
                    super(salute, energia, livello);
                }

                @Override
                public void attacca() {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'attacca'");
                }

                @Override
                public void difendi() {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'difendi'");
                } }
        
    



public class Gioco {
    public static void main(String[] args) {
        
    }
}
