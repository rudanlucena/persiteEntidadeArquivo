public class Loader {
    public static void main(String[] args){
        Clube vasco = new Clube("vasco da gama", "RJ", "São januario", 1);
        SalvarObjetoArquivo.salvar(vasco, "E:/clube.sav");
    }
}
