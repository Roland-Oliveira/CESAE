public class ex07 {
    public static void main(String[] args) {

        Livro mobyDick =  new Livro("Moby Dick","Herman Melville","Romance",656,978994314);
        Livro onePiece = new Livro("One Piece","Eiichiro Oda", "Mangá", 21450,156413646);

        mobyDick.exibirDetalhes();
        System.out.println("------------");
        onePiece.exibirDetalhes();




    }
}
