package tp4Javapkg;

public class ArbreClass<T> {
    private Node<T> root;

    public ArbreClass(T data) {
        root = new Node(data);
    }

    public void addLeft(T data) {
        root.addLeft(data);
    }

    public void addRight(T data) {
        root.addRight(data);
    }

    private static class Node<T>{
        T data;
        Node<T> nG, nD;

        public String prefixe() {
            StringBuilder sb = new StringBuilder();
            if (data != null) {
                sb.append(data.toString());
            }
            if (nG != null) {
                sb.append(nG.prefixe());
            }
            if(nD != null) {
                sb.append(nD.prefixe());
            }
            return sb.toString()
;        }

        public void addLeft(T data) {
            nG= new Node(data);
         }

        public void addRight(T data) {
            nD= new Node(data);
        }

        public Node(T data) {
            this.data = data;
        }
    }
    
    public static void main(String[] args) {
        ArbreClass<String> monArbre = new ArbreClass("7");
        monArbre.addLeft("4");
        monArbre.addRight("13");
    }
}
