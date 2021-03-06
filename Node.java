
@SuppressWarnings("rawtypes")
// Noeud d'un graphe
class Node implements Comparable {

  final int id; // identifiant
  final int val; // valeur

  // constructeur
  Node(int i, int v){
    id = i;
    val = v;
  }

  // fonction de comparaison
  public int compareTo(Object o1) {
    Node n = (Node) o1;
    if (this.val == n.val) return (this.id - n.id);
    return this.val - n.val;
  }
}
