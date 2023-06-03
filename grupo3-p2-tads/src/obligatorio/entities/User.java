package obligatorio.entities;

import uy.edu.um.prog2.adt.lista.ListaEnlazada;
import uy.edu.um.prog2.adt.lista.MyList;

import java.util.Objects;

public class User implements Comparable {

    // Declaro las variables de instancia de la clase.
    private long idUsuario;
    private String name;
    private MyList<Tweet> listaTweetUsuario;


    // Declaro los constructores de la clase.
    public User(long idUsuario, String name) {
        this.idUsuario = idUsuario;
        this.name = name;
        this.listaTweetUsuario = new ListaEnlazada<>();
    }

    public User() {
    }


    // Declaro los métodos de la clase

    @Override
    public int compareTo(Object o) {
        int comparacion = 0;

        if (o instanceof User) {
            if (this.idUsuario < ((User) o).idUsuario) {
                comparacion = -1;
            }
            else if (this.idUsuario > ((User) o).idUsuario) {
                comparacion = 1;
            }
        }


        return comparacion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return idUsuario == user.idUsuario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario);
    }

    // Getter & Setter


    public long getId() {
        return idUsuario;
    }

    public void setId(long id) {
        this.idUsuario = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyList<Tweet> getListaTweet() {
        return listaTweetUsuario;
    }

    public void setListaTweet(MyList<Tweet> listaTweet) {
        this.listaTweetUsuario   = listaTweet;
    }

}
