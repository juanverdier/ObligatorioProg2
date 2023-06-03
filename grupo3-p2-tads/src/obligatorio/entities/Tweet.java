package obligatorio.entities;

import uy.edu.um.prog2.adt.lista.ListaEnlazada;
import uy.edu.um.prog2.adt.lista.MyList;

import java.util.Objects;

public class Tweet {

    // Declaro las variables de instancia de la clase.

    private long idTweet;
    private String content;
    private String source;
    private boolean isRetweet = false;

    private User tweetero;

    private MyList<HashTag> hashTagsDelTweeter;


    // Declaro los constructores de la clase.

    public Tweet(long idTweet, String content, String source, boolean isRetweet, User tweetero) {
        this.idTweet = idTweet;
        this.content = content;
        this.source = source;
        this.isRetweet = isRetweet;
        this.tweetero = new User();
        this.hashTagsDelTweeter = new ListaEnlazada<>();
    }

    public Tweet() {
    }



    // Declaro los métodos de la clase

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tweet tweet = (Tweet) o;
        return idTweet == tweet.idTweet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTweet);
    }



    // Getter & Setter


    public long getIdTweet() {
        return idTweet;
    }

    public void setIdTweet(long idTweet) {
        this.idTweet = idTweet;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isRetweet() {
        return isRetweet;
    }

    public void setRetweet(boolean retweet) {
        isRetweet = retweet;
    }

    public User getTweetero() {
        return tweetero;
    }

    public void setTweetero(User tweetero) {
        this.tweetero = tweetero;
    }

    public MyList<HashTag> getHashTagsDelTweeter() {
        return hashTagsDelTweeter;
    }

    public void setHashTagsDelTweeter(MyList<HashTag> hashTagsDelTweeter) {
        this.hashTagsDelTweeter = hashTagsDelTweeter;
    }
}
