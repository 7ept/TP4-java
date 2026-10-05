package tp4Javapkg;
 
import java.util.ArrayList;
import java.util.List;
 
public class ArbreNaire<T> {
    private Node<T> root;
 
    public ArbreNaire(T data) {
        root = new Node<>(data);
    }
 
    public Node<T> addChild(T data) {
        return root.addChild(data);
    }
 
    public Node<T> getRoot() {
        return root;
    }
 
    public String prefixe() {
        return root.prefixe();
    }
 
    public int taille() {
        return root.taille();
    }
 
    public int hauteur() {
        return root.hauteur();
    }
    public static class Node<T> {
        T data;
        List<Node<T>> children;
 
        public Node(T data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
 
        public Node<T> addChild(T data) {
            Node<T> child = new Node<>(data);
            children.add(child);
            return child;
        }
        
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

}
