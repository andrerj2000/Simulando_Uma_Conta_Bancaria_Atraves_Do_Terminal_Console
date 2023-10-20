public class App {
    public static void main(String[] args) throws Exception {
        
        ContaTerminal cliente01 = new ContaTerminal();
        ContaTerminal cliente02 = new ContaTerminal();

        cliente01.cadastrarCliente();
        cliente02.cadastrarCliente();
       
        cliente01.listaCliente();
        cliente02.listaCliente();
    }
}
