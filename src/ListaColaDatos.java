import java.util.LinkedList;
import java.util.Queue;

public class ListaColaDatos {
    Queue<Usuario> usuarios = new LinkedList<>();

    public Queue<Usuario> getUsuarios() {
        return usuarios;
    }

    public void ingresarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public String eliminarDatosUsuario() {
        if (usuarios.isEmpty()) {
            System.out.println("la lista tipo cola esta Vacia");
            return null;
        }
        String usuarioEliminado = usuarios.poll().toString();
        return usuarioEliminado;
    }

    public void visualizar() {
        LinkedList<Usuario> temp = new LinkedList<>(usuarios);
        for (int i = temp.size() - 1; i >= 0; i--) {
            System.out.println(temp.get(i) + " ");
        }
    }
}
