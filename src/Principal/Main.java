package Principal;

import View.Login;
import View.FinCompra;
import View.Catalogo;
import View.Cadastro;
import View.NovaHome;
import View.BingBang;

public class Main {

    public static void main(String[] args) {
        
        Login jLogin = new Login();
        Catalogo jCatalogo = new Catalogo();
        Cadastro jCadastro = new Cadastro();
        BingBang jProduto = new BingBang();
        FinCompra jFinCompra = new FinCompra();
        DadosUsuario Dados = new DadosUsuario();
        NovaHome mb = new NovaHome();
        
        jCadastro.setVisible(true);
        
        //jCatalogo.setVisible(true);
    }

}
