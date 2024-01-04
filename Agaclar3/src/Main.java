public class Main {
    public static void main(String[] args) {
        Agac agac = new Agac();
        agac.root =agac.ekleme(agac.root,12);
        agac.root =agac.ekleme(agac.root,15);
        agac.root =agac.ekleme(agac.root,7);
        agac.root =agac.ekleme(agac.root,5);
        agac.root =agac.ekleme(agac.root,8);
        agac.root =agac.ekleme(agac.root,16);
        agac.root =agac.ekleme(agac.root,14);
        agac.root=agac.ekleme(agac.root,99);

        System.out.println("Preorder");
        agac.preOrder(agac.root);
        System.out.println();

        System.out.println("İnorder");
        agac.inOrder(agac.root);
        System.out.println();
        System.out.println("Postorder");
        agac.postorder(agac.root);
        System.out.println();
        System.out.println("Ağacın Yüksekliği");
        System.out.println(agac.yukseklik(agac.root));
        System.out.println();
        System.out.println("Eleman Sayısı:");
        System.out.println(agac.elemanSayisi(agac.root));


    }
}