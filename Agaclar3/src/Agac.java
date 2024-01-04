public class Agac {
    public Agac() {
        root = null;
    }

    DugumSinifi root;

    DugumSinifi newDugum(int sayi){
        DugumSinifi eleman = new DugumSinifi();
        eleman.sayi=sayi;
        root =eleman;
        System.out.println("Ağaca eklendi");
        return  root;
    }
    DugumSinifi ekleme(DugumSinifi root,int sayi){
        if (root != null){
            if (root.sayi > sayi){
                root.left=ekleme(root.left,sayi);
            }else {
                root.right=ekleme(root.right,sayi);
            }
        }else {
            root = newDugum(sayi);
        }
        return  root;
    }
    void preOrder(DugumSinifi root){
        if (root != null){
            System.out.print(root.sayi + "  ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    void inOrder(DugumSinifi root){
        if (root != null){
            inOrder(root.left);
            System.out.print(root.sayi + " ");
            inOrder(root.right);

        }
    }
    void postorder(DugumSinifi root){
        if (root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.sayi +"  ");
        }
    }
    int yukseklik(DugumSinifi root){
       if (root == null){
           return 0;
       }else {
           int sol=0 ; int sag=0;
           sol=yukseklik(root.left);
           sag = yukseklik(root.right);
           if (sol > sag){
               return sol+1;
           }else {
               return sag+1;
           }
       }
    }
    int elemanSayisi(DugumSinifi root){
        if (root == null){
            return 0;
        }else {
            return elemanSayisi(root.left)+1+elemanSayisi(root.right);
        }
    }



}
