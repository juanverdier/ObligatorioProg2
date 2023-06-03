package obligatorio.entities;

import uy.edu.um.prog2.adt.lista.ListaEnlazada;
import uy.edu.um.prog2.adt.lista.MyList;

import java.util.Objects;

public class HashTag {

    // Declaro las variables de instancia de la clase.
    private long idHashTag;
    private String text;

    private MyList<Tweet> tweetersConHashTag;


    // Declaro los constructores de la clase.

    public HashTag(long idHashTag, String text, MyList<Tweet> tweetersConHashTag) {
        this.idHashTag = idHashTag;
        this.text = text;
        this.tweetersConHashTag = new ListaEnlazada<>();
    }

    public HashTag() {
    }


    // Declaro los métodos de la clase

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashTag hashTag = (HashTag) o;
        return idHashTag == hashTag.idHashTag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHashTag);
    }


    // Getter & Setter


    public long getIdHashTag() {
        return idHashTag;
    }

    public void setIdHashTag(long idHashTag) {
        this.idHashTag = idHashTag;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MyList<Tweet> getTweetersConHashTag() {
        return tweetersConHashTag;
    }

    public void setTweetersConHashTag(MyList<Tweet> tweetersConHashTag) {
        this.tweetersConHashTag = tweetersConHashTag;
    }
}
