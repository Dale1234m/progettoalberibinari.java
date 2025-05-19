public class NodoAlberoBinario {

    private Tipo info;
    private NodoAlberoBinario psx;
    private NodoAlberoBinario pdx;

    public NodoAlberoBinario (Tipo info){
        this.info = new Tipo(info);
        psx = null;
        pdx = null;
    }

    public void setInfo(Tipo info){
        this.info = new Tipo(info);
    }

    public Tipo getInfo(){
        return new Tipo(info);
    }

    public void setLeftChild(NodoAlberoBinario psx){
        this.psx = psx;
    }
    public NodoAlberoBinario getLeftChild() {
        return psx;
    } 

    public void setRightChild (NodoAlberoBinario pdx) {
        this.pdx = pdx;
    }

    public NodoAlberoBinario getRightChild(){
        return pdx;
    }
}

public class AlberoBinario{
    private NodoAlberoBinario ptr;
    
    public AlberoBinario(){
        ptr = null;   
    }

    public void setRadice (NodoAlberoBinario Nodo){
        ptr = Nodo;
    }

    public NodoAlberoBinario getRadice(){
         return ptr;
    }

    private void visitaAnticipata(NodoAlberoBinario p){
        if (p==null)
        return ;
        esamina (p.getInfo());
        if (p.getLeftChild() !=null)
        visitaAnticipata (p.getLeftChild ());
        if (p.getRightChild());
        visitaAnticipata (p.getRightChild ());
        public void visitaAnticipata() {
            visitaAnticipata(ptr);
        }

        private void visitaDifferita (NodoAlberoBinario p){
            if (p==null)
            return;
            if (p.getLeftChild() !=null)
            visitaAnticipata (p.getLeftChild ());
            if (p.getRightChild());
            visitaAnticipata (p.getRightChild ());
              esamina (p.getInfo());
                
        }

        public void visitaDifferita(){
            visitaDifferita (ptr);
        }

        private void visitaSimmetrica(NodoAlberoBinario p) {
            if (p==null)
            return;
            if (p.getLeftChild() !=null)
            visitaSimmetrica (p.getLeftChild());
            esamina (p.getInfo());
            if (p.getRightChild() !=null)
            visitaSimmetrica (p.getRightChild());
            
        }

        public void visitaSimmetrica(){
            visitaSimmetrica(ptr);
        }

        public class nodoalberobinario {
            private char Info;
            private NodoAlberoBinario psx;
            private NodoAlberoBinario pdx;
            public NodoAlberoBinario (chat Info) {
            this.Info=Info;
            psx = null;
            pdx = null;
            }
            public void setInfo (char info) {
            this.info = info;
            }
            public char getInfo() {
            return info;
            }
            public void setleftchild (NodoAlberoBinario psx) {
            this.psx = psx;
            }
            public NodoAlberoBinario getLeftChild() {
            return psx;
            }
            public void setRightChild (NodoAlberoBinario pdx) {
            this.pdx = pdx;
            }
            publlc NodoAlberoBinario getRightchild () {
            return pdx;
            }
            }
            aggiungiNodo (n, p.getLeftChild())
            else {
            if (p.getRightChild() == null)
            p.setRightChild (n) ;
            else 
              aggiungiNodo (n, p.getRightChild());
               }
            }
            public void aggiungiNodo (char info) {
            NodoAlberoBinario nodo = new NodoAlberoBinario (info);
            if (ptr == null)
            ptr = new NodoAlberoBinario(info);
            else
             aggiungiNodo (nodo, ptr) ;
            }
    }
