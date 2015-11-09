package usuario;

import domain.Usuario;

import javax.faces.bean.*;

@ManagedBean
@ViewScoped
public class UsuarioDetalhesView {
    private Usuario usuario;

    @ManagedProperty(value = "#{usuarioListaView}")
    private UsuarioListaView usuarioListaView;
    private boolean render_table_2;



    public UsuarioDetalhesView() {
        this.usuario = new Usuario();
        render_table_2 = true;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isRender_table_2() {
        return render_table_2;
    }

    public void setRender_table_2(boolean render_table_2) {
        this.render_table_2 = render_table_2;
    }

    public void actionSalvar(){
        usuarioListaView.addUsuario(usuario);
        System.out.println(usuario);
    }


    public UsuarioListaView getUsuarioListaView() {
        return usuarioListaView;
    }

    public void setUsuarioListaView(UsuarioListaView usuarioListaView) {
        this.usuarioListaView = usuarioListaView;
    }
}
