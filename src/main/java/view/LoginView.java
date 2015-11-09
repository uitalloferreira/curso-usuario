package view;

import domain.Usuario;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;


@ManagedBean
@SessionScoped
public class LoginView {
    private Usuario usuario;

    public LoginView() {
        this.usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void actionLogin (){
        if (usuario.getLogin().equals("admin") &&
        usuario.getSenha().equals("admin")) {

            try {
                FacesContext
                        .getCurrentInstance()
                        .getExternalContext().redirect("/usuario/usuario.xhtml");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            FacesMessage fc = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Login ou senha invalidos!","Tente novamente");
            FacesContext.getCurrentInstance().addMessage(null,fc);

            FacesContext.getCurrentInstance().addMessage(null,fc);


        }
    }
}
