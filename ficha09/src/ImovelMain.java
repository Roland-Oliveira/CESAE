public class ImovelMain {
    public static void main(String[] args) {
        Imovel minhaCasa = new Imovel("Rua Nova do Forno", 42,"Rio Tinto", TipoMoradia.APARTAMENTO,70,2,2,0,Acabamento.USADA);
        Imovel casaDaAvo = new Imovel("Rua das Flroes",50,"Porto",TipoMoradia.CASA,50,1,1,0,Acabamento.NOVA);

        System.out.println(minhaCasa.valorImovel());

        minhaCasa.setAcabamento(Acabamento.NOVA);

        System.out.println(minhaCasa.valorImovel());
        minhaCasa.imprimirDescricao();
        


        minhaCasa.compararImoveis(casaDaAvo);




    }
}

