package usuario;

import domain.Usuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class UsuarioListaView {
    private List<Usuario> usuarios;

    public UsuarioListaView(){
        usuarios = initLista();
    }

    private List<Usuario> initLista() {
        Usuario usurio1 = new Usuario();
        usurio1.setLogin("u1");
        usurio1.setNome("Usuarui 1");

        Usuario usurio2 = new Usuario();
        usurio2.setLogin("u2");
        usurio2.setNome("Usuarui 2");

        List<Usuario> us = new ArrayList<Usuario>();
        us.add(usurio1);
        us.add(usurio2);

        return us;
        //return Arrays.asList(usurio1,usurio2);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
