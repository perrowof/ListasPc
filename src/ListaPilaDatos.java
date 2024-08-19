import java.util.Stack;

public class ListaPilaDatos {
    Stack<Usuario> personas = new Stack<>();

    public void apilar(Usuario person) {
        personas.add(person);
    }

    public String desapilar(){
        if (personas.isEmpty()){
            System.out.println("Esta lista esta Vacia");
            return null;
        }
        String delete = personas.remove(personas.size()-1).toString();
        return delete;
    }

    public void mostrarDatos(){
        for (int i = 0; i < personas.size(); i++){
            System.out.println(personas.get(i) + " ");
        }
    }

    public int numeroDatos(){
        return personas.size();
    }
}
