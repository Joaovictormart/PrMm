package Principal;

public class DadosUsuario {

    private String nome_usuario, user, senha;
    private boolean cookieLogin = false;

    //Setters
    public void setUser(String user) {
        this.user = user;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCLogin(boolean cookieLogin) {
        this.cookieLogin = cookieLogin;
    }
    
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    //Getters
    public String getUser() {
        return user;
    }

    public String getSenha() {
        return senha;
    }

    public boolean getCLogin() {
        return cookieLogin;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }
}  
